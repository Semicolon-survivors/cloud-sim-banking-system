package com.cloudsimbank.transaction_service.controller;

import com.cloudsimbank.transaction_service.dto.TransactionRequest;
import com.cloudsimbank.transaction_service.model.Transaction;
import com.cloudsimbank.transaction_service.model.TransactionDirection;
import com.cloudsimbank.transaction_service.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionRepository repository;
    private final RestTemplate restTemplate;

    @Value("${account-service.url}")
    private String accountServiceUrl;

    public TransactionController(TransactionRepository repository,
                                 RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public List<Transaction> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody TransactionRequest request) {

        if (request.getAmount() == null ||
                request.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            return ResponseEntity.badRequest()
                    .body(Map.of("error", "Amount must be > 0"));
        }

        if (request.getDirection() == null) {
            return ResponseEntity.badRequest()
                    .body(Map.of("error", "Direction required"));
        }

        // Verify account exists
        try {
            restTemplate.getForEntity(
                    accountServiceUrl + "/accounts/" + request.getAccountId(),
                    Object.class
            );
        } catch (HttpClientErrorException.NotFound ex) {
            return ResponseEntity.badRequest()
                    .body(Map.of("error", "Account not found"));
        }

        TransactionDirection direction =
                TransactionDirection.valueOf(request.getDirection().toUpperCase());

        Transaction transaction = new Transaction(
                request.getAccountId(),
                request.getAmount(),
                request.getType(),
                direction
        );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(repository.save(transaction));
    }
}

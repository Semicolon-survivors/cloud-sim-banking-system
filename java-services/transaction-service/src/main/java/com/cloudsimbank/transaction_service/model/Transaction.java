package com.cloudsimbank.transaction_service.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long accountId;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(nullable = false)
    private String type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionDirection direction;

    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    protected Transaction() {}

    public Transaction(Long accountId,
                       BigDecimal amount,
                       String type,
                       TransactionDirection direction) {
        this.accountId = accountId;
        this.amount = amount;
        this.type = type;
        this.direction = direction;
    }

    @PrePersist
    public void onCreate() {
        this.createdAt = Instant.now();
    }

    public Long getId() { return id; }
    public Long getAccountId() { return accountId; }
    public BigDecimal getAmount() { return amount; }
    public String getType() { return type; }
    public TransactionDirection getDirection() { return direction; }
    public Instant getCreatedAt() { return createdAt; }
}

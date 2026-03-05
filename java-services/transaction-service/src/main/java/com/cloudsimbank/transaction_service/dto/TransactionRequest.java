package com.cloudsimbank.transaction_service.dto;

import java.math.BigDecimal;

public class TransactionRequest {

    private Long accountId;
    private BigDecimal amount;
    private String type;
    private String direction;

    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }
}

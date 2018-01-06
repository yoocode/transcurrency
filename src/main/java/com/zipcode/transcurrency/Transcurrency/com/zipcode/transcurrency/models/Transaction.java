package com.zipcode.transcurrency.Transcurrency.com.zipcode.transcurrency.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;

    private Long sourceId;
    private Long destinationId;
    private Long transactionId;
    private Long sourceAccountId;
    private Long destinationAccountId;


    public Transaction(){}

    public Transaction(Long transactionId) {
        this.transactionId = transactionId;
    }
    
    public Transaction(Long sourceId, Long destinationId, Long transactionId, Long sourceAccountId, Long destinationAccountId) {
        this.sourceId = sourceId;
        this.destinationId = destinationId;
        this.transactionId = transactionId;
        this.sourceAccountId = sourceAccountId;
        this.destinationAccountId = destinationAccountId;
    }

    public Long getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(Long sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public Long getDestinationAccountId() {
        return destinationAccountId;
    }

    public void setDestinationAccountId(Long destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getAccountId() {
        return sourceAccountId;
    }

    public void setAccountId(Long accountId) {
        this.sourceAccountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(sourceId, that.sourceId) &&
                Objects.equals(destinationId, that.destinationId) &&
                Objects.equals(transactionId, that.transactionId) &&
                Objects.equals(sourceAccountId, that.sourceAccountId) &&
                Objects.equals(destinationAccountId, that.destinationAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sourceId, destinationId, transactionId, sourceAccountId, destinationAccountId);
    }

    //    public void send(Long destinationId, Long sourceID, BigDecimal amount) {
//
//    }
//
//    public void request(Long sourceID, Long destinationId, BigDecimal amount, String message) {
//
//    }
//
//    public UserProfile find(Long destinationId) {
//        return new UserProfile();
//    }
}

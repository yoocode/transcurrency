package com.zipcode.transcurrency.Transcurrency.com.zipcode.transcurrency.models;

import java.math.BigDecimal;

public class Transactions {

    private Long sourceID;
    private Long destinationID;
    private Long transactionID;
    private Long accountID;

    public Long getSourceID() {
        return sourceID;
    }

    public void setSourceID(Long sourceID) {
        this.sourceID = sourceID;
    }

    public Long getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(Long destinationID) {
        this.destinationID = destinationID;
    }

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public void send(Long destinationID, Long sourceID, BigDecimal amount) {

    }

    public void request(Long sourceID, Long destinationID, BigDecimal amount, String message) {

    }

    public UserProfile find(Long destinationID) {
        return new UserProfile();
    }
}

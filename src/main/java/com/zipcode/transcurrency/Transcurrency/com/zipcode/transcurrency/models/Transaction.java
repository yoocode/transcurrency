package com.zipcode.transcurrency.Transcurrency.com.zipcode.transcurrency.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;

    private Transfer transfer;

    public Transaction(){}

    public Transaction(Transfer transfer){
        this.transfer = transfer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
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

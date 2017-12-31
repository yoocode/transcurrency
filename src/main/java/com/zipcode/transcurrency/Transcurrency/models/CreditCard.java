package com.zipcode.transcurrency.Transcurrency.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cardName;
    private int cardNumber;
    private String expDate;
    private int cvv;

    public CreditCard(){

    }

    public CreditCard(Long id, String cardName, int cardNumber, String expDate, int cvv){
        this.id = id;
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.cvv = cvv;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }


}

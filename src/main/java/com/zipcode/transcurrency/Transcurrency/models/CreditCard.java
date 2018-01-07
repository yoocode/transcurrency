package com.zipcode.transcurrency.Transcurrency.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long creditCardId;
    private String cardName;
    private int cardNumber;
    private String expDate;
    private int cvv;

    public CreditCard(){

    }

    public CreditCard(Long CreditCardId, String cardName, int cardNumber, String expDate, int cvv){
        this.creditCardId = CreditCardId;
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.cvv = cvv;

    }

    public Long getCreditCardIdId() {
        return creditCardId;
    }

    public void setId(Long CreditCardId) {
        this.creditCardId = CreditCardId;
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

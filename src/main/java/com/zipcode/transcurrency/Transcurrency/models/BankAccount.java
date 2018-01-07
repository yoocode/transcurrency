package com.zipcode.transcurrency.Transcurrency.models;


import javax.persistence.*;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "BANK_ACCT_ID")
    private Long bankAccountId;
    private int accountNumber;
    private int routingNumber;
    private String bankName;

    public BankAccount(){

    }

    public BankAccount(Long bankAccountId, int accountNumber, int routingNumber, String bankName){
        this.bankAccountId = bankAccountId;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.bankName = bankName;
    }

    public long getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(Long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void transferTo(BankAccount toBankAccount, double amount) {
    }
}

package com.zipcode.transcurrency.Transcurrency.modelsTests;

import com.zipcode.transcurrency.Transcurrency.models.BankAccount;

public class BankAccountTest {
    public void testTransfer() {
        BankAccount fromBankAccount = new BankAccount();
        BankAccount toBankAccount = new BankAccount();
        double amount = 0;

        fromBankAccount.transferTo(toBankAccount, amount);


    }
}

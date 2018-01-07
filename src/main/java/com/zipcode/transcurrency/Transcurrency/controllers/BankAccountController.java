package com.zipcode.transcurrency.Transcurrency.controllers;


import com.zipcode.transcurrency.Transcurrency.models.BankAccount;
import com.zipcode.transcurrency.Transcurrency.repositories.BankAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;


@RestController
public class BankAccountController {

    @Inject
    private BankAccountRepository bankAccountRepository;

    //gets all bank accounts
    @RequestMapping(value = "/bankAccounts", method = RequestMethod.GET)
    public ResponseEntity<Iterable<BankAccount>> getAllBankAccounts() {
        Iterable<BankAccount> allBankAccounts = bankAccountRepository.findAll();
        return new ResponseEntity<>(allBankAccounts, HttpStatus.OK);
    }

    //creates a bank account object
    @RequestMapping(value = "/bankAccounts", method = RequestMethod.POST)
    public ResponseEntity<?> createBankAccount(@RequestBody BankAccount bankAccount){
        //add logic
    }

    //get a credit card
    @RequestMapping(value = "/bankAccounts/{bankAccountId}", method = RequestMethod.GET)
    public ResponseEntity<?> getBankAccount(@PathVariable Long bankAccountId){
        BankAccount bankAccount = bankAccountRepository.findOne(bankAccountId);
        return new ResponseEntity<>(bankAccount, HttpStatus.OK);
    }

    //update a bank account
    @RequestMapping(value = "/bankAccounts/{bankAccountId}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateCreditCard(@RequestBody BankAccount bankAccount, @PathVariable Long bankAccountId){
        BankAccount account = bankAccountRepository.save(bankAccount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //delete a credit card
    @RequestMapping(value = "/bankAccounts/{bankAccountId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBankAccount(@PathVariable Long bankAccountId){
        bankAccountRepository.delete(bankAccountId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

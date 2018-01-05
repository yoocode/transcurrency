package com.zipcode.transcurrency.Transcurrency.controllers;


import com.zipcode.transcurrency.Transcurrency.models.BankAccount;
import com.zipcode.transcurrency.Transcurrency.repositories.BankAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.inject.Inject;


@RestController
public class BankAccountController {

    @Inject
    private BankAccountRepository bankAccountRepository;

    @RequestMapping(value = "/bankAccounts", method = RequestMethod.GET)
    public ResponseEntity<Iterable<BankAccount>> getAllBankAccounts() {
        Iterable<BankAccount> allBankAccounts = bankAccountRepository.findAll();
        return new ResponseEntity<>(allBankAccounts, HttpStatus.OK);
    }





}

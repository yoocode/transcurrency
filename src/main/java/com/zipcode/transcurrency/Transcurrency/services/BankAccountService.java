package com.zipcode.transcurrency.Transcurrency.services;

import com.zipcode.transcurrency.Transcurrency.models.BankAccount;
import com.zipcode.transcurrency.Transcurrency.repositories.BankAccountRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;



@Service
public class BankAccountService {


    private BankAccountRepository bankAccountRepository;


    public BankAccountService(BankAccountRepository bankAccountRepository) {

        this.bankAccountRepository = bankAccountRepository;
    }


    public ResponseEntity<Iterable<BankAccount>> getAllBankAccounts() {

        Iterable<BankAccount> allBankAccounts = bankAccountRepository.findAll();
        return new ResponseEntity<>(allBankAccounts, HttpStatus.OK);
    }


    public ResponseEntity<?> createBankAccount(BankAccount bankAccount) {

        bankAccount = bankAccountRepository.save(bankAccount);

        HttpHeaders responseHeaders = new HttpHeaders();
        URI newBankAccountURI = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{bankAccountId}")
                .buildAndExpand(bankAccount.getBankAccountId())
                .toUri();
        responseHeaders.setLocation(newBankAccountURI);

        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }


    public ResponseEntity<?> getBankAccount(Long bankAccountId){

        BankAccount bankAccount = bankAccountRepository.findOne(bankAccountId);
        return new ResponseEntity<>(bankAccount, HttpStatus.OK);
    }


    public ResponseEntity<?> updateBankAccount(BankAccount bankAccount, Long bankAccountId){

        BankAccount account = bankAccountRepository.save(bankAccount);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }


    public ResponseEntity<?> deleteBankAccount(Long bankAccountId){

        bankAccountRepository.delete(bankAccountId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

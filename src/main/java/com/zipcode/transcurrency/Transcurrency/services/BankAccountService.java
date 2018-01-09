package com.zipcode.transcurrency.Transcurrency.services;

import com.zipcode.transcurrency.Transcurrency.models.BankAccount;
import com.zipcode.transcurrency.Transcurrency.repositories.BankAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BankAccountService {

    private BankAccountRepository bankAccountRepository;

    public BankAccountService(BankAccountRepository bankAccountRepository) {

        this.bankAccountRepository = bankAccountRepository;
    }

    public List<BankAccount> getAllBankAccounts() {
        List<BankAccount> allBankAccounts = new ArrayList();
        bankAccountRepository.findAll()
                .forEach(allBankAccounts::add);
        return allBankAccounts;
    }

    public ResponseEntity<?> updateBankAccount() {
        return null;
    }

    public ResponseEntity<?> deleteBankAccount() {
        return null;
    }




}

package com.zipcode.transcurrency.Transcurrency.services;

import com.zipcode.transcurrency.Transcurrency.com.zipcode.transcurrency.models.Transaction;
import com.zipcode.transcurrency.Transcurrency.com.zipcode.transcurrency.models.Transfer;
import com.zipcode.transcurrency.Transcurrency.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {

        this.transactionRepository = transactionRepository;

    }

    public List<Transaction> getAllTransactions() {

        return transactionRepository.findAll();

    }

    public Transaction getTransactionById(Long id) {

        if(transactionRepository.findOne(id) == null) {
            return null;
        }

        return transactionRepository.findOne(id);

    }

    public Transaction createTransaction() {

        Transaction newTransaction = new Transaction();
        return newTransaction;
    }

    public void saveTransaction(Transaction transaction) {

        if(transaction.getId() != null) {
            transaction.setTransfer(new Transfer());
        }

        transactionRepository.save(transaction);

    }

    public void deleteTransaction(Long id) {

        transactionRepository.delete(id);

    }


}

package com.zipcode.transcurrency.Transcurrency.services;

import com.zipcode.transcurrency.Transcurrency.com.zipcode.transcurrency.models.Transaction;
import com.zipcode.transcurrency.Transcurrency.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TransactionService {

    private static List<Transaction> transactions = new ArrayList<>(
            Arrays.asList(
                    new Transaction(),
                    new Transaction(),
                    new Transaction(),
                    new Transaction()));

    private TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getAllTransactions() {
        transactionRepository.findAll()
                .forEach(transactions::add);
        return transactions;
    }

    public Transaction getTransaction(Long id) {
        return new Transaction();
    }

}

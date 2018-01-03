package com.zipcode.transcurrency.Transcurrency.services;
import com.zipcode.transcurrency.Transcurrency.com.zipcode.transcurrency.models.Transaction;
import com.zipcode.transcurrency.Transcurrency.repositories.TransactionRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class TransactionServiceTests {

    private TransactionService transactionService;

    @Mock
    private TransactionRepository transactionRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        transactionService = new TransactionService(transactionRepository);
    }

    @Test
    public void getAllTransactions() throws Exception {

        List<Transaction> transactionList = new ArrayList<>(
                Arrays.asList(
                        new Transaction(),
                        new Transaction(),
                        new Transaction(),
                        new Transaction()));

        when(transactionService.getAllTransactions()).thenReturn(transactionList);
        List<Transaction> transactions = transactionService.getAllTransactions();

        assertEquals(transactions.size(), 4);
    }

    @Test
    public void getTransaction() throws Exception {

        
    }

}

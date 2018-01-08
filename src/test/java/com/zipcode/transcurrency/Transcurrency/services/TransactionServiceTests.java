package com.zipcode.transcurrency.Transcurrency.services;
import com.zipcode.transcurrency.Transcurrency.com.zipcode.transcurrency.models.Transaction;
import com.zipcode.transcurrency.Transcurrency.repositories.TransactionRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TransactionServiceTests {

    @InjectMocks
    private TransactionService transactionService;

    @Mock
    private TransactionRepository transactionRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllTransactionsTest() throws Exception {
        List<Transaction> transactionList = new ArrayList<>(
                Arrays.asList(
                        new Transaction(),
                        new Transaction()));

        Mockito.when(transactionRepository.findAll())
                .thenReturn(transactionList);

        List<Transaction> transactions = transactionService.getAllTransactions();

        assertEquals(transactions.size(), 2);
    }

    @Test
    public void getTransactionTest() throws Exception {
        Long id = 1L;
        Transaction transactionResult = new Transaction();

        Mockito.when(transactionRepository.findOne(id))
                .thenReturn(transactionResult);

        Transaction transaction = transactionService.getTransactionById(1L);

        assertEquals(transaction, transactionResult);
    }

    @Test
    public void saveTransactionTest() throws Exception {
        
    }
}

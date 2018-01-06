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
        Mockito.when(transactionRepository.findAll())
                .thenReturn(
                        new ArrayList<>(
                                Arrays.asList(
                                        new Transaction(),
                                        new Transaction())));
        Mockito.when(transactionRepository.findOne(1L))
                .thenReturn(new Transaction());
    }

    @Test
    public void getAllTransactions() throws Exception {

        List<Transaction> transactions = transactionService.getAllTransactions();

        assertEquals(transactions.size(), 2);
    }

    @Test
    public void getTransaction() throws Exception {

        Transaction actual = new Transaction();

        Transaction transactionResult = transactionService.getTransaction(1L);

        assertEquals(transactionResult, actual);
    }

}

package com.zipcode.transcurrency.Transcurrency.services;

import com.zipcode.transcurrency.Transcurrency.models.BankAccount;
import com.zipcode.transcurrency.Transcurrency.repositories.BankAccountRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BankAccountServiceTest {

    private BankAccountService bankAccountService;

    @Mock
    private BankAccountRepository bankAccountRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        bankAccountService = new BankAccountService(bankAccountRepository);
    }

    @Test
    public void getAllBankAccounts() throws Exception {


//        User user1 = new User();
//        List<User> userData = new ArrayList<>();
//        userData.add(user1);

        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount1 = new BankAccount();
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(bankAccount);
        bankAccountList.add(bankAccount1);

        when(bankAccountRepository.findAll()).thenReturn(bankAccountList);

        List<BankAccount> bankAccountTest = bankAccountService.getAllBankAccounts();

        verify(bankAccountRepository, times(1)).findAll();
        assertEquals(bankAccountList.size(), 2);

    }

}
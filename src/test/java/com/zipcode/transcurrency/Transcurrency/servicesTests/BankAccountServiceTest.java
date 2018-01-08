package com.zipcode.transcurrency.Transcurrency.servicesTests;

import com.zipcode.transcurrency.Transcurrency.models.BankAccount;
import com.zipcode.transcurrency.Transcurrency.repositories.BankAccountRepository;
import com.zipcode.transcurrency.Transcurrency.services.BankAccountService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BankAccountServiceTest {

    private BankAccountService bankAccountService;

    @Mock
    private BankAccountRepository bankAccountRepository;

    @InjectMocks
    private BankAccountService service;



    @Before
    public void setUp() throws  Exception {

        MockitoAnnotations.initMocks(this);
        //BankAccountService = new BankAccountService(bankAccountRepository);
    }

    @Test
    public void getAllBankAccountsTest() {
        //Given:
        BankAccount bankAccount1 = new BankAccount();


        //When:
        
        //Then:

    }

    @Test
    public void updateBankAccountTest() {
        //Assertion here
    }

    @Test
    public void deleteBankAccountTest() {
        //Assertion here
    }


}

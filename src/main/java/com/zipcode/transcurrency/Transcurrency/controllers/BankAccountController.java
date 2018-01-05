package com.zipcode.transcurrency.Transcurrency.controllers;


import com.zipcode.transcurrency.Transcurrency.repositories.BankAccountRepository;
import org.springframework.web.bind.annotation.RestController;
import javax.inject.Inject;


@RestController
public class BankAccountController {

    @Inject
    private BankAccountRepository bankAccountRepository;




}

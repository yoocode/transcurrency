package com.zipcode.transcurrency.Transcurrency.controllers;


import com.zipcode.transcurrency.Transcurrency.repositories.CreditCardRepository;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class CreditCardController {

    @Inject
    private CreditCardRepository creditCardRepository;

}

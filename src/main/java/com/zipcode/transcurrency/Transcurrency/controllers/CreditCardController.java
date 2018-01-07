package com.zipcode.transcurrency.Transcurrency.controllers;


import com.zipcode.transcurrency.Transcurrency.models.CreditCard;
import com.zipcode.transcurrency.Transcurrency.repositories.CreditCardRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;


@RestController
public class CreditCardController {

    @Inject
    private CreditCardRepository creditCardRepository;

    //gets all the credit cards
    @RequestMapping(value = "/creditCards", method = RequestMethod.GET)
    public ResponseEntity<Iterable<CreditCard>> getAllCreditCards() {
        Iterable<CreditCard> allCreditCards = creditCardRepository.findAll();
        return new ResponseEntity<>(allCreditCards, HttpStatus.OK);
    }

    //creates credit cards
    @RequestMapping(value = "/creditCards", method = RequestMethod.POST)
    public ResponseEntity<?> createCreditCard(@RequestBody CreditCard creditCard){
        //add logic
    }

    //gets a credit card
    @RequestBody(value = "/creditCards/{creditCardId}", method = RequestMethod.GET)
    public ResponseEntity<?> getCreditCard(@PathVariable Long creditCardId){
        CreditCard c = creditCardRepository.findOne(creditCardId);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    

}

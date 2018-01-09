package com.zipcode.transcurrency.Transcurrency.controllers;


import com.zipcode.transcurrency.Transcurrency.models.CreditCard;
import com.zipcode.transcurrency.Transcurrency.repositories.CreditCardRepository;
import com.zipcode.transcurrency.Transcurrency.services.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.inject.Inject;
import java.net.URI;


@RestController
public class CreditCardController {

    private CreditCardService creditCardService;


    public CreditCardController() {

    }

    @Autowired
    public CreditCardController(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }


    /////////////////////////


    //gets all the credit cards
    @RequestMapping(value = "/creditCards", method = RequestMethod.GET)
    public ResponseEntity<Iterable<CreditCard>> getAllCreditCards() {

        return creditCardService.getAllCreditCards();
    }


    //creates credit cards
    @RequestMapping(value = "/creditCards", method = RequestMethod.POST)
    public ResponseEntity<?> createCreditCard(@RequestBody CreditCard creditCard){

        return creditCardService.createCreditCard(creditCard);
    }


    //gets a credit card
    @RequestMapping(value = "/creditCards/{creditCardId}", method = RequestMethod.GET)
    public ResponseEntity<?> getCreditCard(@PathVariable Long creditCardId){

        return creditCardService.getCreditCard(creditCardId);
    }


    //update a credit card. May not be needed
    @RequestMapping(value = "/creditCards/{creditCardId}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateCreditCard(@RequestBody CreditCard creditCard, @PathVariable Long creditCardId){


        return creditCardService.updateCreditCard(creditCard, creditCardId);
    }


    //delete a credit card
    @RequestMapping(value = "/creditCards/{creditCardId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCreditCard(@PathVariable Long creditCardId){

        creditCardRepository.delete(creditCardId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

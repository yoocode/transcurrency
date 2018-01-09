package com.zipcode.transcurrency.Transcurrency.controllers;


import com.zipcode.transcurrency.Transcurrency.models.CreditCard;
import com.zipcode.transcurrency.Transcurrency.repositories.CreditCardRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.inject.Inject;
import java.net.URI;


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

        creditCard = creditCardRepository.save(creditCard);

        HttpHeaders responseHeaders = new HttpHeaders();
        URI newCreditCardURI = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{creditCardId}")
                .buildAndExpand(creditCard.getCreditCardId())
                .toUri();
        responseHeaders.setLocation(newCreditCardURI);

        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }


    //gets a credit card
    @RequestMapping(value = "/creditCards/{creditCardId}", method = RequestMethod.GET)
    public ResponseEntity<?> getCreditCard(@PathVariable Long creditCardId){

        CreditCard card = creditCardRepository.findOne(creditCardId);
        return new ResponseEntity<>(card, HttpStatus.OK);
    }


    //update a credit card. May not be needed
    @RequestMapping(value = "/creditCards/{creditCardId}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateCreditCard(@RequestBody CreditCard creditCard, @PathVariable Long creditCardId){

        CreditCard card = creditCardRepository.save(creditCard);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    //delete a credit card
    @RequestMapping(value = "/creditCards/{creditCardId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCreditCard(@PathVariable Long creditCardId){

        creditCardRepository.delete(creditCardId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

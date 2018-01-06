package com.zipcode.transcurrency.Transcurrency.controllers;


import com.zipcode.transcurrency.Transcurrency.models.CreditCard;
import com.zipcode.transcurrency.Transcurrency.repositories.CreditCardRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.inject.Inject;


@RestController
public class CreditCardController {

    @Inject
    private CreditCardRepository creditCardRepository;

    @RequestMapping(value = "/creditCards", method = RequestMethod.GET)
    public ResponseEntity<Iterable<CreditCard>> getAllCreditCards() {
        Iterable<CreditCard> allCreditCards = creditCardRepository.findAll();
        return new ResponseEntity<>(allCreditCards, HttpStatus.OK);
    }

}

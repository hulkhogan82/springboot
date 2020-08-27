package com.example.springBoot.controller;

import com.example.springBoot.model.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuoteController {

    private static final Logger log = LoggerFactory.getLogger(QuoteController.class);

    @RequestMapping(value = "/api/v1/quote", method = RequestMethod.GET)
    public Quote getQuote() {
        final RestTemplate restTemplate = new RestTemplate();
        final Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        return quote;
    }
}

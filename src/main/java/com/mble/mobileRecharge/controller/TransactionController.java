package com.mble.mobileRecharge.controller;
import com.mble.mobileRecharge.manager.TransactionManager;
import com.mble.mobileRecharge.model.Transaction;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value="/Transaction")
public class TransactionController {

    @Autowired
    private TransactionManager stores;

        @RequestMapping(value = "/createTranscation", method = RequestMethod.POST)
        public Transaction createStore(@RequestBody Transaction transaction) {
            System.out.println("Saving transaction information in DB.");
            return stores.createStore(transaction);
        }

        @RequestMapping(value = "/getTransaction", method = RequestMethod.GET)
        public List<Transaction> getStores() {
            System.out.println("getALl Transaction  info");
            return stores.getStores();
        }
}

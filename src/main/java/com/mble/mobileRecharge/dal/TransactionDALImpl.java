package com.mble.mobileRecharge.dal;


import com.mble.mobileRecharge.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TransactionDALImpl implements TransactionDAL {

   @Autowired
   private MongoTemplate mongoTemplate;


    @Override
    public Transaction createStore(Transaction store) {
        mongoTemplate.save(store);
        return store;
    }

    @Override
    public List<Transaction> getAllstores() {
        return mongoTemplate.findAll(Transaction.class);
    }
}

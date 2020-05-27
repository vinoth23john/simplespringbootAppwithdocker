package com.mble.mobileRecharge.manager;



import com.mble.mobileRecharge.model.Transaction;

import java.util.List;

public interface TransactionManager {

    Transaction createStore(Transaction store);
     List<Transaction> getStores();
}

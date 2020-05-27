package com.mble.mobileRecharge.dal;



import com.mble.mobileRecharge.model.Transaction;

import java.util.List;

public interface TransactionDAL {

    Transaction createStore(Transaction store);
    List<Transaction> getAllstores();
}

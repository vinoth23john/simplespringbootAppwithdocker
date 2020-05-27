package com.mble.mobileRecharge.manager;


import com.mble.mobileRecharge.dal.TransactionDAL;
import com.mble.mobileRecharge.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionManagerImpl implements TransactionManager {

@Autowired
private TransactionDAL transactionDAL;
    @Override
    public Transaction createStore(Transaction transaction) {
        transaction.setTransactionNo("Tnx20000455dd3444");
        return transactionDAL.createStore(transaction);

    }

    @Override
    public List<Transaction> getStores() {
        return transactionDAL.getAllstores();
    }
}

package io.swagger.util;

import io.swagger.model.PaymentItem;
import io.swagger.model.TrasactionItem;

public class TransactionItemMock {

    public static TrasactionItem loadTrasactionItem(){
        TrasactionItem trasactionItem = new TrasactionItem();
        trasactionItem.setTrasactionId("123");
        trasactionItem.setStatus("APPROVED");
        trasactionItem.setTrasactionDate("20/10/2017");
        trasactionItem.setDescription("HD plan Payment ");
        trasactionItem.setPaymentId("123");

        return trasactionItem;
    }
}

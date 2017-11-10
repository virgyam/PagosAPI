package io.swagger.util;

import io.swagger.model.PaymentItem;
import io.swagger.model.TrasactionItem;

import java.util.ArrayList;
import java.util.List;

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

    public static List<TrasactionItem> loadListTrasactionsItem(){

        List list = new ArrayList();

        TrasactionItem transactionItem1 = new TrasactionItem();
        transactionItem1.setTrasactionId("123");
        transactionItem1.setStatus("APPROVED");
        transactionItem1.setTrasactionDate("20/10/2017");
        transactionItem1.setDescription("HD plan Payment");
        transactionItem1.setPaymentId("123");
        transactionItem1.setPaymentMethodId("CREDIT");
        list.add(transactionItem1);

        TrasactionItem transactionItem2 = new TrasactionItem();
        transactionItem2.setTrasactionId("456");
        transactionItem2.setStatus("CANCELED");
        transactionItem2.setTrasactionDate("21/10/2017");
        transactionItem2.setDescription("Basic plan Payment");
        transactionItem2.setPaymentId("321");
        transactionItem2.setPaymentMethodId("PAYPAL");
        list.add(transactionItem2);

        TrasactionItem transactionItem3 = new TrasactionItem();
        transactionItem3.setTrasactionId("789");
        transactionItem3.setStatus("PENDING");
        transactionItem3.setTrasactionDate("22/10/2017");
        transactionItem3.setDescription("4K HD plan Payment");
        transactionItem3.setPaymentId("675");
        transactionItem3.setPaymentMethodId("BITCOIN");
        list.add(transactionItem3);

        return list;
    }
}

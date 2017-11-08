package io.swagger.util;

import io.swagger.model.PaymentItem;
import io.swagger.model.PaymentMethodItem;

public class PaymentItemMock {

    public static PaymentItem paymentMethodItemMock(){
        PaymentItem paymentItem = new PaymentItem();
        paymentItem.setClientId("123");
        paymentItem.setAmount("20000");
        paymentItem.setPaymentMethod(new PaymentMethodItem());
        return paymentItem;
    }
}

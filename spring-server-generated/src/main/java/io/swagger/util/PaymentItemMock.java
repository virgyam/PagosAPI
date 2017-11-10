package io.swagger.util;

import io.swagger.model.PaymentItem;
import io.swagger.model.PaymentMethodItem;

public class PaymentItemMock {

    public static PaymentItem paymentItemMock(){
        PaymentItem paymentItem = new PaymentItem();
        paymentItem.setPaymentId("123");
        paymentItem.setClientId("123");
        paymentItem.setAmount("20000");
        PaymentMethodItem paymentMethodItem = new PaymentMethodItem();
        paymentMethodItem.setCardId("1234");
        paymentMethodItem.setCardType("MATERCARD");
        paymentMethodItem.setExpirationDate("10/01/2020");
        paymentMethodItem.setSecurityCode("***");
        paymentItem.setPaymentMethod(paymentMethodItem);
        return paymentItem;
    }
}

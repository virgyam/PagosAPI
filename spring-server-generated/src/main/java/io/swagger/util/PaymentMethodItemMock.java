package io.swagger.util;

import io.swagger.model.PaymentItem;
import io.swagger.model.PaymentMethodItem;

public class PaymentMethodItemMock {

    public static PaymentMethodItem paymentMethodItemMock(){
        PaymentMethodItem paymentMethodItem = new PaymentMethodItem();
        paymentMethodItem.setCardId("1234");
        paymentMethodItem.setCardType("MATERCARD");
        paymentMethodItem.setExpirationDate("10/01/2020");
        paymentMethodItem.setSecurityCode("***");
        return paymentMethodItem;
    }
}

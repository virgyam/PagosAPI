package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.PaymentItem;
import io.swagger.model.TrasactionItem;
import io.swagger.util.PaymentItemMock;
import io.swagger.util.TransactionItemMock;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T15:06:31.593Z")

@Controller
public class PaymentApiController implements PaymentApi {

    public ResponseEntity<List<TrasactionItem>> listPayments(@ApiParam(value = "pass an user id for looking up payments", required = true) @PathVariable(value = "clientId") String clientId) {
        List<TrasactionItem> trasactionItem = TransactionItemMock.loadListTrasactionsItem();

        for(TrasactionItem transaction : trasactionItem){
            Link paymentItemLink = linkTo(methodOn(PaymentApiController.class).
                    getPayment(transaction.getPaymentId())).withSelfRel();
            transaction.add(paymentItemLink);
        }

        return new ResponseEntity<>(trasactionItem, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PaymentItem> getPayment(@ApiParam(value = "Type the id payment",required=true ) @PathVariable("paymentId") String paymentId) {

        return new ResponseEntity<PaymentItem>(PaymentItemMock.paymentMethodItemMock(), HttpStatus.OK);
    }

    public ResponseEntity<TrasactionItem> pay(@ApiParam(value = "payment item") @RequestBody PaymentItem paymentItem) {

        TrasactionItem trasactionItem = TransactionItemMock.loadTrasactionItem();
        Link paymentItemLink = linkTo(methodOn(PaymentApiController.class).
                getPayment(trasactionItem.getPaymentId())).
                withSelfRel();
        trasactionItem.add(paymentItemLink);
        return new ResponseEntity<TrasactionItem>(trasactionItem, HttpStatus.OK);
    }

}

package io.swagger.api;

import io.swagger.model.PaymentItem;
import io.swagger.model.TrasactionItem;

import io.swagger.annotations.*;

import io.swagger.util.PaymentItemMock;
import io.swagger.util.TransactionItemMock;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T15:06:31.593Z")

@Controller
public class PaymentApiController implements PaymentApi {

    public ResponseEntity<List<TrasactionItem>> listPayments(@ApiParam(value = "pass an user id for looking up payments", required = true) @RequestParam(value = "clientId", required = true) String clientId) {
        // do some magic!
        return new ResponseEntity<List<TrasactionItem>>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PaymentItem> getPayment(String trasactionId) {

        return new ResponseEntity<PaymentItem>(PaymentItemMock.paymentMethodItemMock(), HttpStatus.OK);
    }

    public ResponseEntity<TrasactionItem> pay(@ApiParam(value = "payment item") @RequestBody PaymentItem paymentItem) {
        // do some magic!Object
        TrasactionItem trasactionItem = TransactionItemMock.loadTrasactionItem();
        Link paymentItemLink = linkTo(methodOn(PaymentApiController.class).
                getPayment(paymentItem.getPaymentId())).
                withSelfRel();
        trasactionItem.add(paymentItemLink);
        return new ResponseEntity<TrasactionItem>(trasactionItem, HttpStatus.OK);
    }

}

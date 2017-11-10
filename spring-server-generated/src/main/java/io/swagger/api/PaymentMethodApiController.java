package io.swagger.api;

import io.swagger.model.PaymentMethodItem;

import io.swagger.annotations.*;

import io.swagger.util.PaymentMethodItemMock;
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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T15:06:31.593Z")

@Controller
public class PaymentMethodApiController implements PaymentMethodApi {

    public ResponseEntity<Object> updatePaymentMethod(@ApiParam(value = "payment method item"  ) @RequestBody PaymentMethodItem paymentMethodItem) {
        return new ResponseEntity<Object>(PaymentMethodItemMock.paymentMethodItemMock(), HttpStatus.OK);
    }

}

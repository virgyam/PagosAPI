package io.swagger.api;

import io.swagger.model.PaymentMethodItem;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T15:06:31.593Z")

@Api(value = "paymentMethod", description = "the paymentMethod API")
public interface PaymentMethodApi {

    @ApiOperation(value = "update the payment method", notes = "update the payment method", response = Object.class, tags={ "admins", "developers",})
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Object.class),
        @ApiResponse(code = 201, message = "item created", response = Object.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Object.class),
        @ApiResponse(code = 409, message = "an existing item already exists", response = Object.class) })
    @RequestMapping(value = "/paymentMethod",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Object> updatePaymentMethod(@ApiParam(value = "payment method item"  ) @RequestBody PaymentMethodItem paymentMethodItem);

}

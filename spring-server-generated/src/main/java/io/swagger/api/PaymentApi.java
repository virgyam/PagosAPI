package io.swagger.api;

import io.swagger.model.PaymentItem;
import io.swagger.model.TrasactionItem;

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

@Api(value = "payment", description = "the payment API")
public interface PaymentApi {

    @ApiOperation(value = "searches payments", notes = "By passing in the appropriate user id, you can search for user payments ", response = TrasactionItem.class, responseContainer = "List", tags={ "developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = PaymentItem.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = PaymentItem.class) })
    @RequestMapping(value = "/listPayments/{clientId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<TrasactionItem>> listPayments(@ApiParam(value = "pass an id trasaction for looking up payments", required = true) @PathVariable(value = "clientId") String clientId);

    @ApiOperation(value = "searches payment", notes = "By passing in the appropriate payment id, you can search for a payment ", response = TrasactionItem.class, responseContainer = "List", tags={ "developers", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "search results matching criteria", response = PaymentItem.class),
            @ApiResponse(code = 400, message = "bad input parameter", response = PaymentItem.class) })
    @RequestMapping(value = "/payment/{paymentId}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<PaymentItem> getPayment(@ApiParam(value = "pass an id trasaction for looking up payment", required = true) @PathVariable(value = "paymentId") String paymentId);

    @ApiOperation(value = "make the payment", notes = "make the payment", response = TrasactionItem.class, tags={ "admins", "developers",})
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = TrasactionItem.class),
        @ApiResponse(code = 201, message = "item created", response = TrasactionItem.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = TrasactionItem.class),
        @ApiResponse(code = 409, message = "an existing item already exists", response = TrasactionItem.class) })
    @RequestMapping(value = "/payment",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<TrasactionItem> pay(@ApiParam(value = "payment item"  ) @RequestBody PaymentItem paymentItem);

}

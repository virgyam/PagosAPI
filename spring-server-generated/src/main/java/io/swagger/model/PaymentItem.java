package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentMethodItem;
import org.springframework.hateoas.ResourceSupport;

/**
 * PaymentItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T15:06:31.593Z")

public class PaymentItem   extends ResourceSupport {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("paymentMethod")
  private PaymentMethodItem paymentMethod = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  public PaymentItem clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "example@example.com", required = true, value = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public PaymentItem paymentMethod(PaymentMethodItem paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentMethodItem getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodItem paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentItem amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "200000", required = true, value = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  @ApiModelProperty(example = "123", required = true, value = "")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentItem paymentItem = (PaymentItem) o;
    return Objects.equals(this.clientId, paymentItem.clientId) &&
        Objects.equals(this.paymentMethod, paymentItem.paymentMethod) &&
        Objects.equals(this.amount, paymentItem.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, paymentMethod, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentItem {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


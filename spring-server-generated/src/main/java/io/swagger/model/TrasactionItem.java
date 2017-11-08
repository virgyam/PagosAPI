package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * TrasactionItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T15:06:31.593Z")

public class TrasactionItem  extends ResourceSupport {
  @JsonProperty("trasactionId")
  private String trasactionId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("paymentMethodId")
  private String paymentMethodId = null;

  @JsonProperty("trasactionDate")
  private String trasactionDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  public TrasactionItem trasactionId(String trasactionId) {
    this.trasactionId = trasactionId;
    return this;
  }

   /**
   * Get trasactionId
   * @return trasactionId
  **/
  @ApiModelProperty(example = "1234748555", required = true, value = "")
  public String getTrasactionId() {
    return trasactionId;
  }

  public void setTrasactionId(String trasactionId) {
    this.trasactionId = trasactionId;
  }

  public TrasactionItem status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "approved", required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TrasactionItem paymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * Get paymentMethodId
   * @return paymentMethodId
  **/
  @ApiModelProperty(example = "12347585", required = true, value = "")
  public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public TrasactionItem trasactionDate(String trasactionDate) {
    this.trasactionDate = trasactionDate;
    return this;
  }

   /**
   * Get trasactionDate
   * @return trasactionDate
  **/
  @ApiModelProperty(example = "24/10/2017", required = true, value = "")
  public String getTrasactionDate() {
    return trasactionDate;
  }

  public void setTrasactionDate(String trasactionDate) {
    this.trasactionDate = trasactionDate;
  }

  public TrasactionItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "trasaction approved", required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @ApiModelProperty(example = "123", required = true, value = "")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
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


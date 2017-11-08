package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * PaymentMethodItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T15:06:31.593Z")

public class PaymentMethodItem   extends ResourceSupport {
  @JsonProperty("cardId")
  private String cardId = null;

  @JsonProperty("expirationDate")
  private String expirationDate = null;

  @JsonProperty("cardType")
  private String cardType = null;

  @JsonProperty("securityCode")
  private String securityCode = null;

  public PaymentMethodItem cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Get cardId
   * @return cardId
  **/
  @ApiModelProperty(example = "353647374", required = true, value = "")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public PaymentMethodItem expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(example = "24/10/2017", required = true, value = "")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public PaymentMethodItem cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(example = "mastercard", required = true, value = "")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public PaymentMethodItem securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Get securityCode
   * @return securityCode
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodItem paymentMethodItem = (PaymentMethodItem) o;
    return Objects.equals(this.cardId, paymentMethodItem.cardId) &&
        Objects.equals(this.expirationDate, paymentMethodItem.expirationDate) &&
        Objects.equals(this.cardType, paymentMethodItem.cardType) &&
        Objects.equals(this.securityCode, paymentMethodItem.securityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, expirationDate, cardType, securityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodItem {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
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


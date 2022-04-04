package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the credit_card_purchase database table.
 * 
 */
@Entity
@Table(name="credit_card_purchase")
@NamedQuery(name="CreditCardPurchase.findAll", query="SELECT c FROM CreditCardPurchase c")
public class CreditCardPurchase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="purchase_id")
	private long purchaseId;

	@Column(name="card_holder_name")
	private String cardHolderName;

	@Column(name="card_modified_date")
	private Timestamp cardModifiedDate;

	@Column(name="card_number")
	private String cardNumber;

	@Column(name="card_token")
	private String cardToken;

	@Column(name="card_type")
	private String cardType;

	private String city;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="end_digits")
	private String endDigits;

	@Column(name="expiration_date")
	private Timestamp expirationDate;

	private String line1;

	private String line2;

	private String state;

	private String zip;

	public CreditCardPurchase() {
	}

	public long getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getCardHolderName() {
		return this.cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public Timestamp getCardModifiedDate() {
		return this.cardModifiedDate;
	}

	public void setCardModifiedDate(Timestamp cardModifiedDate) {
		this.cardModifiedDate = cardModifiedDate;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardToken() {
		return this.cardToken;
	}

	public void setCardToken(String cardToken) {
		this.cardToken = cardToken;
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getEndDigits() {
		return this.endDigits;
	}

	public void setEndDigits(String endDigits) {
		this.endDigits = endDigits;
	}

	public Timestamp getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Timestamp expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getLine1() {
		return this.line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return this.line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
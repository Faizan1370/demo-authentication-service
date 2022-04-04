package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the transaction_request database table.
 * 
 */
@Entity
@Table(name="transaction_request")
@NamedQuery(name="TransactionRequest.findAll", query="SELECT t FROM TransactionRequest t")
public class TransactionRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private double amount;

	@Column(name="card_holder_name")
	private String cardHolderName;

	@Column(name="card_number")
	private String cardNumber;

	@Column(name="card_token")
	private String cardToken;

	@Column(name="card_type")
	private String cardType;

	private String city;

	@Column(name="country_code")
	private String countryCode;

	private String currency;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="end_digits")
	private String endDigits;

	@Column(name="expiration_date")
	private Timestamp expirationDate;

	private String line1;

	private String line2;

	@Column(name="merchant_account_id")
	private BigDecimal merchantAccountId;

	@Column(name="purchase_id")
	private BigDecimal purchaseId;

	@Column(name="response_code")
	private String responseCode;

	@Column(name="response_text")
	private String responseText;

	private String state;

	private String status;

	private String zip;

	public TransactionRequest() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCardHolderName() {
		return this.cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
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

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
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

	public BigDecimal getMerchantAccountId() {
		return this.merchantAccountId;
	}

	public void setMerchantAccountId(BigDecimal merchantAccountId) {
		this.merchantAccountId = merchantAccountId;
	}

	public BigDecimal getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(BigDecimal purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseText() {
		return this.responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
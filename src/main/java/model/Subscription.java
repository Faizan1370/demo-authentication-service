package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the subscription database table.
 * 
 */
@Entity
@NamedQuery(name="Subscription.findAll", query="SELECT s FROM Subscription s")
public class Subscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="addr_city")
	private String addrCity;

	@Column(name="addr_country_code")
	private String addrCountryCode;

	@Column(name="addr_line1")
	private String addrLine1;

	@Column(name="addr_line2")
	private String addrLine2;

	@Column(name="addr_state")
	private String addrState;

	@Column(name="addr_zip")
	private String addrZip;

	private BigDecimal amount;

	@Column(name="card_end_digits")
	private String cardEndDigits;

	@Column(name="card_expiration_date")
	private Timestamp cardExpirationDate;

	@Column(name="card_holder_name")
	private String cardHolderName;

	@Column(name="card_number")
	private String cardNumber;

	@Column(name="card_token")
	private String cardToken;

	@Column(name="card_type")
	private String cardType;

	private String currency;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="eula_id")
	private BigDecimal eulaId;

	@Column(name="eula_signer")
	private BigDecimal eulaSigner;

	@Column(name="event_month")
	private String eventMonth;

	@Column(name="event_year")
	private String eventYear;

	@Column(name="ip_addr")
	private String ipAddr;

	@Column(name="old_eula_signer")
	private BigDecimal oldEulaSigner;

	@Column(name="organization_id")
	private BigDecimal organizationId;

	private BigDecimal processed;

	@Column(name="product_mode")
	private String productMode;

	@Column(name="sent_to_intacct")
	private BigDecimal sentToIntacct;

	@Column(name="sf_acct_id")
	private String sfAcctId;

	private String source;

	public Subscription() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddrCity() {
		return this.addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	public String getAddrCountryCode() {
		return this.addrCountryCode;
	}

	public void setAddrCountryCode(String addrCountryCode) {
		this.addrCountryCode = addrCountryCode;
	}

	public String getAddrLine1() {
		return this.addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return this.addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getAddrState() {
		return this.addrState;
	}

	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}

	public String getAddrZip() {
		return this.addrZip;
	}

	public void setAddrZip(String addrZip) {
		this.addrZip = addrZip;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCardEndDigits() {
		return this.cardEndDigits;
	}

	public void setCardEndDigits(String cardEndDigits) {
		this.cardEndDigits = cardEndDigits;
	}

	public Timestamp getCardExpirationDate() {
		return this.cardExpirationDate;
	}

	public void setCardExpirationDate(Timestamp cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
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

	public BigDecimal getEulaId() {
		return this.eulaId;
	}

	public void setEulaId(BigDecimal eulaId) {
		this.eulaId = eulaId;
	}

	public BigDecimal getEulaSigner() {
		return this.eulaSigner;
	}

	public void setEulaSigner(BigDecimal eulaSigner) {
		this.eulaSigner = eulaSigner;
	}

	public String getEventMonth() {
		return this.eventMonth;
	}

	public void setEventMonth(String eventMonth) {
		this.eventMonth = eventMonth;
	}

	public String getEventYear() {
		return this.eventYear;
	}

	public void setEventYear(String eventYear) {
		this.eventYear = eventYear;
	}

	public String getIpAddr() {
		return this.ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public BigDecimal getOldEulaSigner() {
		return this.oldEulaSigner;
	}

	public void setOldEulaSigner(BigDecimal oldEulaSigner) {
		this.oldEulaSigner = oldEulaSigner;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public BigDecimal getProcessed() {
		return this.processed;
	}

	public void setProcessed(BigDecimal processed) {
		this.processed = processed;
	}

	public String getProductMode() {
		return this.productMode;
	}

	public void setProductMode(String productMode) {
		this.productMode = productMode;
	}

	public BigDecimal getSentToIntacct() {
		return this.sentToIntacct;
	}

	public void setSentToIntacct(BigDecimal sentToIntacct) {
		this.sentToIntacct = sentToIntacct;
	}

	public String getSfAcctId() {
		return this.sfAcctId;
	}

	public void setSfAcctId(String sfAcctId) {
		this.sfAcctId = sfAcctId;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
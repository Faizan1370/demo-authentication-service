package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the paid_subscription database table.
 * 
 */
@Entity
@Table(name="paid_subscription")
@NamedQuery(name="PaidSubscription.findAll", query="SELECT p FROM PaidSubscription p")
public class PaidSubscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private BigDecimal amount;

	private String currency;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="enrollment_config_id")
	private BigDecimal enrollmentConfigId;

	@Column(name="eula_id")
	private BigDecimal eulaId;

	@Column(name="eula_signer")
	private BigDecimal eulaSigner;

	@Column(name="event_month")
	private String eventMonth;

	@Column(name="event_year")
	private String eventYear;

	@Column(name="has_paid")
	private BigDecimal hasPaid;

	@Column(name="ip_addr")
	private String ipAddr;

	@Column(name="organization_id")
	private BigDecimal organizationId;

	@Column(name="payment_id")
	private BigDecimal paymentId;

	private BigDecimal processed;

	@Column(name="product_mode")
	private String productMode;

	@Column(name="sf_acct_id")
	private String sfAcctId;

	private String source;

	public PaidSubscription() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public BigDecimal getEnrollmentConfigId() {
		return this.enrollmentConfigId;
	}

	public void setEnrollmentConfigId(BigDecimal enrollmentConfigId) {
		this.enrollmentConfigId = enrollmentConfigId;
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

	public BigDecimal getHasPaid() {
		return this.hasPaid;
	}

	public void setHasPaid(BigDecimal hasPaid) {
		this.hasPaid = hasPaid;
	}

	public String getIpAddr() {
		return this.ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public BigDecimal getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(BigDecimal paymentId) {
		this.paymentId = paymentId;
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
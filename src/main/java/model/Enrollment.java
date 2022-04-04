package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the enrollments database table.
 * 
 */
@Entity
@Table(name="enrollments")
@NamedQuery(name="Enrollment.findAll", query="SELECT e FROM Enrollment e")
public class Enrollment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="absentee_bidding")
	private BigDecimal absenteeBidding;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="auction_alias")
	private String auctionAlias;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_name")
	private String auctionName;

	@Column(name="bidder_search")
	private BigDecimal bidderSearch;

	@Column(name="campaign_id")
	private String campaignId;

	@Column(name="cause_group_id")
	private BigDecimal causeGroupId;

	private String city;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="credit_card_id")
	private BigDecimal creditCardId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="enrollment_config_id")
	private BigDecimal enrollmentConfigId;

	@Column(name="event_start")
	private Timestamp eventStart;

	@Column(name="has_event")
	private BigDecimal hasEvent;

	@Column(name="is_demo")
	private BigDecimal isDemo;

	@Column(name="is_sso")
	private BigDecimal isSso;

	@Column(name="lead_channel")
	private String leadChannel;

	private String line1;

	private String line2;

	@Column(name="online_bidding_finish")
	private Timestamp onlineBiddingFinish;

	@Column(name="online_bidding_start")
	private Timestamp onlineBiddingStart;

	@Column(name="org_ein")
	private String orgEin;

	@Column(name="org_guid")
	private String orgGuid;

	@Column(name="org_id")
	private BigDecimal orgId;

	@Column(name="org_name")
	private String orgName;

	@Column(name="org_phone")
	private String orgPhone;

	@Column(name="payment_id")
	private BigDecimal paymentId;

	@Column(name="premium_support")
	private BigDecimal premiumSupport;

	@Column(name="product_config_id")
	private BigDecimal productConfigId;

	@Column(name="remote_ip")
	private String remoteIp;

	private String state;

	private String status;

	private String url;

	private String zip;

	public Enrollment() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAbsenteeBidding() {
		return this.absenteeBidding;
	}

	public void setAbsenteeBidding(BigDecimal absenteeBidding) {
		this.absenteeBidding = absenteeBidding;
	}

	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	public String getAuctionAlias() {
		return this.auctionAlias;
	}

	public void setAuctionAlias(String auctionAlias) {
		this.auctionAlias = auctionAlias;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public String getAuctionName() {
		return this.auctionName;
	}

	public void setAuctionName(String auctionName) {
		this.auctionName = auctionName;
	}

	public BigDecimal getBidderSearch() {
		return this.bidderSearch;
	}

	public void setBidderSearch(BigDecimal bidderSearch) {
		this.bidderSearch = bidderSearch;
	}

	public String getCampaignId() {
		return this.campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public BigDecimal getCauseGroupId() {
		return this.causeGroupId;
	}

	public void setCauseGroupId(BigDecimal causeGroupId) {
		this.causeGroupId = causeGroupId;
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

	public BigDecimal getCreditCardId() {
		return this.creditCardId;
	}

	public void setCreditCardId(BigDecimal creditCardId) {
		this.creditCardId = creditCardId;
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

	public Timestamp getEventStart() {
		return this.eventStart;
	}

	public void setEventStart(Timestamp eventStart) {
		this.eventStart = eventStart;
	}

	public BigDecimal getHasEvent() {
		return this.hasEvent;
	}

	public void setHasEvent(BigDecimal hasEvent) {
		this.hasEvent = hasEvent;
	}

	public BigDecimal getIsDemo() {
		return this.isDemo;
	}

	public void setIsDemo(BigDecimal isDemo) {
		this.isDemo = isDemo;
	}

	public BigDecimal getIsSso() {
		return this.isSso;
	}

	public void setIsSso(BigDecimal isSso) {
		this.isSso = isSso;
	}

	public String getLeadChannel() {
		return this.leadChannel;
	}

	public void setLeadChannel(String leadChannel) {
		this.leadChannel = leadChannel;
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

	public Timestamp getOnlineBiddingFinish() {
		return this.onlineBiddingFinish;
	}

	public void setOnlineBiddingFinish(Timestamp onlineBiddingFinish) {
		this.onlineBiddingFinish = onlineBiddingFinish;
	}

	public Timestamp getOnlineBiddingStart() {
		return this.onlineBiddingStart;
	}

	public void setOnlineBiddingStart(Timestamp onlineBiddingStart) {
		this.onlineBiddingStart = onlineBiddingStart;
	}

	public String getOrgEin() {
		return this.orgEin;
	}

	public void setOrgEin(String orgEin) {
		this.orgEin = orgEin;
	}

	public String getOrgGuid() {
		return this.orgGuid;
	}

	public void setOrgGuid(String orgGuid) {
		this.orgGuid = orgGuid;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgPhone() {
		return this.orgPhone;
	}

	public void setOrgPhone(String orgPhone) {
		this.orgPhone = orgPhone;
	}

	public BigDecimal getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(BigDecimal paymentId) {
		this.paymentId = paymentId;
	}

	public BigDecimal getPremiumSupport() {
		return this.premiumSupport;
	}

	public void setPremiumSupport(BigDecimal premiumSupport) {
		this.premiumSupport = premiumSupport;
	}

	public BigDecimal getProductConfigId() {
		return this.productConfigId;
	}

	public void setProductConfigId(BigDecimal productConfigId) {
		this.productConfigId = productConfigId;
	}

	public String getRemoteIp() {
		return this.remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
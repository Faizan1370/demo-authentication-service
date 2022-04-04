package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the client_organization database table.
 * 
 */
@Entity
@Table(name="client_organization")
@NamedQuery(name="ClientOrganization.findAll", query="SELECT c FROM ClientOrganization c")
public class ClientOrganization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String alias;

	@Column(name="cause_group")
	private BigDecimal causeGroup;

	@Column(name="contact_url")
	private String contactUrl;

	@Column(name="default_auction_id")
	private BigDecimal defaultAuctionId;

	@Column(name="default_location_id")
	private BigDecimal defaultLocationId;

	@Column(name="default_processor")
	private String defaultProcessor;

	@Column(name="dynamics_id")
	private String dynamicsId;

	private String ein;

	@Column(name="enrollment_config_id")
	private BigDecimal enrollmentConfigId;

	private String guid;

	@Column(name="is_demo")
	private BigDecimal isDemo;

	@Column(name="is_disabled")
	private BigDecimal isDisabled;

	@Column(name="is_iam")
	private BigDecimal isIam;

	@Column(name="is_panorama2")
	private BigDecimal isPanorama2;

	@Column(name="is_sso")
	private BigDecimal isSso;

	@Column(name="last_sub_amount")
	private double lastSubAmount;

	@Column(name="next_subscription_amount")
	private BigDecimal nextSubscriptionAmount;

	@Column(name="panorama_product_id")
	private Integer panoramaProductId;

	@Column(name="partner_id")
	private BigDecimal partnerId;

	@Column(name="referral_partner")
	private BigDecimal referralPartner;

	@Column(name="sf_account_id")
	private String sfAccountId;

	@Column(name="stripe_customer_id")
	private String stripeCustomerId;

	@Column(name="subscription_end")
	private Timestamp subscriptionEnd;

	@Column(name="subscription_id")
	private BigDecimal subscriptionId;

	@Column(name="time_zone_id")
	private String timeZoneId;

	public ClientOrganization() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public BigDecimal getCauseGroup() {
		return this.causeGroup;
	}

	public void setCauseGroup(BigDecimal causeGroup) {
		this.causeGroup = causeGroup;
	}

	public String getContactUrl() {
		return this.contactUrl;
	}

	public void setContactUrl(String contactUrl) {
		this.contactUrl = contactUrl;
	}

	public BigDecimal getDefaultAuctionId() {
		return this.defaultAuctionId;
	}

	public void setDefaultAuctionId(BigDecimal defaultAuctionId) {
		this.defaultAuctionId = defaultAuctionId;
	}

	public BigDecimal getDefaultLocationId() {
		return this.defaultLocationId;
	}

	public void setDefaultLocationId(BigDecimal defaultLocationId) {
		this.defaultLocationId = defaultLocationId;
	}

	public String getDefaultProcessor() {
		return this.defaultProcessor;
	}

	public void setDefaultProcessor(String defaultProcessor) {
		this.defaultProcessor = defaultProcessor;
	}

	public String getDynamicsId() {
		return this.dynamicsId;
	}

	public void setDynamicsId(String dynamicsId) {
		this.dynamicsId = dynamicsId;
	}

	public String getEin() {
		return this.ein;
	}

	public void setEin(String ein) {
		this.ein = ein;
	}

	public BigDecimal getEnrollmentConfigId() {
		return this.enrollmentConfigId;
	}

	public void setEnrollmentConfigId(BigDecimal enrollmentConfigId) {
		this.enrollmentConfigId = enrollmentConfigId;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public BigDecimal getIsDemo() {
		return this.isDemo;
	}

	public void setIsDemo(BigDecimal isDemo) {
		this.isDemo = isDemo;
	}

	public BigDecimal getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(BigDecimal isDisabled) {
		this.isDisabled = isDisabled;
	}

	public BigDecimal getIsIam() {
		return this.isIam;
	}

	public void setIsIam(BigDecimal isIam) {
		this.isIam = isIam;
	}

	public BigDecimal getIsPanorama2() {
		return this.isPanorama2;
	}

	public void setIsPanorama2(BigDecimal isPanorama2) {
		this.isPanorama2 = isPanorama2;
	}

	public BigDecimal getIsSso() {
		return this.isSso;
	}

	public void setIsSso(BigDecimal isSso) {
		this.isSso = isSso;
	}

	public double getLastSubAmount() {
		return this.lastSubAmount;
	}

	public void setLastSubAmount(double lastSubAmount) {
		this.lastSubAmount = lastSubAmount;
	}

	public BigDecimal getNextSubscriptionAmount() {
		return this.nextSubscriptionAmount;
	}

	public void setNextSubscriptionAmount(BigDecimal nextSubscriptionAmount) {
		this.nextSubscriptionAmount = nextSubscriptionAmount;
	}

	public Integer getPanoramaProductId() {
		return this.panoramaProductId;
	}

	public void setPanoramaProductId(Integer panoramaProductId) {
		this.panoramaProductId = panoramaProductId;
	}

	public BigDecimal getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(BigDecimal partnerId) {
		this.partnerId = partnerId;
	}

	public BigDecimal getReferralPartner() {
		return this.referralPartner;
	}

	public void setReferralPartner(BigDecimal referralPartner) {
		this.referralPartner = referralPartner;
	}

	public String getSfAccountId() {
		return this.sfAccountId;
	}

	public void setSfAccountId(String sfAccountId) {
		this.sfAccountId = sfAccountId;
	}

	public String getStripeCustomerId() {
		return this.stripeCustomerId;
	}

	public void setStripeCustomerId(String stripeCustomerId) {
		this.stripeCustomerId = stripeCustomerId;
	}

	public Timestamp getSubscriptionEnd() {
		return this.subscriptionEnd;
	}

	public void setSubscriptionEnd(Timestamp subscriptionEnd) {
		this.subscriptionEnd = subscriptionEnd;
	}

	public BigDecimal getSubscriptionId() {
		return this.subscriptionId;
	}

	public void setSubscriptionId(BigDecimal subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getTimeZoneId() {
		return this.timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

}
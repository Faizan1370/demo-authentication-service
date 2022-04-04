package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the client_organization_info database table.
 * 
 */
@Entity
@Table(name="client_organization_info")
@NamedQuery(name="ClientOrganizationInfo.findAll", query="SELECT c FROM ClientOrganizationInfo c")
public class ClientOrganizationInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String alias;

	@Column(name="cause_group")
	private BigDecimal causeGroup;

	private String city;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="default_auction_id")
	private BigDecimal defaultAuctionId;

	@Column(name="default_processor")
	private String defaultProcessor;

	private String ein;

	@Column(name="enrollment_config_id")
	private BigDecimal enrollmentConfigId;

	private String guid;

	private BigDecimal id;

	@Column(name="is_demo")
	private BigDecimal isDemo;

	@Column(name="is_disabled")
	private BigDecimal isDisabled;

	@Column(name="is_sso")
	private BigDecimal isSso;

	private String line1;

	private String line2;

	private String name;

	@Column(name="panorama_product_id")
	private Integer panoramaProductId;

	private String phone;

	private String state;

	@Column(name="subscription_end")
	private Timestamp subscriptionEnd;

	@Column(name="subscription_id")
	private BigDecimal subscriptionId;

	@Column(name="time_zone")
	private String timeZone;

	private String url;

	private String zip;

	public ClientOrganizationInfo() {
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

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getDefaultAuctionId() {
		return this.defaultAuctionId;
	}

	public void setDefaultAuctionId(BigDecimal defaultAuctionId) {
		this.defaultAuctionId = defaultAuctionId;
	}

	public String getDefaultProcessor() {
		return this.defaultProcessor;
	}

	public void setDefaultProcessor(String defaultProcessor) {
		this.defaultProcessor = defaultProcessor;
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

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
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

	public BigDecimal getIsSso() {
		return this.isSso;
	}

	public void setIsSso(BigDecimal isSso) {
		this.isSso = isSso;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPanoramaProductId() {
		return this.panoramaProductId;
	}

	public void setPanoramaProductId(Integer panoramaProductId) {
		this.panoramaProductId = panoramaProductId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
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
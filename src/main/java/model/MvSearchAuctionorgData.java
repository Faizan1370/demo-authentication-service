package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mv_search_auctionorg_data database table.
 * 
 */
@Entity
@Table(name="mv_search_auctionorg_data")
@NamedQuery(name="MvSearchAuctionorgData.findAll", query="SELECT m FROM MvSearchAuctionorgData m")
public class MvSearchAuctionorgData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_absentee_bidding")
	private Integer auctionAbsenteeBidding;

	@Column(name="auction_alias")
	private String auctionAlias;

	@Column(name="auction_demo")
	private BigDecimal auctionDemo;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_name")
	private String auctionName;

	@Column(name="home_page_id")
	private BigDecimal homePageId;

	@Column(name="last_modified")
	private Timestamp lastModified;

	@Column(name="org_alias")
	private String orgAlias;

	@Column(name="org_cause_group")
	private String orgCauseGroup;

	@Column(name="org_cause_id")
	private BigDecimal orgCauseId;

	@Column(name="org_city")
	private String orgCity;

	@Column(name="org_id")
	private BigDecimal orgId;

	@Column(name="org_name")
	private String orgName;

	@Column(name="org_partner_alias")
	private String orgPartnerAlias;

	@Column(name="org_partner_id")
	private BigDecimal orgPartnerId;

	@Column(name="org_partner_name")
	private String orgPartnerName;

	@Column(name="org_postal_code")
	private String orgPostalCode;

	@Column(name="org_state")
	private String orgState;

	@Column(name="time_zone")
	private String timeZone;

	public MvSearchAuctionorgData() {
	}

	public Integer getAuctionAbsenteeBidding() {
		return this.auctionAbsenteeBidding;
	}

	public void setAuctionAbsenteeBidding(Integer auctionAbsenteeBidding) {
		this.auctionAbsenteeBidding = auctionAbsenteeBidding;
	}

	public String getAuctionAlias() {
		return this.auctionAlias;
	}

	public void setAuctionAlias(String auctionAlias) {
		this.auctionAlias = auctionAlias;
	}

	public BigDecimal getAuctionDemo() {
		return this.auctionDemo;
	}

	public void setAuctionDemo(BigDecimal auctionDemo) {
		this.auctionDemo = auctionDemo;
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

	public BigDecimal getHomePageId() {
		return this.homePageId;
	}

	public void setHomePageId(BigDecimal homePageId) {
		this.homePageId = homePageId;
	}

	public Timestamp getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public String getOrgAlias() {
		return this.orgAlias;
	}

	public void setOrgAlias(String orgAlias) {
		this.orgAlias = orgAlias;
	}

	public String getOrgCauseGroup() {
		return this.orgCauseGroup;
	}

	public void setOrgCauseGroup(String orgCauseGroup) {
		this.orgCauseGroup = orgCauseGroup;
	}

	public BigDecimal getOrgCauseId() {
		return this.orgCauseId;
	}

	public void setOrgCauseId(BigDecimal orgCauseId) {
		this.orgCauseId = orgCauseId;
	}

	public String getOrgCity() {
		return this.orgCity;
	}

	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
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

	public String getOrgPartnerAlias() {
		return this.orgPartnerAlias;
	}

	public void setOrgPartnerAlias(String orgPartnerAlias) {
		this.orgPartnerAlias = orgPartnerAlias;
	}

	public BigDecimal getOrgPartnerId() {
		return this.orgPartnerId;
	}

	public void setOrgPartnerId(BigDecimal orgPartnerId) {
		this.orgPartnerId = orgPartnerId;
	}

	public String getOrgPartnerName() {
		return this.orgPartnerName;
	}

	public void setOrgPartnerName(String orgPartnerName) {
		this.orgPartnerName = orgPartnerName;
	}

	public String getOrgPostalCode() {
		return this.orgPostalCode;
	}

	public void setOrgPostalCode(String orgPostalCode) {
		this.orgPostalCode = orgPostalCode;
	}

	public String getOrgState() {
		return this.orgState;
	}

	public void setOrgState(String orgState) {
		this.orgState = orgState;
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

}
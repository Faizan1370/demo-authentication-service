package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the saved_search database table.
 * 
 */
@Entity
@Table(name="saved_search")
@NamedQuery(name="SavedSearch.findAll", query="SELECT s FROM SavedSearch s")
public class SavedSearch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="absentee_only")
	private BigDecimal absenteeOnly;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="buy_now_only")
	private BigDecimal buyNowOnly;

	@Column(name="cause_id")
	private BigDecimal causeId;

	private String criteria;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="days_until_close")
	private BigDecimal daysUntilClose;

	private BigDecimal distance;

	@Column(name="entered_location")
	private String enteredLocation;

	@Column(name="leading_bid_max")
	private BigDecimal leadingBidMax;

	@Column(name="leading_bid_min")
	private BigDecimal leadingBidMin;

	@Column(name="location_id")
	private BigDecimal locationId;

	@Column(name="member_id")
	private BigDecimal memberId;

	private String name;

	private String postal;

	private String query;

	@Column(name="receive_email")
	private BigDecimal receiveEmail;

	@Column(name="value_max")
	private BigDecimal valueMax;

	@Column(name="value_min")
	private BigDecimal valueMin;

	public SavedSearch() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAbsenteeOnly() {
		return this.absenteeOnly;
	}

	public void setAbsenteeOnly(BigDecimal absenteeOnly) {
		this.absenteeOnly = absenteeOnly;
	}

	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getBuyNowOnly() {
		return this.buyNowOnly;
	}

	public void setBuyNowOnly(BigDecimal buyNowOnly) {
		this.buyNowOnly = buyNowOnly;
	}

	public BigDecimal getCauseId() {
		return this.causeId;
	}

	public void setCauseId(BigDecimal causeId) {
		this.causeId = causeId;
	}

	public String getCriteria() {
		return this.criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
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

	public BigDecimal getDaysUntilClose() {
		return this.daysUntilClose;
	}

	public void setDaysUntilClose(BigDecimal daysUntilClose) {
		this.daysUntilClose = daysUntilClose;
	}

	public BigDecimal getDistance() {
		return this.distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	public String getEnteredLocation() {
		return this.enteredLocation;
	}

	public void setEnteredLocation(String enteredLocation) {
		this.enteredLocation = enteredLocation;
	}

	public BigDecimal getLeadingBidMax() {
		return this.leadingBidMax;
	}

	public void setLeadingBidMax(BigDecimal leadingBidMax) {
		this.leadingBidMax = leadingBidMax;
	}

	public BigDecimal getLeadingBidMin() {
		return this.leadingBidMin;
	}

	public void setLeadingBidMin(BigDecimal leadingBidMin) {
		this.leadingBidMin = leadingBidMin;
	}

	public BigDecimal getLocationId() {
		return this.locationId;
	}

	public void setLocationId(BigDecimal locationId) {
		this.locationId = locationId;
	}

	public BigDecimal getMemberId() {
		return this.memberId;
	}

	public void setMemberId(BigDecimal memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostal() {
		return this.postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public BigDecimal getReceiveEmail() {
		return this.receiveEmail;
	}

	public void setReceiveEmail(BigDecimal receiveEmail) {
		this.receiveEmail = receiveEmail;
	}

	public BigDecimal getValueMax() {
		return this.valueMax;
	}

	public void setValueMax(BigDecimal valueMax) {
		this.valueMax = valueMax;
	}

	public BigDecimal getValueMin() {
		return this.valueMin;
	}

	public void setValueMin(BigDecimal valueMin) {
		this.valueMin = valueMin;
	}

}
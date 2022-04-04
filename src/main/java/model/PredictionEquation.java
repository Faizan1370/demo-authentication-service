package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the prediction_equation database table.
 * 
 */
@Entity
@Table(name="prediction_equation")
@NamedQuery(name="PredictionEquation.findAll", query="SELECT p FROM PredictionEquation p")
public class PredictionEquation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private BigDecimal admins;

	@Column(name="between_101_350")
	private BigDecimal between101350;

	@Column(name="between_1501_4500")
	private BigDecimal between15014500;

	@Column(name="between_351_750")
	private BigDecimal between351750;

	@Column(name="between_751_1500")
	private BigDecimal between7511500;

	private BigDecimal bidders;

	private BigDecimal bids;

	@Column(name="bids_to_date")
	private BigDecimal bidsToDate;

	@Column(name="catalog_cost")
	private BigDecimal catalogCost;

	@Column(name="catalog_value")
	private BigDecimal catalogValue;

	@Column(name="daily_bidders")
	private BigDecimal dailyBidders;

	@Column(name="day_index")
	private BigDecimal dayIndex;

	private String description;

	private BigDecimal duration;

	@Column(name="email_addresses")
	private BigDecimal emailAddresses;

	@Column(name="group_id")
	private BigDecimal groupId;

	@Column(name="income_rank")
	private BigDecimal incomeRank;

	private BigDecimal intercept;

	@Column(name="interested_persons")
	private BigDecimal interestedPersons;

	@Column(name="is_live")
	private BigDecimal isLive;

	@Column(name="is_live_event")
	private BigDecimal isLiveEvent;

	private BigDecimal items;

	@Column(name="items_sold")
	private BigDecimal itemsSold;

	@Column(name="items_with_reserve")
	private BigDecimal itemsWithReserve;

	@Column(name="less_than_100")
	private BigDecimal lessThan100;

	private BigDecimal logins;

	@Column(name="median_opening_bid")
	private BigDecimal medianOpeningBid;

	@Column(name="median_value")
	private BigDecimal medianValue;

	@Column(name="net_revenue")
	private BigDecimal netRevenue;

	@Column(name="non_default_catalog_value")
	private BigDecimal nonDefaultCatalogValue;

	@Column(name="non_default_items")
	private BigDecimal nonDefaultItems;

	@Column(name="num_categories")
	private BigDecimal numCategories;

	@Column(name="num_cmp_items")
	private BigDecimal numCmpItems;

	@Column(name="over_4500")
	private BigDecimal over4500;

	@Column(name="prediction_type")
	private String predictionType;

	@Column(name="prior_experience")
	private BigDecimal priorExperience;

	private BigDecimal scope;

	@Column(name="sold_items")
	private BigDecimal soldItems;

	@Column(name="standard_error")
	private BigDecimal standardError;

	@Column(name="total_bidders")
	private BigDecimal totalBidders;

	@Column(name="total_reserve")
	private BigDecimal totalReserve;

	public PredictionEquation() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAdmins() {
		return this.admins;
	}

	public void setAdmins(BigDecimal admins) {
		this.admins = admins;
	}

	public BigDecimal getBetween101350() {
		return this.between101350;
	}

	public void setBetween101350(BigDecimal between101350) {
		this.between101350 = between101350;
	}

	public BigDecimal getBetween15014500() {
		return this.between15014500;
	}

	public void setBetween15014500(BigDecimal between15014500) {
		this.between15014500 = between15014500;
	}

	public BigDecimal getBetween351750() {
		return this.between351750;
	}

	public void setBetween351750(BigDecimal between351750) {
		this.between351750 = between351750;
	}

	public BigDecimal getBetween7511500() {
		return this.between7511500;
	}

	public void setBetween7511500(BigDecimal between7511500) {
		this.between7511500 = between7511500;
	}

	public BigDecimal getBidders() {
		return this.bidders;
	}

	public void setBidders(BigDecimal bidders) {
		this.bidders = bidders;
	}

	public BigDecimal getBids() {
		return this.bids;
	}

	public void setBids(BigDecimal bids) {
		this.bids = bids;
	}

	public BigDecimal getBidsToDate() {
		return this.bidsToDate;
	}

	public void setBidsToDate(BigDecimal bidsToDate) {
		this.bidsToDate = bidsToDate;
	}

	public BigDecimal getCatalogCost() {
		return this.catalogCost;
	}

	public void setCatalogCost(BigDecimal catalogCost) {
		this.catalogCost = catalogCost;
	}

	public BigDecimal getCatalogValue() {
		return this.catalogValue;
	}

	public void setCatalogValue(BigDecimal catalogValue) {
		this.catalogValue = catalogValue;
	}

	public BigDecimal getDailyBidders() {
		return this.dailyBidders;
	}

	public void setDailyBidders(BigDecimal dailyBidders) {
		this.dailyBidders = dailyBidders;
	}

	public BigDecimal getDayIndex() {
		return this.dayIndex;
	}

	public void setDayIndex(BigDecimal dayIndex) {
		this.dayIndex = dayIndex;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDuration() {
		return this.duration;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	public BigDecimal getEmailAddresses() {
		return this.emailAddresses;
	}

	public void setEmailAddresses(BigDecimal emailAddresses) {
		this.emailAddresses = emailAddresses;
	}

	public BigDecimal getGroupId() {
		return this.groupId;
	}

	public void setGroupId(BigDecimal groupId) {
		this.groupId = groupId;
	}

	public BigDecimal getIncomeRank() {
		return this.incomeRank;
	}

	public void setIncomeRank(BigDecimal incomeRank) {
		this.incomeRank = incomeRank;
	}

	public BigDecimal getIntercept() {
		return this.intercept;
	}

	public void setIntercept(BigDecimal intercept) {
		this.intercept = intercept;
	}

	public BigDecimal getInterestedPersons() {
		return this.interestedPersons;
	}

	public void setInterestedPersons(BigDecimal interestedPersons) {
		this.interestedPersons = interestedPersons;
	}

	public BigDecimal getIsLive() {
		return this.isLive;
	}

	public void setIsLive(BigDecimal isLive) {
		this.isLive = isLive;
	}

	public BigDecimal getIsLiveEvent() {
		return this.isLiveEvent;
	}

	public void setIsLiveEvent(BigDecimal isLiveEvent) {
		this.isLiveEvent = isLiveEvent;
	}

	public BigDecimal getItems() {
		return this.items;
	}

	public void setItems(BigDecimal items) {
		this.items = items;
	}

	public BigDecimal getItemsSold() {
		return this.itemsSold;
	}

	public void setItemsSold(BigDecimal itemsSold) {
		this.itemsSold = itemsSold;
	}

	public BigDecimal getItemsWithReserve() {
		return this.itemsWithReserve;
	}

	public void setItemsWithReserve(BigDecimal itemsWithReserve) {
		this.itemsWithReserve = itemsWithReserve;
	}

	public BigDecimal getLessThan100() {
		return this.lessThan100;
	}

	public void setLessThan100(BigDecimal lessThan100) {
		this.lessThan100 = lessThan100;
	}

	public BigDecimal getLogins() {
		return this.logins;
	}

	public void setLogins(BigDecimal logins) {
		this.logins = logins;
	}

	public BigDecimal getMedianOpeningBid() {
		return this.medianOpeningBid;
	}

	public void setMedianOpeningBid(BigDecimal medianOpeningBid) {
		this.medianOpeningBid = medianOpeningBid;
	}

	public BigDecimal getMedianValue() {
		return this.medianValue;
	}

	public void setMedianValue(BigDecimal medianValue) {
		this.medianValue = medianValue;
	}

	public BigDecimal getNetRevenue() {
		return this.netRevenue;
	}

	public void setNetRevenue(BigDecimal netRevenue) {
		this.netRevenue = netRevenue;
	}

	public BigDecimal getNonDefaultCatalogValue() {
		return this.nonDefaultCatalogValue;
	}

	public void setNonDefaultCatalogValue(BigDecimal nonDefaultCatalogValue) {
		this.nonDefaultCatalogValue = nonDefaultCatalogValue;
	}

	public BigDecimal getNonDefaultItems() {
		return this.nonDefaultItems;
	}

	public void setNonDefaultItems(BigDecimal nonDefaultItems) {
		this.nonDefaultItems = nonDefaultItems;
	}

	public BigDecimal getNumCategories() {
		return this.numCategories;
	}

	public void setNumCategories(BigDecimal numCategories) {
		this.numCategories = numCategories;
	}

	public BigDecimal getNumCmpItems() {
		return this.numCmpItems;
	}

	public void setNumCmpItems(BigDecimal numCmpItems) {
		this.numCmpItems = numCmpItems;
	}

	public BigDecimal getOver4500() {
		return this.over4500;
	}

	public void setOver4500(BigDecimal over4500) {
		this.over4500 = over4500;
	}

	public String getPredictionType() {
		return this.predictionType;
	}

	public void setPredictionType(String predictionType) {
		this.predictionType = predictionType;
	}

	public BigDecimal getPriorExperience() {
		return this.priorExperience;
	}

	public void setPriorExperience(BigDecimal priorExperience) {
		this.priorExperience = priorExperience;
	}

	public BigDecimal getScope() {
		return this.scope;
	}

	public void setScope(BigDecimal scope) {
		this.scope = scope;
	}

	public BigDecimal getSoldItems() {
		return this.soldItems;
	}

	public void setSoldItems(BigDecimal soldItems) {
		this.soldItems = soldItems;
	}

	public BigDecimal getStandardError() {
		return this.standardError;
	}

	public void setStandardError(BigDecimal standardError) {
		this.standardError = standardError;
	}

	public BigDecimal getTotalBidders() {
		return this.totalBidders;
	}

	public void setTotalBidders(BigDecimal totalBidders) {
		this.totalBidders = totalBidders;
	}

	public BigDecimal getTotalReserve() {
		return this.totalReserve;
	}

	public void setTotalReserve(BigDecimal totalReserve) {
		this.totalReserve = totalReserve;
	}

}
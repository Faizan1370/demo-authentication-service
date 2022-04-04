package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the open_multiple_items_v database table.
 * 
 */
@Entity
@Table(name="open_multiple_items_v")
@NamedQuery(name="OpenMultipleItemsV.findAll", query="SELECT o FROM OpenMultipleItemsV o")
public class OpenMultipleItemsV implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="absentee_bidding")
	private String absenteeBidding;

	@Column(name="auction_gross")
	private Integer auctionGross;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_net")
	private Integer auctionNet;

	@Column(name="award_id")
	private BigDecimal awardId;

	@Column(name="bid_increment")
	private BigDecimal bidIncrement;

	private Integer bidders;

	private Integer bids;

	@Column(name="billable_price")
	private Integer billablePrice;

	@Column(name="buy_now_price")
	private BigDecimal buyNowPrice;

	private String category;

	@Column(name="closed_date")
	private Timestamp closedDate;

	@Column(name="closeout_phase")
	private String closeoutPhase;

	@Temporal(TemporalType.DATE)
	@Column(name="cmp_date_ordered")
	private Date cmpDateOrdered;

	@Column(name="cmp_item_id")
	private BigDecimal cmpItemId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="date_published")
	private Timestamp datePublished;

	@Column(name="default_category")
	private Integer defaultCategory;

	private BigDecimal donor;

	@Column(name="early_watches")
	private Long earlyWatches;

	@Column(name="exclude_from_billing")
	private BigDecimal excludeFromBilling;

	@Column(name="finish_time_date")
	private Timestamp finishTimeDate;

	@Column(name="is_cmp_item")
	private String isCmpItem;

	@Column(name="item_cost")
	private BigDecimal itemCost;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="item_name")
	private String itemName;

	@Column(name="item_type")
	private String itemType;

	@Column(name="item_value")
	private BigDecimal itemValue;

	@Column(name="live_event")
	private Integer liveEvent;

	@Column(name="live_increase")
	private Integer liveIncrease;

	private String lot;

	@Column(name="online_biddable")
	private Integer onlineBiddable;

	@Column(name="online_donation")
	private Integer onlineDonation;

	@Column(name="online_gross")
	private Integer onlineGross;

	@Column(name="online_net")
	private Integer onlineNet;

	@Column(name="opening_bid")
	private BigDecimal openingBid;

	@Column(name="processing_phase")
	private String processingPhase;

	@Column(name="reserve_price")
	private BigDecimal reservePrice;

	private Integer sold;

	@Column(name="sold_for_price")
	private BigDecimal soldForPrice;

	@Column(name="start_time_date")
	private Timestamp startTimeDate;

	@Column(name="top_bid")
	private Integer topBid;

	@Column(name="top_bid_type")
	private String topBidType;

	@Column(name="value_display")
	private String valueDisplay;

	private String vendor;

	private String visibility;

	private Long watches;

	public OpenMultipleItemsV() {
	}

	public String getAbsenteeBidding() {
		return this.absenteeBidding;
	}

	public void setAbsenteeBidding(String absenteeBidding) {
		this.absenteeBidding = absenteeBidding;
	}

	public Integer getAuctionGross() {
		return this.auctionGross;
	}

	public void setAuctionGross(Integer auctionGross) {
		this.auctionGross = auctionGross;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public Integer getAuctionNet() {
		return this.auctionNet;
	}

	public void setAuctionNet(Integer auctionNet) {
		this.auctionNet = auctionNet;
	}

	public BigDecimal getAwardId() {
		return this.awardId;
	}

	public void setAwardId(BigDecimal awardId) {
		this.awardId = awardId;
	}

	public BigDecimal getBidIncrement() {
		return this.bidIncrement;
	}

	public void setBidIncrement(BigDecimal bidIncrement) {
		this.bidIncrement = bidIncrement;
	}

	public Integer getBidders() {
		return this.bidders;
	}

	public void setBidders(Integer bidders) {
		this.bidders = bidders;
	}

	public Integer getBids() {
		return this.bids;
	}

	public void setBids(Integer bids) {
		this.bids = bids;
	}

	public Integer getBillablePrice() {
		return this.billablePrice;
	}

	public void setBillablePrice(Integer billablePrice) {
		this.billablePrice = billablePrice;
	}

	public BigDecimal getBuyNowPrice() {
		return this.buyNowPrice;
	}

	public void setBuyNowPrice(BigDecimal buyNowPrice) {
		this.buyNowPrice = buyNowPrice;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Timestamp getClosedDate() {
		return this.closedDate;
	}

	public void setClosedDate(Timestamp closedDate) {
		this.closedDate = closedDate;
	}

	public String getCloseoutPhase() {
		return this.closeoutPhase;
	}

	public void setCloseoutPhase(String closeoutPhase) {
		this.closeoutPhase = closeoutPhase;
	}

	public Date getCmpDateOrdered() {
		return this.cmpDateOrdered;
	}

	public void setCmpDateOrdered(Date cmpDateOrdered) {
		this.cmpDateOrdered = cmpDateOrdered;
	}

	public BigDecimal getCmpItemId() {
		return this.cmpItemId;
	}

	public void setCmpItemId(BigDecimal cmpItemId) {
		this.cmpItemId = cmpItemId;
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

	public Timestamp getDatePublished() {
		return this.datePublished;
	}

	public void setDatePublished(Timestamp datePublished) {
		this.datePublished = datePublished;
	}

	public Integer getDefaultCategory() {
		return this.defaultCategory;
	}

	public void setDefaultCategory(Integer defaultCategory) {
		this.defaultCategory = defaultCategory;
	}

	public BigDecimal getDonor() {
		return this.donor;
	}

	public void setDonor(BigDecimal donor) {
		this.donor = donor;
	}

	public Long getEarlyWatches() {
		return this.earlyWatches;
	}

	public void setEarlyWatches(Long earlyWatches) {
		this.earlyWatches = earlyWatches;
	}

	public BigDecimal getExcludeFromBilling() {
		return this.excludeFromBilling;
	}

	public void setExcludeFromBilling(BigDecimal excludeFromBilling) {
		this.excludeFromBilling = excludeFromBilling;
	}

	public Timestamp getFinishTimeDate() {
		return this.finishTimeDate;
	}

	public void setFinishTimeDate(Timestamp finishTimeDate) {
		this.finishTimeDate = finishTimeDate;
	}

	public String getIsCmpItem() {
		return this.isCmpItem;
	}

	public void setIsCmpItem(String isCmpItem) {
		this.isCmpItem = isCmpItem;
	}

	public BigDecimal getItemCost() {
		return this.itemCost;
	}

	public void setItemCost(BigDecimal itemCost) {
		this.itemCost = itemCost;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public BigDecimal getItemValue() {
		return this.itemValue;
	}

	public void setItemValue(BigDecimal itemValue) {
		this.itemValue = itemValue;
	}

	public Integer getLiveEvent() {
		return this.liveEvent;
	}

	public void setLiveEvent(Integer liveEvent) {
		this.liveEvent = liveEvent;
	}

	public Integer getLiveIncrease() {
		return this.liveIncrease;
	}

	public void setLiveIncrease(Integer liveIncrease) {
		this.liveIncrease = liveIncrease;
	}

	public String getLot() {
		return this.lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public Integer getOnlineBiddable() {
		return this.onlineBiddable;
	}

	public void setOnlineBiddable(Integer onlineBiddable) {
		this.onlineBiddable = onlineBiddable;
	}

	public Integer getOnlineDonation() {
		return this.onlineDonation;
	}

	public void setOnlineDonation(Integer onlineDonation) {
		this.onlineDonation = onlineDonation;
	}

	public Integer getOnlineGross() {
		return this.onlineGross;
	}

	public void setOnlineGross(Integer onlineGross) {
		this.onlineGross = onlineGross;
	}

	public Integer getOnlineNet() {
		return this.onlineNet;
	}

	public void setOnlineNet(Integer onlineNet) {
		this.onlineNet = onlineNet;
	}

	public BigDecimal getOpeningBid() {
		return this.openingBid;
	}

	public void setOpeningBid(BigDecimal openingBid) {
		this.openingBid = openingBid;
	}

	public String getProcessingPhase() {
		return this.processingPhase;
	}

	public void setProcessingPhase(String processingPhase) {
		this.processingPhase = processingPhase;
	}

	public BigDecimal getReservePrice() {
		return this.reservePrice;
	}

	public void setReservePrice(BigDecimal reservePrice) {
		this.reservePrice = reservePrice;
	}

	public Integer getSold() {
		return this.sold;
	}

	public void setSold(Integer sold) {
		this.sold = sold;
	}

	public BigDecimal getSoldForPrice() {
		return this.soldForPrice;
	}

	public void setSoldForPrice(BigDecimal soldForPrice) {
		this.soldForPrice = soldForPrice;
	}

	public Timestamp getStartTimeDate() {
		return this.startTimeDate;
	}

	public void setStartTimeDate(Timestamp startTimeDate) {
		this.startTimeDate = startTimeDate;
	}

	public Integer getTopBid() {
		return this.topBid;
	}

	public void setTopBid(Integer topBid) {
		this.topBid = topBid;
	}

	public String getTopBidType() {
		return this.topBidType;
	}

	public void setTopBidType(String topBidType) {
		this.topBidType = topBidType;
	}

	public String getValueDisplay() {
		return this.valueDisplay;
	}

	public void setValueDisplay(String valueDisplay) {
		this.valueDisplay = valueDisplay;
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public Long getWatches() {
		return this.watches;
	}

	public void setWatches(Long watches) {
		this.watches = watches;
	}

}
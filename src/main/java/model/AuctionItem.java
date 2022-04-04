package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the auction_item database table.
 * 
 */
@Entity
@Table(name="auction_item")
@NamedQuery(name="AuctionItem.findAll", query="SELECT a FROM AuctionItem a")
public class AuctionItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="b4g_optin")
	private BigDecimal b4gOptin;

	@Column(name="bid_increment")
	private BigDecimal bidIncrement;

	@Column(name="bidding_type")
	private String biddingType;

	@Column(name="buy_now_price")
	private BigDecimal buyNowPrice;

	@Column(name="category_default")
	private BigDecimal categoryDefault;

	@Column(name="category_id")
	private BigDecimal categoryId;

	@Column(name="closed_date")
	private Timestamp closedDate;

	@Column(name="closeout_phase")
	private String closeoutPhase;

	@Column(name="cm_item_id")
	private String cmItemId;

	@Column(name="cmp_sku")
	private String cmpSku;

	private BigDecimal cost;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="date_published")
	private Timestamp datePublished;

	@Column(name="description_id")
	private BigDecimal descriptionId;

	@Column(name="donation_id")
	private BigDecimal donationId;

	@Column(name="entered_location")
	private String enteredLocation;

	@Column(name="exclude_from_billing")
	private BigDecimal excludeFromBilling;

	@Column(name="exclude_from_billing_date")
	private Timestamp excludeFromBillingDate;

	private BigDecimal featured;

	@Column(name="is_default_close")
	private BigDecimal isDefaultClose;

	@Column(name="is_default_open")
	private BigDecimal isDefaultOpen;

	@Column(name="item_type")
	private BigDecimal itemType;

	@Column(name="leading_bid")
	private BigDecimal leadingBid;

	@Column(name="line_item_id")
	private BigDecimal lineItemId;

	@Column(name="live_event")
	private BigDecimal liveEvent;

	@Column(name="location_id")
	private BigDecimal locationId;

	private String lot;

	private String name;

	@Column(name="online_biddable")
	private BigDecimal onlineBiddable;

	@Column(name="online_close")
	private Timestamp onlineClose;

	@Column(name="online_open")
	private Timestamp onlineOpen;

	@Column(name="opening_bid")
	private BigDecimal openingBid;

	@Column(name="pre_extension_close")
	private Timestamp preExtensionClose;

	@Column(name="processing_phase")
	private String processingPhase;

	@Column(name="purchase_id")
	private BigDecimal purchaseId;

	private BigDecimal quantity;

	private BigDecimal reserve;

	@Column(name="section_id")
	private BigDecimal sectionId;

	@Column(name="sortable_lot")
	private String sortableLot;

	private BigDecimal value;

	@Column(name="value_display")
	private String valueDisplay;

	@Column(name="value_sort")
	private BigDecimal valueSort;

	@Column(name="vendor_id")
	private BigDecimal vendorId;

	private String visibility;

	@Column(name="winning_bid_id")
	private BigDecimal winningBidId;

	public AuctionItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getB4gOptin() {
		return this.b4gOptin;
	}

	public void setB4gOptin(BigDecimal b4gOptin) {
		this.b4gOptin = b4gOptin;
	}

	public BigDecimal getBidIncrement() {
		return this.bidIncrement;
	}

	public void setBidIncrement(BigDecimal bidIncrement) {
		this.bidIncrement = bidIncrement;
	}

	public String getBiddingType() {
		return this.biddingType;
	}

	public void setBiddingType(String biddingType) {
		this.biddingType = biddingType;
	}

	public BigDecimal getBuyNowPrice() {
		return this.buyNowPrice;
	}

	public void setBuyNowPrice(BigDecimal buyNowPrice) {
		this.buyNowPrice = buyNowPrice;
	}

	public BigDecimal getCategoryDefault() {
		return this.categoryDefault;
	}

	public void setCategoryDefault(BigDecimal categoryDefault) {
		this.categoryDefault = categoryDefault;
	}

	public BigDecimal getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(BigDecimal categoryId) {
		this.categoryId = categoryId;
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

	public String getCmItemId() {
		return this.cmItemId;
	}

	public void setCmItemId(String cmItemId) {
		this.cmItemId = cmItemId;
	}

	public String getCmpSku() {
		return this.cmpSku;
	}

	public void setCmpSku(String cmpSku) {
		this.cmpSku = cmpSku;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public BigDecimal getDescriptionId() {
		return this.descriptionId;
	}

	public void setDescriptionId(BigDecimal descriptionId) {
		this.descriptionId = descriptionId;
	}

	public BigDecimal getDonationId() {
		return this.donationId;
	}

	public void setDonationId(BigDecimal donationId) {
		this.donationId = donationId;
	}

	public String getEnteredLocation() {
		return this.enteredLocation;
	}

	public void setEnteredLocation(String enteredLocation) {
		this.enteredLocation = enteredLocation;
	}

	public BigDecimal getExcludeFromBilling() {
		return this.excludeFromBilling;
	}

	public void setExcludeFromBilling(BigDecimal excludeFromBilling) {
		this.excludeFromBilling = excludeFromBilling;
	}

	public Timestamp getExcludeFromBillingDate() {
		return this.excludeFromBillingDate;
	}

	public void setExcludeFromBillingDate(Timestamp excludeFromBillingDate) {
		this.excludeFromBillingDate = excludeFromBillingDate;
	}

	public BigDecimal getFeatured() {
		return this.featured;
	}

	public void setFeatured(BigDecimal featured) {
		this.featured = featured;
	}

	public BigDecimal getIsDefaultClose() {
		return this.isDefaultClose;
	}

	public void setIsDefaultClose(BigDecimal isDefaultClose) {
		this.isDefaultClose = isDefaultClose;
	}

	public BigDecimal getIsDefaultOpen() {
		return this.isDefaultOpen;
	}

	public void setIsDefaultOpen(BigDecimal isDefaultOpen) {
		this.isDefaultOpen = isDefaultOpen;
	}

	public BigDecimal getItemType() {
		return this.itemType;
	}

	public void setItemType(BigDecimal itemType) {
		this.itemType = itemType;
	}

	public BigDecimal getLeadingBid() {
		return this.leadingBid;
	}

	public void setLeadingBid(BigDecimal leadingBid) {
		this.leadingBid = leadingBid;
	}

	public BigDecimal getLineItemId() {
		return this.lineItemId;
	}

	public void setLineItemId(BigDecimal lineItemId) {
		this.lineItemId = lineItemId;
	}

	public BigDecimal getLiveEvent() {
		return this.liveEvent;
	}

	public void setLiveEvent(BigDecimal liveEvent) {
		this.liveEvent = liveEvent;
	}

	public BigDecimal getLocationId() {
		return this.locationId;
	}

	public void setLocationId(BigDecimal locationId) {
		this.locationId = locationId;
	}

	public String getLot() {
		return this.lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getOnlineBiddable() {
		return this.onlineBiddable;
	}

	public void setOnlineBiddable(BigDecimal onlineBiddable) {
		this.onlineBiddable = onlineBiddable;
	}

	public Timestamp getOnlineClose() {
		return this.onlineClose;
	}

	public void setOnlineClose(Timestamp onlineClose) {
		this.onlineClose = onlineClose;
	}

	public Timestamp getOnlineOpen() {
		return this.onlineOpen;
	}

	public void setOnlineOpen(Timestamp onlineOpen) {
		this.onlineOpen = onlineOpen;
	}

	public BigDecimal getOpeningBid() {
		return this.openingBid;
	}

	public void setOpeningBid(BigDecimal openingBid) {
		this.openingBid = openingBid;
	}

	public Timestamp getPreExtensionClose() {
		return this.preExtensionClose;
	}

	public void setPreExtensionClose(Timestamp preExtensionClose) {
		this.preExtensionClose = preExtensionClose;
	}

	public String getProcessingPhase() {
		return this.processingPhase;
	}

	public void setProcessingPhase(String processingPhase) {
		this.processingPhase = processingPhase;
	}

	public BigDecimal getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(BigDecimal purchaseId) {
		this.purchaseId = purchaseId;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getReserve() {
		return this.reserve;
	}

	public void setReserve(BigDecimal reserve) {
		this.reserve = reserve;
	}

	public BigDecimal getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(BigDecimal sectionId) {
		this.sectionId = sectionId;
	}

	public String getSortableLot() {
		return this.sortableLot;
	}

	public void setSortableLot(String sortableLot) {
		this.sortableLot = sortableLot;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getValueDisplay() {
		return this.valueDisplay;
	}

	public void setValueDisplay(String valueDisplay) {
		this.valueDisplay = valueDisplay;
	}

	public BigDecimal getValueSort() {
		return this.valueSort;
	}

	public void setValueSort(BigDecimal valueSort) {
		this.valueSort = valueSort;
	}

	public BigDecimal getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(BigDecimal vendorId) {
		this.vendorId = vendorId;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public BigDecimal getWinningBidId() {
		return this.winningBidId;
	}

	public void setWinningBidId(BigDecimal winningBidId) {
		this.winningBidId = winningBidId;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the item_rollup_v database table.
 * 
 */
@Entity
@Table(name="item_rollup_v")
@NamedQuery(name="ItemRollupV.findAll", query="SELECT i FROM ItemRollupV i")
public class ItemRollupV implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_gross")
	private BigDecimal auctionGross;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_net")
	private BigDecimal auctionNet;

	@Column(name="avg_value")
	private BigDecimal avgValue;

	@Column(name="between_101_350")
	private Long between101350;

	@Column(name="between_1501_4500")
	private Long between15014500;

	@Column(name="between_351_750")
	private Long between351750;

	@Column(name="between_751_1500")
	private Long between7511500;

	@Column(name="biddable_items")
	private Long biddableItems;

	@Column(name="billing_gms")
	private double billingGms;

	@Column(name="buy_now_only_items")
	private Long buyNowOnlyItems;

	@Column(name="catalog_cost")
	private BigDecimal catalogCost;

	@Column(name="catalog_value")
	private BigDecimal catalogValue;

	@Column(name="cmp_items_sold")
	private Long cmpItemsSold;

	@Column(name="cmp_net_revenue")
	private BigDecimal cmpNetRevenue;

	@Column(name="cost_closed_cmp_items")
	private BigDecimal costClosedCmpItems;

	@Column(name="cost_items_with_bids")
	private BigDecimal costItemsWithBids;

	@Column(name="cost_sold_items")
	private BigDecimal costSoldItems;

	@Column(name="default_cat_items")
	private Long defaultCatItems;

	@Column(name="default_cat_value")
	private BigDecimal defaultCatValue;

	@Column(name="donated_item_revenue")
	private BigDecimal donatedItemRevenue;

	@Column(name="donated_items")
	private Long donatedItems;

	private Long donors;

	private Long draft;

	private Long ispublished;

	private Long items;

	@Column(name="items_with_bids")
	private Long itemsWithBids;

	@Column(name="items_with_reserve")
	private Long itemsWithReserve;

	@Column(name="less_than_100")
	private Long lessThan100;

	@Column(name="live_event_items")
	private Long liveEventItems;

	@Column(name="live_revenue")
	private double liveRevenue;

	@Column(name="median_opening_bid")
	private BigDecimal medianOpeningBid;

	@Column(name="median_sale_price")
	private BigDecimal medianSalePrice;

	@Column(name="median_value")
	private BigDecimal medianValue;

	@Column(name="num_categories")
	private Long numCategories;

	@Column(name="num_cmp_items")
	private Long numCmpItems;

	@Column(name="num_early_watches")
	private BigDecimal numEarlyWatches;

	@Column(name="num_watches")
	private BigDecimal numWatches;

	@Column(name="online_gross")
	private double onlineGross;

	@Column(name="online_net")
	private double onlineNet;

	@Column(name="over_4500")
	private Long over4500;

	@Column(name="sold_items")
	private Long soldItems;

	@Column(name="top_item_sale")
	private BigDecimal topItemSale;

	@Column(name="total_high_bids")
	private double totalHighBids;

	@Column(name="total_reserve")
	private BigDecimal totalReserve;

	@Column(name="unsold_items")
	private Long unsoldItems;

	public ItemRollupV() {
	}

	public BigDecimal getAuctionGross() {
		return this.auctionGross;
	}

	public void setAuctionGross(BigDecimal auctionGross) {
		this.auctionGross = auctionGross;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getAuctionNet() {
		return this.auctionNet;
	}

	public void setAuctionNet(BigDecimal auctionNet) {
		this.auctionNet = auctionNet;
	}

	public BigDecimal getAvgValue() {
		return this.avgValue;
	}

	public void setAvgValue(BigDecimal avgValue) {
		this.avgValue = avgValue;
	}

	public Long getBetween101350() {
		return this.between101350;
	}

	public void setBetween101350(Long between101350) {
		this.between101350 = between101350;
	}

	public Long getBetween15014500() {
		return this.between15014500;
	}

	public void setBetween15014500(Long between15014500) {
		this.between15014500 = between15014500;
	}

	public Long getBetween351750() {
		return this.between351750;
	}

	public void setBetween351750(Long between351750) {
		this.between351750 = between351750;
	}

	public Long getBetween7511500() {
		return this.between7511500;
	}

	public void setBetween7511500(Long between7511500) {
		this.between7511500 = between7511500;
	}

	public Long getBiddableItems() {
		return this.biddableItems;
	}

	public void setBiddableItems(Long biddableItems) {
		this.biddableItems = biddableItems;
	}

	public double getBillingGms() {
		return this.billingGms;
	}

	public void setBillingGms(double billingGms) {
		this.billingGms = billingGms;
	}

	public Long getBuyNowOnlyItems() {
		return this.buyNowOnlyItems;
	}

	public void setBuyNowOnlyItems(Long buyNowOnlyItems) {
		this.buyNowOnlyItems = buyNowOnlyItems;
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

	public Long getCmpItemsSold() {
		return this.cmpItemsSold;
	}

	public void setCmpItemsSold(Long cmpItemsSold) {
		this.cmpItemsSold = cmpItemsSold;
	}

	public BigDecimal getCmpNetRevenue() {
		return this.cmpNetRevenue;
	}

	public void setCmpNetRevenue(BigDecimal cmpNetRevenue) {
		this.cmpNetRevenue = cmpNetRevenue;
	}

	public BigDecimal getCostClosedCmpItems() {
		return this.costClosedCmpItems;
	}

	public void setCostClosedCmpItems(BigDecimal costClosedCmpItems) {
		this.costClosedCmpItems = costClosedCmpItems;
	}

	public BigDecimal getCostItemsWithBids() {
		return this.costItemsWithBids;
	}

	public void setCostItemsWithBids(BigDecimal costItemsWithBids) {
		this.costItemsWithBids = costItemsWithBids;
	}

	public BigDecimal getCostSoldItems() {
		return this.costSoldItems;
	}

	public void setCostSoldItems(BigDecimal costSoldItems) {
		this.costSoldItems = costSoldItems;
	}

	public Long getDefaultCatItems() {
		return this.defaultCatItems;
	}

	public void setDefaultCatItems(Long defaultCatItems) {
		this.defaultCatItems = defaultCatItems;
	}

	public BigDecimal getDefaultCatValue() {
		return this.defaultCatValue;
	}

	public void setDefaultCatValue(BigDecimal defaultCatValue) {
		this.defaultCatValue = defaultCatValue;
	}

	public BigDecimal getDonatedItemRevenue() {
		return this.donatedItemRevenue;
	}

	public void setDonatedItemRevenue(BigDecimal donatedItemRevenue) {
		this.donatedItemRevenue = donatedItemRevenue;
	}

	public Long getDonatedItems() {
		return this.donatedItems;
	}

	public void setDonatedItems(Long donatedItems) {
		this.donatedItems = donatedItems;
	}

	public Long getDonors() {
		return this.donors;
	}

	public void setDonors(Long donors) {
		this.donors = donors;
	}

	public Long getDraft() {
		return this.draft;
	}

	public void setDraft(Long draft) {
		this.draft = draft;
	}

	public Long getIspublished() {
		return this.ispublished;
	}

	public void setIspublished(Long ispublished) {
		this.ispublished = ispublished;
	}

	public Long getItems() {
		return this.items;
	}

	public void setItems(Long items) {
		this.items = items;
	}

	public Long getItemsWithBids() {
		return this.itemsWithBids;
	}

	public void setItemsWithBids(Long itemsWithBids) {
		this.itemsWithBids = itemsWithBids;
	}

	public Long getItemsWithReserve() {
		return this.itemsWithReserve;
	}

	public void setItemsWithReserve(Long itemsWithReserve) {
		this.itemsWithReserve = itemsWithReserve;
	}

	public Long getLessThan100() {
		return this.lessThan100;
	}

	public void setLessThan100(Long lessThan100) {
		this.lessThan100 = lessThan100;
	}

	public Long getLiveEventItems() {
		return this.liveEventItems;
	}

	public void setLiveEventItems(Long liveEventItems) {
		this.liveEventItems = liveEventItems;
	}

	public double getLiveRevenue() {
		return this.liveRevenue;
	}

	public void setLiveRevenue(double liveRevenue) {
		this.liveRevenue = liveRevenue;
	}

	public BigDecimal getMedianOpeningBid() {
		return this.medianOpeningBid;
	}

	public void setMedianOpeningBid(BigDecimal medianOpeningBid) {
		this.medianOpeningBid = medianOpeningBid;
	}

	public BigDecimal getMedianSalePrice() {
		return this.medianSalePrice;
	}

	public void setMedianSalePrice(BigDecimal medianSalePrice) {
		this.medianSalePrice = medianSalePrice;
	}

	public BigDecimal getMedianValue() {
		return this.medianValue;
	}

	public void setMedianValue(BigDecimal medianValue) {
		this.medianValue = medianValue;
	}

	public Long getNumCategories() {
		return this.numCategories;
	}

	public void setNumCategories(Long numCategories) {
		this.numCategories = numCategories;
	}

	public Long getNumCmpItems() {
		return this.numCmpItems;
	}

	public void setNumCmpItems(Long numCmpItems) {
		this.numCmpItems = numCmpItems;
	}

	public BigDecimal getNumEarlyWatches() {
		return this.numEarlyWatches;
	}

	public void setNumEarlyWatches(BigDecimal numEarlyWatches) {
		this.numEarlyWatches = numEarlyWatches;
	}

	public BigDecimal getNumWatches() {
		return this.numWatches;
	}

	public void setNumWatches(BigDecimal numWatches) {
		this.numWatches = numWatches;
	}

	public double getOnlineGross() {
		return this.onlineGross;
	}

	public void setOnlineGross(double onlineGross) {
		this.onlineGross = onlineGross;
	}

	public double getOnlineNet() {
		return this.onlineNet;
	}

	public void setOnlineNet(double onlineNet) {
		this.onlineNet = onlineNet;
	}

	public Long getOver4500() {
		return this.over4500;
	}

	public void setOver4500(Long over4500) {
		this.over4500 = over4500;
	}

	public Long getSoldItems() {
		return this.soldItems;
	}

	public void setSoldItems(Long soldItems) {
		this.soldItems = soldItems;
	}

	public BigDecimal getTopItemSale() {
		return this.topItemSale;
	}

	public void setTopItemSale(BigDecimal topItemSale) {
		this.topItemSale = topItemSale;
	}

	public double getTotalHighBids() {
		return this.totalHighBids;
	}

	public void setTotalHighBids(double totalHighBids) {
		this.totalHighBids = totalHighBids;
	}

	public BigDecimal getTotalReserve() {
		return this.totalReserve;
	}

	public void setTotalReserve(BigDecimal totalReserve) {
		this.totalReserve = totalReserve;
	}

	public Long getUnsoldItems() {
		return this.unsoldItems;
	}

	public void setUnsoldItems(Long unsoldItems) {
		this.unsoldItems = unsoldItems;
	}

}
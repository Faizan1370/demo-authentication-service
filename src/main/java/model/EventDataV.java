package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the event_data_v database table.
 * 
 */
@Entity
@Table(name="event_data_v")
@NamedQuery(name="EventDataV.findAll", query="SELECT e FROM EventDataV e")
public class EventDataV implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="active_homepage")
	private BigDecimal activeHomepage;

	private String alias;

	@Column(name="auction_gross")
	private BigDecimal auctionGross;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_net")
	private BigDecimal auctionNet;

	@Column(name="avg_value")
	private BigDecimal avgValue;

	@Column(name="b4g_bidders")
	private Long b4gBidders;

	@Column(name="b4g_bids")
	private Long b4gBids;

	@Column(name="b4g_winning_bid_amounts")
	private double b4gWinningBidAmounts;

	@Column(name="b4g_winning_bids")
	private Long b4gWinningBids;

	@Column(name="between_101_350")
	private Long between101350;

	@Column(name="between_1501_4500")
	private Long between15014500;

	@Column(name="between_351_750")
	private Long between351750;

	@Column(name="between_751_1500")
	private Long between7511500;

	@Column(name="bid_extension")
	private Integer bidExtension;

	@Column(name="biddable_items")
	private Long biddableItems;

	private Long bidders;

	private BigDecimal bids;

	@Column(name="billing_gms")
	private double billingGms;

	@Column(name="buy_now_only_items")
	private Long buyNowOnlyItems;

	@Column(name="buy_nows")
	private BigDecimal buyNows;

	@Column(name="cash_donation_amount")
	private BigDecimal cashDonationAmount;

	@Column(name="cash_donations")
	private Long cashDonations;

	@Column(name="catalog_cost")
	private BigDecimal catalogCost;

	@Column(name="catalog_value")
	private BigDecimal catalogValue;

	@Column(name="client_code")
	private String clientCode;

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

	private Integer duration;

	@Column(name="email_clicks")
	private BigDecimal emailClicks;

	@Column(name="email_delivered")
	private BigDecimal emailDelivered;

	@Column(name="email_jobs")
	private Long emailJobs;

	@Column(name="email_opens")
	private BigDecimal emailOpens;

	@Column(name="emails_sent")
	private BigDecimal emailsSent;

	@Column(name="event_name")
	private String eventName;

	@Temporal(TemporalType.DATE)
	@Column(name="event_sign_date")
	private Date eventSignDate;

	@Temporal(TemporalType.DATE)
	@Column(name="finish_date")
	private Date finishDate;

	@Column(name="get_ready_complete")
	private Integer getReadyComplete;

	@Column(name="group_id")
	private Integer groupId;

	@Column(name="income_rank")
	private Integer incomeRank;

	@Column(name="interested_persons")
	private Long interestedPersons;

	@Column(name="is_live_event")
	private String isLiveEvent;

	private Integer isprimary;

	private Long ispublished;

	private Long items;

	@Column(name="items_with_bids")
	private Long itemsWithBids;

	@Column(name="items_with_reserve")
	private Long itemsWithReserve;

	@Temporal(TemporalType.DATE)
	@Column(name="last_modified")
	private Date lastModified;

	@Column(name="less_than_100")
	private Long lessThan100;

	@Column(name="live_event_items")
	private Long liveEventItems;

	@Column(name="live_revenue")
	private double liveRevenue;

	@Temporal(TemporalType.DATE)
	private Date liveeventdate;

	@Column(name="median_opening_bid")
	private BigDecimal medianOpeningBid;

	@Column(name="median_sale_price")
	private BigDecimal medianSalePrice;

	@Column(name="median_value")
	private BigDecimal medianValue;

	@Temporal(TemporalType.DATE)
	@Column(name="merch_selected")
	private Date merchSelected;

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

	@Column(name="opt_biddersearch")
	private Integer optBiddersearch;

	@Column(name="org_id")
	private BigDecimal orgId;

	@Column(name="over_4500")
	private Long over4500;

	@Column(name="population_rank")
	private Integer populationRank;

	private String processorpackage;

	private String product;

	@Column(name="quick_sale_revenue")
	private BigDecimal quickSaleRevenue;

	@Column(name="registered_users")
	private Long registeredUsers;

	private Long repeat;

	@Column(name="sold_items")
	private Long soldItems;

	@Column(name="sponsor_value")
	private BigDecimal sponsorValue;

	private Long sponsors;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	@Column(name="ticket_orders")
	private Long ticketOrders;

	@Column(name="ticket_revenue")
	private BigDecimal ticketRevenue;

	@Column(name="top_item_sale")
	private BigDecimal topItemSale;

	@Column(name="total_high_bids")
	private double totalHighBids;

	@Column(name="total_reserve")
	private BigDecimal totalReserve;

	@Column(name="total_tickets")
	private BigDecimal totalTickets;

	@Column(name="unsold_items")
	private Long unsoldItems;

	public EventDataV() {
	}

	public BigDecimal getActiveHomepage() {
		return this.activeHomepage;
	}

	public void setActiveHomepage(BigDecimal activeHomepage) {
		this.activeHomepage = activeHomepage;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
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

	public Long getB4gBidders() {
		return this.b4gBidders;
	}

	public void setB4gBidders(Long b4gBidders) {
		this.b4gBidders = b4gBidders;
	}

	public Long getB4gBids() {
		return this.b4gBids;
	}

	public void setB4gBids(Long b4gBids) {
		this.b4gBids = b4gBids;
	}

	public double getB4gWinningBidAmounts() {
		return this.b4gWinningBidAmounts;
	}

	public void setB4gWinningBidAmounts(double b4gWinningBidAmounts) {
		this.b4gWinningBidAmounts = b4gWinningBidAmounts;
	}

	public Long getB4gWinningBids() {
		return this.b4gWinningBids;
	}

	public void setB4gWinningBids(Long b4gWinningBids) {
		this.b4gWinningBids = b4gWinningBids;
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

	public Integer getBidExtension() {
		return this.bidExtension;
	}

	public void setBidExtension(Integer bidExtension) {
		this.bidExtension = bidExtension;
	}

	public Long getBiddableItems() {
		return this.biddableItems;
	}

	public void setBiddableItems(Long biddableItems) {
		this.biddableItems = biddableItems;
	}

	public Long getBidders() {
		return this.bidders;
	}

	public void setBidders(Long bidders) {
		this.bidders = bidders;
	}

	public BigDecimal getBids() {
		return this.bids;
	}

	public void setBids(BigDecimal bids) {
		this.bids = bids;
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

	public BigDecimal getBuyNows() {
		return this.buyNows;
	}

	public void setBuyNows(BigDecimal buyNows) {
		this.buyNows = buyNows;
	}

	public BigDecimal getCashDonationAmount() {
		return this.cashDonationAmount;
	}

	public void setCashDonationAmount(BigDecimal cashDonationAmount) {
		this.cashDonationAmount = cashDonationAmount;
	}

	public Long getCashDonations() {
		return this.cashDonations;
	}

	public void setCashDonations(Long cashDonations) {
		this.cashDonations = cashDonations;
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

	public String getClientCode() {
		return this.clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
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

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public BigDecimal getEmailClicks() {
		return this.emailClicks;
	}

	public void setEmailClicks(BigDecimal emailClicks) {
		this.emailClicks = emailClicks;
	}

	public BigDecimal getEmailDelivered() {
		return this.emailDelivered;
	}

	public void setEmailDelivered(BigDecimal emailDelivered) {
		this.emailDelivered = emailDelivered;
	}

	public Long getEmailJobs() {
		return this.emailJobs;
	}

	public void setEmailJobs(Long emailJobs) {
		this.emailJobs = emailJobs;
	}

	public BigDecimal getEmailOpens() {
		return this.emailOpens;
	}

	public void setEmailOpens(BigDecimal emailOpens) {
		this.emailOpens = emailOpens;
	}

	public BigDecimal getEmailsSent() {
		return this.emailsSent;
	}

	public void setEmailsSent(BigDecimal emailsSent) {
		this.emailsSent = emailsSent;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getEventSignDate() {
		return this.eventSignDate;
	}

	public void setEventSignDate(Date eventSignDate) {
		this.eventSignDate = eventSignDate;
	}

	public Date getFinishDate() {
		return this.finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public Integer getGetReadyComplete() {
		return this.getReadyComplete;
	}

	public void setGetReadyComplete(Integer getReadyComplete) {
		this.getReadyComplete = getReadyComplete;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getIncomeRank() {
		return this.incomeRank;
	}

	public void setIncomeRank(Integer incomeRank) {
		this.incomeRank = incomeRank;
	}

	public Long getInterestedPersons() {
		return this.interestedPersons;
	}

	public void setInterestedPersons(Long interestedPersons) {
		this.interestedPersons = interestedPersons;
	}

	public String getIsLiveEvent() {
		return this.isLiveEvent;
	}

	public void setIsLiveEvent(String isLiveEvent) {
		this.isLiveEvent = isLiveEvent;
	}

	public Integer getIsprimary() {
		return this.isprimary;
	}

	public void setIsprimary(Integer isprimary) {
		this.isprimary = isprimary;
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

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
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

	public Date getLiveeventdate() {
		return this.liveeventdate;
	}

	public void setLiveeventdate(Date liveeventdate) {
		this.liveeventdate = liveeventdate;
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

	public Date getMerchSelected() {
		return this.merchSelected;
	}

	public void setMerchSelected(Date merchSelected) {
		this.merchSelected = merchSelected;
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

	public Integer getOptBiddersearch() {
		return this.optBiddersearch;
	}

	public void setOptBiddersearch(Integer optBiddersearch) {
		this.optBiddersearch = optBiddersearch;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	public Long getOver4500() {
		return this.over4500;
	}

	public void setOver4500(Long over4500) {
		this.over4500 = over4500;
	}

	public Integer getPopulationRank() {
		return this.populationRank;
	}

	public void setPopulationRank(Integer populationRank) {
		this.populationRank = populationRank;
	}

	public String getProcessorpackage() {
		return this.processorpackage;
	}

	public void setProcessorpackage(String processorpackage) {
		this.processorpackage = processorpackage;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public BigDecimal getQuickSaleRevenue() {
		return this.quickSaleRevenue;
	}

	public void setQuickSaleRevenue(BigDecimal quickSaleRevenue) {
		this.quickSaleRevenue = quickSaleRevenue;
	}

	public Long getRegisteredUsers() {
		return this.registeredUsers;
	}

	public void setRegisteredUsers(Long registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

	public Long getRepeat() {
		return this.repeat;
	}

	public void setRepeat(Long repeat) {
		this.repeat = repeat;
	}

	public Long getSoldItems() {
		return this.soldItems;
	}

	public void setSoldItems(Long soldItems) {
		this.soldItems = soldItems;
	}

	public BigDecimal getSponsorValue() {
		return this.sponsorValue;
	}

	public void setSponsorValue(BigDecimal sponsorValue) {
		this.sponsorValue = sponsorValue;
	}

	public Long getSponsors() {
		return this.sponsors;
	}

	public void setSponsors(Long sponsors) {
		this.sponsors = sponsors;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Long getTicketOrders() {
		return this.ticketOrders;
	}

	public void setTicketOrders(Long ticketOrders) {
		this.ticketOrders = ticketOrders;
	}

	public BigDecimal getTicketRevenue() {
		return this.ticketRevenue;
	}

	public void setTicketRevenue(BigDecimal ticketRevenue) {
		this.ticketRevenue = ticketRevenue;
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

	public BigDecimal getTotalTickets() {
		return this.totalTickets;
	}

	public void setTotalTickets(BigDecimal totalTickets) {
		this.totalTickets = totalTickets;
	}

	public Long getUnsoldItems() {
		return this.unsoldItems;
	}

	public void setUnsoldItems(Long unsoldItems) {
		this.unsoldItems = unsoldItems;
	}

}
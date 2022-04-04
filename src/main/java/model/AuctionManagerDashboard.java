package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the auction_manager_dashboard database table.
 * 
 */
@Entity
@Table(name="auction_manager_dashboard")
@NamedQuery(name="AuctionManagerDashboard.findAll", query="SELECT a FROM AuctionManagerDashboard a")
public class AuctionManagerDashboard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bidding_revenue")
	private double biddingRevenue;

	@Column(name="bids_per_bidder")
	private BigDecimal bidsPerBidder;

	@Column(name="bids_placed")
	private BigDecimal bidsPlaced;

	@Column(name="cash_revenue")
	private BigDecimal cashRevenue;

	@Column(name="catalog_value")
	private BigDecimal catalogValue;

	@Temporal(TemporalType.DATE)
	@Column(name="date_close")
	private Date dateClose;

	@Temporal(TemporalType.DATE)
	@Column(name="date_event")
	private Date dateEvent;

	@Temporal(TemporalType.DATE)
	@Column(name="date_open")
	private Date dateOpen;

	@Column(name="email_jobs")
	private Long emailJobs;

	@Column(name="email1_addresses")
	private BigDecimal email1Addresses;

	@Column(name="email1_clicked")
	private BigDecimal email1Clicked;

	@Column(name="email1_delivered")
	private BigDecimal email1Delivered;

	@Column(name="email1_name")
	private String email1Name;

	@Column(name="email1_opened")
	private BigDecimal email1Opened;

	@Column(name="email1_sent")
	private Timestamp email1Sent;

	@Column(name="email2_addresses")
	private BigDecimal email2Addresses;

	@Column(name="email2_clicked")
	private BigDecimal email2Clicked;

	@Column(name="email2_delivered")
	private BigDecimal email2Delivered;

	@Column(name="email2_name")
	private String email2Name;

	@Column(name="email2_opened")
	private BigDecimal email2Opened;

	@Column(name="email2_sent")
	private Timestamp email2Sent;

	@Column(name="email3_addresses")
	private BigDecimal email3Addresses;

	@Column(name="email3_clicked")
	private BigDecimal email3Clicked;

	@Column(name="email3_delivered")
	private BigDecimal email3Delivered;

	@Column(name="email3_name")
	private String email3Name;

	@Column(name="email3_opened")
	private BigDecimal email3Opened;

	@Column(name="email3_sent")
	private Timestamp email3Sent;

	@Column(name="emails_clicked")
	private BigDecimal emailsClicked;

	@Column(name="emails_delivered")
	private BigDecimal emailsDelivered;

	@Column(name="emails_opened")
	private BigDecimal emailsOpened;

	@Column(name="emails_sent")
	private BigDecimal emailsSent;

	private BigDecimal id;

	@Column(name="item_cost")
	private BigDecimal itemCost;

	@Column(name="num_bids_range1")
	private Integer numBidsRange1;

	@Column(name="num_bids_range2")
	private Integer numBidsRange2;

	@Column(name="num_bids_range3")
	private Integer numBidsRange3;

	@Column(name="num_bids_range4")
	private Integer numBidsRange4;

	@Column(name="num_bids_range5")
	private Integer numBidsRange5;

	@Column(name="num_bids_range6")
	private Integer numBidsRange6;

	@Column(name="num_buy_now_only")
	private Long numBuyNowOnly;

	@Column(name="num_items")
	private Long numItems;

	@Column(name="num_items_range1")
	private Integer numItemsRange1;

	@Column(name="num_items_range2")
	private Integer numItemsRange2;

	@Column(name="num_items_range3")
	private Integer numItemsRange3;

	@Column(name="num_items_range4")
	private Integer numItemsRange4;

	@Column(name="num_items_range5")
	private Integer numItemsRange5;

	@Column(name="num_items_range6")
	private Integer numItemsRange6;

	@Column(name="num_items_with_bids")
	private Long numItemsWithBids;

	@Column(name="num_live_only")
	private Long numLiveOnly;

	@Column(name="num_online_and_live")
	private Long numOnlineAndLive;

	@Column(name="num_online_only")
	private Long numOnlineOnly;

	@Column(name="quick_sale_revenue")
	private BigDecimal quickSaleRevenue;

	@Column(name="revenue_target")
	private BigDecimal revenueTarget;

	@Column(name="ticket_revenue")
	private BigDecimal ticketRevenue;

	@Column(name="total_revenue")
	private double totalRevenue;

	@Column(name="unique_bidders")
	private Long uniqueBidders;

	public AuctionManagerDashboard() {
	}

	public double getBiddingRevenue() {
		return this.biddingRevenue;
	}

	public void setBiddingRevenue(double biddingRevenue) {
		this.biddingRevenue = biddingRevenue;
	}

	public BigDecimal getBidsPerBidder() {
		return this.bidsPerBidder;
	}

	public void setBidsPerBidder(BigDecimal bidsPerBidder) {
		this.bidsPerBidder = bidsPerBidder;
	}

	public BigDecimal getBidsPlaced() {
		return this.bidsPlaced;
	}

	public void setBidsPlaced(BigDecimal bidsPlaced) {
		this.bidsPlaced = bidsPlaced;
	}

	public BigDecimal getCashRevenue() {
		return this.cashRevenue;
	}

	public void setCashRevenue(BigDecimal cashRevenue) {
		this.cashRevenue = cashRevenue;
	}

	public BigDecimal getCatalogValue() {
		return this.catalogValue;
	}

	public void setCatalogValue(BigDecimal catalogValue) {
		this.catalogValue = catalogValue;
	}

	public Date getDateClose() {
		return this.dateClose;
	}

	public void setDateClose(Date dateClose) {
		this.dateClose = dateClose;
	}

	public Date getDateEvent() {
		return this.dateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}

	public Date getDateOpen() {
		return this.dateOpen;
	}

	public void setDateOpen(Date dateOpen) {
		this.dateOpen = dateOpen;
	}

	public Long getEmailJobs() {
		return this.emailJobs;
	}

	public void setEmailJobs(Long emailJobs) {
		this.emailJobs = emailJobs;
	}

	public BigDecimal getEmail1Addresses() {
		return this.email1Addresses;
	}

	public void setEmail1Addresses(BigDecimal email1Addresses) {
		this.email1Addresses = email1Addresses;
	}

	public BigDecimal getEmail1Clicked() {
		return this.email1Clicked;
	}

	public void setEmail1Clicked(BigDecimal email1Clicked) {
		this.email1Clicked = email1Clicked;
	}

	public BigDecimal getEmail1Delivered() {
		return this.email1Delivered;
	}

	public void setEmail1Delivered(BigDecimal email1Delivered) {
		this.email1Delivered = email1Delivered;
	}

	public String getEmail1Name() {
		return this.email1Name;
	}

	public void setEmail1Name(String email1Name) {
		this.email1Name = email1Name;
	}

	public BigDecimal getEmail1Opened() {
		return this.email1Opened;
	}

	public void setEmail1Opened(BigDecimal email1Opened) {
		this.email1Opened = email1Opened;
	}

	public Timestamp getEmail1Sent() {
		return this.email1Sent;
	}

	public void setEmail1Sent(Timestamp email1Sent) {
		this.email1Sent = email1Sent;
	}

	public BigDecimal getEmail2Addresses() {
		return this.email2Addresses;
	}

	public void setEmail2Addresses(BigDecimal email2Addresses) {
		this.email2Addresses = email2Addresses;
	}

	public BigDecimal getEmail2Clicked() {
		return this.email2Clicked;
	}

	public void setEmail2Clicked(BigDecimal email2Clicked) {
		this.email2Clicked = email2Clicked;
	}

	public BigDecimal getEmail2Delivered() {
		return this.email2Delivered;
	}

	public void setEmail2Delivered(BigDecimal email2Delivered) {
		this.email2Delivered = email2Delivered;
	}

	public String getEmail2Name() {
		return this.email2Name;
	}

	public void setEmail2Name(String email2Name) {
		this.email2Name = email2Name;
	}

	public BigDecimal getEmail2Opened() {
		return this.email2Opened;
	}

	public void setEmail2Opened(BigDecimal email2Opened) {
		this.email2Opened = email2Opened;
	}

	public Timestamp getEmail2Sent() {
		return this.email2Sent;
	}

	public void setEmail2Sent(Timestamp email2Sent) {
		this.email2Sent = email2Sent;
	}

	public BigDecimal getEmail3Addresses() {
		return this.email3Addresses;
	}

	public void setEmail3Addresses(BigDecimal email3Addresses) {
		this.email3Addresses = email3Addresses;
	}

	public BigDecimal getEmail3Clicked() {
		return this.email3Clicked;
	}

	public void setEmail3Clicked(BigDecimal email3Clicked) {
		this.email3Clicked = email3Clicked;
	}

	public BigDecimal getEmail3Delivered() {
		return this.email3Delivered;
	}

	public void setEmail3Delivered(BigDecimal email3Delivered) {
		this.email3Delivered = email3Delivered;
	}

	public String getEmail3Name() {
		return this.email3Name;
	}

	public void setEmail3Name(String email3Name) {
		this.email3Name = email3Name;
	}

	public BigDecimal getEmail3Opened() {
		return this.email3Opened;
	}

	public void setEmail3Opened(BigDecimal email3Opened) {
		this.email3Opened = email3Opened;
	}

	public Timestamp getEmail3Sent() {
		return this.email3Sent;
	}

	public void setEmail3Sent(Timestamp email3Sent) {
		this.email3Sent = email3Sent;
	}

	public BigDecimal getEmailsClicked() {
		return this.emailsClicked;
	}

	public void setEmailsClicked(BigDecimal emailsClicked) {
		this.emailsClicked = emailsClicked;
	}

	public BigDecimal getEmailsDelivered() {
		return this.emailsDelivered;
	}

	public void setEmailsDelivered(BigDecimal emailsDelivered) {
		this.emailsDelivered = emailsDelivered;
	}

	public BigDecimal getEmailsOpened() {
		return this.emailsOpened;
	}

	public void setEmailsOpened(BigDecimal emailsOpened) {
		this.emailsOpened = emailsOpened;
	}

	public BigDecimal getEmailsSent() {
		return this.emailsSent;
	}

	public void setEmailsSent(BigDecimal emailsSent) {
		this.emailsSent = emailsSent;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getItemCost() {
		return this.itemCost;
	}

	public void setItemCost(BigDecimal itemCost) {
		this.itemCost = itemCost;
	}

	public Integer getNumBidsRange1() {
		return this.numBidsRange1;
	}

	public void setNumBidsRange1(Integer numBidsRange1) {
		this.numBidsRange1 = numBidsRange1;
	}

	public Integer getNumBidsRange2() {
		return this.numBidsRange2;
	}

	public void setNumBidsRange2(Integer numBidsRange2) {
		this.numBidsRange2 = numBidsRange2;
	}

	public Integer getNumBidsRange3() {
		return this.numBidsRange3;
	}

	public void setNumBidsRange3(Integer numBidsRange3) {
		this.numBidsRange3 = numBidsRange3;
	}

	public Integer getNumBidsRange4() {
		return this.numBidsRange4;
	}

	public void setNumBidsRange4(Integer numBidsRange4) {
		this.numBidsRange4 = numBidsRange4;
	}

	public Integer getNumBidsRange5() {
		return this.numBidsRange5;
	}

	public void setNumBidsRange5(Integer numBidsRange5) {
		this.numBidsRange5 = numBidsRange5;
	}

	public Integer getNumBidsRange6() {
		return this.numBidsRange6;
	}

	public void setNumBidsRange6(Integer numBidsRange6) {
		this.numBidsRange6 = numBidsRange6;
	}

	public Long getNumBuyNowOnly() {
		return this.numBuyNowOnly;
	}

	public void setNumBuyNowOnly(Long numBuyNowOnly) {
		this.numBuyNowOnly = numBuyNowOnly;
	}

	public Long getNumItems() {
		return this.numItems;
	}

	public void setNumItems(Long numItems) {
		this.numItems = numItems;
	}

	public Integer getNumItemsRange1() {
		return this.numItemsRange1;
	}

	public void setNumItemsRange1(Integer numItemsRange1) {
		this.numItemsRange1 = numItemsRange1;
	}

	public Integer getNumItemsRange2() {
		return this.numItemsRange2;
	}

	public void setNumItemsRange2(Integer numItemsRange2) {
		this.numItemsRange2 = numItemsRange2;
	}

	public Integer getNumItemsRange3() {
		return this.numItemsRange3;
	}

	public void setNumItemsRange3(Integer numItemsRange3) {
		this.numItemsRange3 = numItemsRange3;
	}

	public Integer getNumItemsRange4() {
		return this.numItemsRange4;
	}

	public void setNumItemsRange4(Integer numItemsRange4) {
		this.numItemsRange4 = numItemsRange4;
	}

	public Integer getNumItemsRange5() {
		return this.numItemsRange5;
	}

	public void setNumItemsRange5(Integer numItemsRange5) {
		this.numItemsRange5 = numItemsRange5;
	}

	public Integer getNumItemsRange6() {
		return this.numItemsRange6;
	}

	public void setNumItemsRange6(Integer numItemsRange6) {
		this.numItemsRange6 = numItemsRange6;
	}

	public Long getNumItemsWithBids() {
		return this.numItemsWithBids;
	}

	public void setNumItemsWithBids(Long numItemsWithBids) {
		this.numItemsWithBids = numItemsWithBids;
	}

	public Long getNumLiveOnly() {
		return this.numLiveOnly;
	}

	public void setNumLiveOnly(Long numLiveOnly) {
		this.numLiveOnly = numLiveOnly;
	}

	public Long getNumOnlineAndLive() {
		return this.numOnlineAndLive;
	}

	public void setNumOnlineAndLive(Long numOnlineAndLive) {
		this.numOnlineAndLive = numOnlineAndLive;
	}

	public Long getNumOnlineOnly() {
		return this.numOnlineOnly;
	}

	public void setNumOnlineOnly(Long numOnlineOnly) {
		this.numOnlineOnly = numOnlineOnly;
	}

	public BigDecimal getQuickSaleRevenue() {
		return this.quickSaleRevenue;
	}

	public void setQuickSaleRevenue(BigDecimal quickSaleRevenue) {
		this.quickSaleRevenue = quickSaleRevenue;
	}

	public BigDecimal getRevenueTarget() {
		return this.revenueTarget;
	}

	public void setRevenueTarget(BigDecimal revenueTarget) {
		this.revenueTarget = revenueTarget;
	}

	public BigDecimal getTicketRevenue() {
		return this.ticketRevenue;
	}

	public void setTicketRevenue(BigDecimal ticketRevenue) {
		this.ticketRevenue = ticketRevenue;
	}

	public double getTotalRevenue() {
		return this.totalRevenue;
	}

	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	public Long getUniqueBidders() {
		return this.uniqueBidders;
	}

	public void setUniqueBidders(Long uniqueBidders) {
		this.uniqueBidders = uniqueBidders;
	}

}
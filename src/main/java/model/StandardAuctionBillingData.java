package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the standard_auction_billing_data database table.
 * 
 */
@Entity
@Table(name="standard_auction_billing_data")
@NamedQuery(name="StandardAuctionBillingData.findAll", query="SELECT s FROM StandardAuctionBillingData s")
public class StandardAuctionBillingData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_guid")
	private String auctionGuid;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_name")
	private String auctionName;

	@Column(name="cash_donation_revenue_cc")
	private BigDecimal cashDonationRevenueCc;

	@Column(name="cash_donation_revenue_non_cc")
	private BigDecimal cashDonationRevenueNonCc;

	@Column(name="close_date_time")
	private Timestamp closeDateTime;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="instant_item_revenue")
	private BigDecimal instantItemRevenue;

	@Column(name="is_basic")
	private String isBasic;

	@Column(name="is_billed")
	private BigDecimal isBilled;

	@Column(name="item_revenue_cc")
	private BigDecimal itemRevenueCc;

	@Column(name="item_revenue_non_cc")
	private BigDecimal itemRevenueNonCc;

	@Column(name="online_close")
	private Timestamp onlineClose;

	@Column(name="online_close_tz")
	private String onlineCloseTz;

	@Column(name="org_ein")
	private String orgEin;

	@Column(name="org_guid")
	private String orgGuid;

	@Column(name="org_id")
	private BigDecimal orgId;

	@Column(name="org_name")
	private String orgName;

	@Column(name="org_partner")
	private String orgPartner;

	private String orgcountry;

	private String orgstate;

	@Column(name="payment_processor")
	private String paymentProcessor;

	@Column(name="quick_sale_revenue_cc")
	private BigDecimal quickSaleRevenueCc;

	@Column(name="quick_sale_revenue_non_cc")
	private BigDecimal quickSaleRevenueNonCc;

	@Column(name="ticket_revenue_cc")
	private BigDecimal ticketRevenueCc;

	@Column(name="ticket_revenue_non_cc")
	private BigDecimal ticketRevenueNonCc;

	@Column(name="time_zone")
	private String timeZone;

	public StandardAuctionBillingData() {
	}

	public String getAuctionGuid() {
		return this.auctionGuid;
	}

	public void setAuctionGuid(String auctionGuid) {
		this.auctionGuid = auctionGuid;
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

	public BigDecimal getCashDonationRevenueCc() {
		return this.cashDonationRevenueCc;
	}

	public void setCashDonationRevenueCc(BigDecimal cashDonationRevenueCc) {
		this.cashDonationRevenueCc = cashDonationRevenueCc;
	}

	public BigDecimal getCashDonationRevenueNonCc() {
		return this.cashDonationRevenueNonCc;
	}

	public void setCashDonationRevenueNonCc(BigDecimal cashDonationRevenueNonCc) {
		this.cashDonationRevenueNonCc = cashDonationRevenueNonCc;
	}

	public Timestamp getCloseDateTime() {
		return this.closeDateTime;
	}

	public void setCloseDateTime(Timestamp closeDateTime) {
		this.closeDateTime = closeDateTime;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getInstantItemRevenue() {
		return this.instantItemRevenue;
	}

	public void setInstantItemRevenue(BigDecimal instantItemRevenue) {
		this.instantItemRevenue = instantItemRevenue;
	}

	public String getIsBasic() {
		return this.isBasic;
	}

	public void setIsBasic(String isBasic) {
		this.isBasic = isBasic;
	}

	public BigDecimal getIsBilled() {
		return this.isBilled;
	}

	public void setIsBilled(BigDecimal isBilled) {
		this.isBilled = isBilled;
	}

	public BigDecimal getItemRevenueCc() {
		return this.itemRevenueCc;
	}

	public void setItemRevenueCc(BigDecimal itemRevenueCc) {
		this.itemRevenueCc = itemRevenueCc;
	}

	public BigDecimal getItemRevenueNonCc() {
		return this.itemRevenueNonCc;
	}

	public void setItemRevenueNonCc(BigDecimal itemRevenueNonCc) {
		this.itemRevenueNonCc = itemRevenueNonCc;
	}

	public Timestamp getOnlineClose() {
		return this.onlineClose;
	}

	public void setOnlineClose(Timestamp onlineClose) {
		this.onlineClose = onlineClose;
	}

	public String getOnlineCloseTz() {
		return this.onlineCloseTz;
	}

	public void setOnlineCloseTz(String onlineCloseTz) {
		this.onlineCloseTz = onlineCloseTz;
	}

	public String getOrgEin() {
		return this.orgEin;
	}

	public void setOrgEin(String orgEin) {
		this.orgEin = orgEin;
	}

	public String getOrgGuid() {
		return this.orgGuid;
	}

	public void setOrgGuid(String orgGuid) {
		this.orgGuid = orgGuid;
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

	public String getOrgPartner() {
		return this.orgPartner;
	}

	public void setOrgPartner(String orgPartner) {
		this.orgPartner = orgPartner;
	}

	public String getOrgcountry() {
		return this.orgcountry;
	}

	public void setOrgcountry(String orgcountry) {
		this.orgcountry = orgcountry;
	}

	public String getOrgstate() {
		return this.orgstate;
	}

	public void setOrgstate(String orgstate) {
		this.orgstate = orgstate;
	}

	public String getPaymentProcessor() {
		return this.paymentProcessor;
	}

	public void setPaymentProcessor(String paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}

	public BigDecimal getQuickSaleRevenueCc() {
		return this.quickSaleRevenueCc;
	}

	public void setQuickSaleRevenueCc(BigDecimal quickSaleRevenueCc) {
		this.quickSaleRevenueCc = quickSaleRevenueCc;
	}

	public BigDecimal getQuickSaleRevenueNonCc() {
		return this.quickSaleRevenueNonCc;
	}

	public void setQuickSaleRevenueNonCc(BigDecimal quickSaleRevenueNonCc) {
		this.quickSaleRevenueNonCc = quickSaleRevenueNonCc;
	}

	public BigDecimal getTicketRevenueCc() {
		return this.ticketRevenueCc;
	}

	public void setTicketRevenueCc(BigDecimal ticketRevenueCc) {
		this.ticketRevenueCc = ticketRevenueCc;
	}

	public BigDecimal getTicketRevenueNonCc() {
		return this.ticketRevenueNonCc;
	}

	public void setTicketRevenueNonCc(BigDecimal ticketRevenueNonCc) {
		this.ticketRevenueNonCc = ticketRevenueNonCc;
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

}
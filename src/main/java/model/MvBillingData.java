package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mv_billing_data database table.
 * 
 */
@Entity
@Table(name="mv_billing_data")
@NamedQuery(name="MvBillingData.findAll", query="SELECT m FROM MvBillingData m")
public class MvBillingData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_gross")
	private BigDecimal auctionGross;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	private Long bidders;

	private BigDecimal bids;

	@Column(name="billing_gms")
	private double billingGms;

	@Column(name="billing_gms_old")
	private double billingGmsOld;

	@Column(name="cash_donation_percent")
	private BigDecimal cashDonationPercent;

	@Column(name="cash_donation_revenue")
	private BigDecimal cashDonationRevenue;

	@Column(name="cash_donations")
	private Long cashDonations;

	@Column(name="cmp_items_sold")
	private Long cmpItemsSold;

	@Column(name="cmp_net_revenue")
	private BigDecimal cmpNetRevenue;

	@Column(name="cost_closed_cmp_items")
	private BigDecimal costClosedCmpItems;

	@Column(name="fee_1")
	private double fee1;

	@Column(name="fee_2")
	private double fee2;

	@Column(name="fee_3")
	private double fee3;

	@Column(name="graphic_services_fee")
	private BigDecimal graphicServicesFee;

	@Column(name="item_count")
	private Long itemCount;

	@Column(name="live_revenue")
	private double liveRevenue;

	@Column(name="managed_services_fee")
	private BigDecimal managedServicesFee;

	@Column(name="min_perform_fee")
	private BigDecimal minPerformFee;

	@Column(name="nap_1")
	private double nap1;

	@Column(name="nap_2")
	private double nap2;

	@Column(name="nap_3")
	private double nap3;

	@Column(name="nap_percent_1")
	private BigDecimal napPercent1;

	@Column(name="nap_percent_2")
	private BigDecimal napPercent2;

	@Column(name="nap_percent_3")
	private BigDecimal napPercent3;

	@Column(name="nap_range_1")
	private BigDecimal napRange1;

	@Column(name="nap_range_2")
	private BigDecimal napRange2;

	@Column(name="nap_range_3")
	private BigDecimal napRange3;

	@Column(name="num_cmp_items")
	private Long numCmpItems;

	@Column(name="num_p2_items")
	private Long numP2Items;

	@Column(name="num_quick_sales")
	private Long numQuickSales;

	@Column(name="p2_gms")
	private double p2Gms;

	@Column(name="p2_items_sold")
	private Long p2ItemsSold;

	@Column(name="p2_net_revenue")
	private BigDecimal p2NetRevenue;

	@Column(name="p2_percent")
	private BigDecimal p2Percent;

	@Column(name="quick_sale_percent")
	private BigDecimal quickSalePercent;

	@Column(name="sold_items")
	private Long soldItems;

	@Column(name="ticket_orders")
	private Long ticketOrders;

	@Column(name="ticket_percent")
	private BigDecimal ticketPercent;

	@Column(name="ticket_revenue")
	private BigDecimal ticketRevenue;

	@Column(name="total_high_bids")
	private double totalHighBids;

	@Column(name="total_quick_sales")
	private BigDecimal totalQuickSales;

	public MvBillingData() {
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

	public double getBillingGmsOld() {
		return this.billingGmsOld;
	}

	public void setBillingGmsOld(double billingGmsOld) {
		this.billingGmsOld = billingGmsOld;
	}

	public BigDecimal getCashDonationPercent() {
		return this.cashDonationPercent;
	}

	public void setCashDonationPercent(BigDecimal cashDonationPercent) {
		this.cashDonationPercent = cashDonationPercent;
	}

	public BigDecimal getCashDonationRevenue() {
		return this.cashDonationRevenue;
	}

	public void setCashDonationRevenue(BigDecimal cashDonationRevenue) {
		this.cashDonationRevenue = cashDonationRevenue;
	}

	public Long getCashDonations() {
		return this.cashDonations;
	}

	public void setCashDonations(Long cashDonations) {
		this.cashDonations = cashDonations;
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

	public double getFee1() {
		return this.fee1;
	}

	public void setFee1(double fee1) {
		this.fee1 = fee1;
	}

	public double getFee2() {
		return this.fee2;
	}

	public void setFee2(double fee2) {
		this.fee2 = fee2;
	}

	public double getFee3() {
		return this.fee3;
	}

	public void setFee3(double fee3) {
		this.fee3 = fee3;
	}

	public BigDecimal getGraphicServicesFee() {
		return this.graphicServicesFee;
	}

	public void setGraphicServicesFee(BigDecimal graphicServicesFee) {
		this.graphicServicesFee = graphicServicesFee;
	}

	public Long getItemCount() {
		return this.itemCount;
	}

	public void setItemCount(Long itemCount) {
		this.itemCount = itemCount;
	}

	public double getLiveRevenue() {
		return this.liveRevenue;
	}

	public void setLiveRevenue(double liveRevenue) {
		this.liveRevenue = liveRevenue;
	}

	public BigDecimal getManagedServicesFee() {
		return this.managedServicesFee;
	}

	public void setManagedServicesFee(BigDecimal managedServicesFee) {
		this.managedServicesFee = managedServicesFee;
	}

	public BigDecimal getMinPerformFee() {
		return this.minPerformFee;
	}

	public void setMinPerformFee(BigDecimal minPerformFee) {
		this.minPerformFee = minPerformFee;
	}

	public double getNap1() {
		return this.nap1;
	}

	public void setNap1(double nap1) {
		this.nap1 = nap1;
	}

	public double getNap2() {
		return this.nap2;
	}

	public void setNap2(double nap2) {
		this.nap2 = nap2;
	}

	public double getNap3() {
		return this.nap3;
	}

	public void setNap3(double nap3) {
		this.nap3 = nap3;
	}

	public BigDecimal getNapPercent1() {
		return this.napPercent1;
	}

	public void setNapPercent1(BigDecimal napPercent1) {
		this.napPercent1 = napPercent1;
	}

	public BigDecimal getNapPercent2() {
		return this.napPercent2;
	}

	public void setNapPercent2(BigDecimal napPercent2) {
		this.napPercent2 = napPercent2;
	}

	public BigDecimal getNapPercent3() {
		return this.napPercent3;
	}

	public void setNapPercent3(BigDecimal napPercent3) {
		this.napPercent3 = napPercent3;
	}

	public BigDecimal getNapRange1() {
		return this.napRange1;
	}

	public void setNapRange1(BigDecimal napRange1) {
		this.napRange1 = napRange1;
	}

	public BigDecimal getNapRange2() {
		return this.napRange2;
	}

	public void setNapRange2(BigDecimal napRange2) {
		this.napRange2 = napRange2;
	}

	public BigDecimal getNapRange3() {
		return this.napRange3;
	}

	public void setNapRange3(BigDecimal napRange3) {
		this.napRange3 = napRange3;
	}

	public Long getNumCmpItems() {
		return this.numCmpItems;
	}

	public void setNumCmpItems(Long numCmpItems) {
		this.numCmpItems = numCmpItems;
	}

	public Long getNumP2Items() {
		return this.numP2Items;
	}

	public void setNumP2Items(Long numP2Items) {
		this.numP2Items = numP2Items;
	}

	public Long getNumQuickSales() {
		return this.numQuickSales;
	}

	public void setNumQuickSales(Long numQuickSales) {
		this.numQuickSales = numQuickSales;
	}

	public double getP2Gms() {
		return this.p2Gms;
	}

	public void setP2Gms(double p2Gms) {
		this.p2Gms = p2Gms;
	}

	public Long getP2ItemsSold() {
		return this.p2ItemsSold;
	}

	public void setP2ItemsSold(Long p2ItemsSold) {
		this.p2ItemsSold = p2ItemsSold;
	}

	public BigDecimal getP2NetRevenue() {
		return this.p2NetRevenue;
	}

	public void setP2NetRevenue(BigDecimal p2NetRevenue) {
		this.p2NetRevenue = p2NetRevenue;
	}

	public BigDecimal getP2Percent() {
		return this.p2Percent;
	}

	public void setP2Percent(BigDecimal p2Percent) {
		this.p2Percent = p2Percent;
	}

	public BigDecimal getQuickSalePercent() {
		return this.quickSalePercent;
	}

	public void setQuickSalePercent(BigDecimal quickSalePercent) {
		this.quickSalePercent = quickSalePercent;
	}

	public Long getSoldItems() {
		return this.soldItems;
	}

	public void setSoldItems(Long soldItems) {
		this.soldItems = soldItems;
	}

	public Long getTicketOrders() {
		return this.ticketOrders;
	}

	public void setTicketOrders(Long ticketOrders) {
		this.ticketOrders = ticketOrders;
	}

	public BigDecimal getTicketPercent() {
		return this.ticketPercent;
	}

	public void setTicketPercent(BigDecimal ticketPercent) {
		this.ticketPercent = ticketPercent;
	}

	public BigDecimal getTicketRevenue() {
		return this.ticketRevenue;
	}

	public void setTicketRevenue(BigDecimal ticketRevenue) {
		this.ticketRevenue = ticketRevenue;
	}

	public double getTotalHighBids() {
		return this.totalHighBids;
	}

	public void setTotalHighBids(double totalHighBids) {
		this.totalHighBids = totalHighBids;
	}

	public BigDecimal getTotalQuickSales() {
		return this.totalQuickSales;
	}

	public void setTotalQuickSales(BigDecimal totalQuickSales) {
		this.totalQuickSales = totalQuickSales;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mv_daily_bid_summary database table.
 * 
 */
@Entity
@Table(name="mv_daily_bid_summary")
@NamedQuery(name="MvDailyBidSummary.findAll", query="SELECT m FROM MvDailyBidSummary m")
public class MvDailyBidSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_date")
	private Timestamp auctionDate;

	@Column(name="auction_day")
	private Long auctionDay;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="day_to_end")
	private Long dayToEnd;

	@Column(name="distinct_bidders")
	private Long distinctBidders;

	@Column(name="item_cost")
	private double itemCost;

	@Column(name="items_sold")
	private Long itemsSold;

	@Column(name="net_revenue")
	private double netRevenue;

	@Column(name="revenue_total")
	private double revenueTotal;

	@Column(name="total_bids")
	private Long totalBids;

	public MvDailyBidSummary() {
	}

	public Timestamp getAuctionDate() {
		return this.auctionDate;
	}

	public void setAuctionDate(Timestamp auctionDate) {
		this.auctionDate = auctionDate;
	}

	public Long getAuctionDay() {
		return this.auctionDay;
	}

	public void setAuctionDay(Long auctionDay) {
		this.auctionDay = auctionDay;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public Long getDayToEnd() {
		return this.dayToEnd;
	}

	public void setDayToEnd(Long dayToEnd) {
		this.dayToEnd = dayToEnd;
	}

	public Long getDistinctBidders() {
		return this.distinctBidders;
	}

	public void setDistinctBidders(Long distinctBidders) {
		this.distinctBidders = distinctBidders;
	}

	public double getItemCost() {
		return this.itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}

	public Long getItemsSold() {
		return this.itemsSold;
	}

	public void setItemsSold(Long itemsSold) {
		this.itemsSold = itemsSold;
	}

	public double getNetRevenue() {
		return this.netRevenue;
	}

	public void setNetRevenue(double netRevenue) {
		this.netRevenue = netRevenue;
	}

	public double getRevenueTotal() {
		return this.revenueTotal;
	}

	public void setRevenueTotal(double revenueTotal) {
		this.revenueTotal = revenueTotal;
	}

	public Long getTotalBids() {
		return this.totalBids;
	}

	public void setTotalBids(Long totalBids) {
		this.totalBids = totalBids;
	}

}
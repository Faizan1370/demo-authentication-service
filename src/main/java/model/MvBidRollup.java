package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mv_bid_rollup database table.
 * 
 */
@Entity
@Table(name="mv_bid_rollup")
@NamedQuery(name="MvBidRollup.findAll", query="SELECT m FROM MvBidRollup m")
public class MvBidRollup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	private Long bidders;

	private Long bids;

	@Column(name="buy_nows")
	private Long buyNows;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="live_increase")
	private double liveIncrease;

	@Column(name="max_buy")
	private double maxBuy;

	@Column(name="max_live")
	private double maxLive;

	@Column(name="max_online")
	private double maxOnline;

	@Column(name="top_bid")
	private double topBid;

	@Column(name="top_bid_type")
	private String topBidType;

	public MvBidRollup() {
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

	public Long getBids() {
		return this.bids;
	}

	public void setBids(Long bids) {
		this.bids = bids;
	}

	public Long getBuyNows() {
		return this.buyNows;
	}

	public void setBuyNows(Long buyNows) {
		this.buyNows = buyNows;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public double getLiveIncrease() {
		return this.liveIncrease;
	}

	public void setLiveIncrease(double liveIncrease) {
		this.liveIncrease = liveIncrease;
	}

	public double getMaxBuy() {
		return this.maxBuy;
	}

	public void setMaxBuy(double maxBuy) {
		this.maxBuy = maxBuy;
	}

	public double getMaxLive() {
		return this.maxLive;
	}

	public void setMaxLive(double maxLive) {
		this.maxLive = maxLive;
	}

	public double getMaxOnline() {
		return this.maxOnline;
	}

	public void setMaxOnline(double maxOnline) {
		this.maxOnline = maxOnline;
	}

	public double getTopBid() {
		return this.topBid;
	}

	public void setTopBid(double topBid) {
		this.topBid = topBid;
	}

	public String getTopBidType() {
		return this.topBidType;
	}

	public void setTopBidType(String topBidType) {
		this.topBidType = topBidType;
	}

}
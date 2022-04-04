package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mv_bid_data database table.
 * 
 */
@Entity
@Table(name="mv_bid_data")
@NamedQuery(name="MvBidData.findAll", query="SELECT m FROM MvBidData m")
public class MvBidData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="b4g_bid")
	private Integer b4gBid;

	@Column(name="bid_amount")
	private double bidAmount;

	@Column(name="bid_date")
	private Timestamp bidDate;

	@Column(name="bid_date_trunc")
	private Timestamp bidDateTrunc;

	@Column(name="bid_position")
	private Long bidPosition;

	@Column(name="bid_type")
	private String bidType;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="leading_bid")
	private Integer leadingBid;

	@Column(name="proxy_bid_amount")
	private double proxyBidAmount;

	@Column(name="source_bid_id")
	private BigDecimal sourceBidId;

	@Column(name="sub_bid_type")
	private String subBidType;

	@Column(name="winning_bid")
	private Integer winningBid;

	public MvBidData() {
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public Integer getB4gBid() {
		return this.b4gBid;
	}

	public void setB4gBid(Integer b4gBid) {
		this.b4gBid = b4gBid;
	}

	public double getBidAmount() {
		return this.bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public Timestamp getBidDate() {
		return this.bidDate;
	}

	public void setBidDate(Timestamp bidDate) {
		this.bidDate = bidDate;
	}

	public Timestamp getBidDateTrunc() {
		return this.bidDateTrunc;
	}

	public void setBidDateTrunc(Timestamp bidDateTrunc) {
		this.bidDateTrunc = bidDateTrunc;
	}

	public Long getBidPosition() {
		return this.bidPosition;
	}

	public void setBidPosition(Long bidPosition) {
		this.bidPosition = bidPosition;
	}

	public String getBidType() {
		return this.bidType;
	}

	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public Integer getLeadingBid() {
		return this.leadingBid;
	}

	public void setLeadingBid(Integer leadingBid) {
		this.leadingBid = leadingBid;
	}

	public double getProxyBidAmount() {
		return this.proxyBidAmount;
	}

	public void setProxyBidAmount(double proxyBidAmount) {
		this.proxyBidAmount = proxyBidAmount;
	}

	public BigDecimal getSourceBidId() {
		return this.sourceBidId;
	}

	public void setSourceBidId(BigDecimal sourceBidId) {
		this.sourceBidId = sourceBidId;
	}

	public String getSubBidType() {
		return this.subBidType;
	}

	public void setSubBidType(String subBidType) {
		this.subBidType = subBidType;
	}

	public Integer getWinningBid() {
		return this.winningBid;
	}

	public void setWinningBid(Integer winningBid) {
		this.winningBid = winningBid;
	}

}
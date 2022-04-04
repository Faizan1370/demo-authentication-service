package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mv_item_award_data database table.
 * 
 */
@Entity
@Table(name="mv_item_award_data")
@NamedQuery(name="MvItemAwardData.findAll", query="SELECT m FROM MvItemAwardData m")
public class MvItemAwardData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="b4g_bid")
	private Integer b4gBid;

	@Column(name="bid_amount")
	private BigDecimal bidAmount;

	@Column(name="bid_date")
	private Timestamp bidDate;

	@Column(name="bid_date_trunc")
	private Timestamp bidDateTrunc;

	@Column(name="bid_position")
	private Integer bidPosition;

	@Column(name="bid_type")
	private String bidType;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="leading_bid")
	private Integer leadingBid;

	@Column(name="proxy_bid_amount")
	private BigDecimal proxyBidAmount;

	@Column(name="source_bid_id")
	private Integer sourceBidId;

	@Column(name="sub_bid_type")
	private String subBidType;

	@Column(name="winning_bid")
	private Integer winningBid;

	public MvItemAwardData() {
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

	public BigDecimal getBidAmount() {
		return this.bidAmount;
	}

	public void setBidAmount(BigDecimal bidAmount) {
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

	public Integer getBidPosition() {
		return this.bidPosition;
	}

	public void setBidPosition(Integer bidPosition) {
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

	public BigDecimal getProxyBidAmount() {
		return this.proxyBidAmount;
	}

	public void setProxyBidAmount(BigDecimal proxyBidAmount) {
		this.proxyBidAmount = proxyBidAmount;
	}

	public Integer getSourceBidId() {
		return this.sourceBidId;
	}

	public void setSourceBidId(Integer sourceBidId) {
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
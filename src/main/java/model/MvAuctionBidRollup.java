package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mv_auction_bid_rollup database table.
 * 
 */
@Entity
@Table(name="mv_auction_bid_rollup")
@NamedQuery(name="MvAuctionBidRollup.findAll", query="SELECT m FROM MvAuctionBidRollup m")
public class MvAuctionBidRollup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="b4g_bidders")
	private Long b4gBidders;

	@Column(name="b4g_bids")
	private Long b4gBids;

	@Column(name="b4g_winning_bid_amounts")
	private double b4gWinningBidAmounts;

	@Column(name="b4g_winning_bids")
	private Long b4gWinningBids;

	@Column(name="num_bidders")
	private Long numBidders;

	public MvAuctionBidRollup() {
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
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

	public Long getNumBidders() {
		return this.numBidders;
	}

	public void setNumBidders(Long numBidders) {
		this.numBidders = numBidders;
	}

}
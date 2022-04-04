package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bidder_account_info database table.
 * 
 */
@Entity
@Table(name="bidder_account_info")
@NamedQuery(name="BidderAccountInfo.findAll", query="SELECT b FROM BidderAccountInfo b")
public class BidderAccountInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="registered_card_id")
	private BigDecimal registeredCardId;

	public BidderAccountInfo() {
	}

	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public BigDecimal getRegisteredCardId() {
		return this.registeredCardId;
	}

	public void setRegisteredCardId(BigDecimal registeredCardId) {
		this.registeredCardId = registeredCardId;
	}

}
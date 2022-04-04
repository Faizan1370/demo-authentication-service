package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bidder_ids database table.
 * 
 */
@Entity
@Table(name="bidder_ids")
@NamedQuery(name="BidderId.findAll", query="SELECT b FROM BidderId b")
public class BidderId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	public BidderId() {
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

}
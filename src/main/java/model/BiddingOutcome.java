package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bidding_outcome database table.
 * 
 */
@Entity
@Table(name="bidding_outcome")
@NamedQuery(name="BiddingOutcome.findAll", query="SELECT b FROM BiddingOutcome b")
public class BiddingOutcome implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="winning_bid_id")
	private BigDecimal winningBidId;

	public BiddingOutcome() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public BigDecimal getWinningBidId() {
		return this.winningBidId;
	}

	public void setWinningBidId(BigDecimal winningBidId) {
		this.winningBidId = winningBidId;
	}

}
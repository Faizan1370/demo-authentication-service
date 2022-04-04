package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the bidder_credit_cards database table.
 * 
 */
@Embeddable
public class BidderCreditCardPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="bidder_id")
	private long bidderId;

	@Column(name="credit_card_id")
	private long creditCardId;

	public BidderCreditCardPK() {
	}
	public long getBidderId() {
		return this.bidderId;
	}
	public void setBidderId(long bidderId) {
		this.bidderId = bidderId;
	}
	public long getCreditCardId() {
		return this.creditCardId;
	}
	public void setCreditCardId(long creditCardId) {
		this.creditCardId = creditCardId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BidderCreditCardPK)) {
			return false;
		}
		BidderCreditCardPK castOther = (BidderCreditCardPK)other;
		return 
			(this.bidderId == castOther.bidderId)
			&& (this.creditCardId == castOther.creditCardId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.bidderId ^ (this.bidderId >>> 32)));
		hash = hash * prime + ((int) (this.creditCardId ^ (this.creditCardId >>> 32)));
		
		return hash;
	}
}
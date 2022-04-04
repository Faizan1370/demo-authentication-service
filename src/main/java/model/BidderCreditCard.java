package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bidder_credit_cards database table.
 * 
 */
@Entity
@Table(name="bidder_credit_cards")
@NamedQuery(name="BidderCreditCard.findAll", query="SELECT b FROM BidderCreditCard b")
public class BidderCreditCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BidderCreditCardPK id;

	public BidderCreditCard() {
	}

	public BidderCreditCardPK getId() {
		return this.id;
	}

	public void setId(BidderCreditCardPK id) {
		this.id = id;
	}

}
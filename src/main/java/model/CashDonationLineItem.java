package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the cash_donation_line_item database table.
 * 
 */
@Entity
@Table(name="cash_donation_line_item")
@NamedQuery(name="CashDonationLineItem.findAll", query="SELECT c FROM CashDonationLineItem c")
public class CashDonationLineItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="donation_id")
	private BigDecimal donationId;

	public CashDonationLineItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getDonationId() {
		return this.donationId;
	}

	public void setDonationId(BigDecimal donationId) {
		this.donationId = donationId;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the discount_code_event_tickets database table.
 * 
 */
@Embeddable
public class DiscountCodeEventTicketPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="discount_code_id")
	private long discountCodeId;

	@Column(name="event_ticket_id")
	private long eventTicketId;

	public DiscountCodeEventTicketPK() {
	}
	public long getDiscountCodeId() {
		return this.discountCodeId;
	}
	public void setDiscountCodeId(long discountCodeId) {
		this.discountCodeId = discountCodeId;
	}
	public long getEventTicketId() {
		return this.eventTicketId;
	}
	public void setEventTicketId(long eventTicketId) {
		this.eventTicketId = eventTicketId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DiscountCodeEventTicketPK)) {
			return false;
		}
		DiscountCodeEventTicketPK castOther = (DiscountCodeEventTicketPK)other;
		return 
			(this.discountCodeId == castOther.discountCodeId)
			&& (this.eventTicketId == castOther.eventTicketId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.discountCodeId ^ (this.discountCodeId >>> 32)));
		hash = hash * prime + ((int) (this.eventTicketId ^ (this.eventTicketId >>> 32)));
		
		return hash;
	}
}
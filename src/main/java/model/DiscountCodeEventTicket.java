package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the discount_code_event_tickets database table.
 * 
 */
@Entity
@Table(name="discount_code_event_tickets")
@NamedQuery(name="DiscountCodeEventTicket.findAll", query="SELECT d FROM DiscountCodeEventTicket d")
public class DiscountCodeEventTicket implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DiscountCodeEventTicketPK id;

	public DiscountCodeEventTicket() {
	}

	public DiscountCodeEventTicketPK getId() {
		return this.id;
	}

	public void setId(DiscountCodeEventTicketPK id) {
		this.id = id;
	}

}
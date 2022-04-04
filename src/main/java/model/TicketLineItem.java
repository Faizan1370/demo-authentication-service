package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ticket_line_item database table.
 * 
 */
@Entity
@Table(name="ticket_line_item")
@NamedQuery(name="TicketLineItem.findAll", query="SELECT t FROM TicketLineItem t")
public class TicketLineItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="order_id")
	private BigDecimal orderId;

	public TicketLineItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getOrderId() {
		return this.orderId;
	}

	public void setOrderId(BigDecimal orderId) {
		this.orderId = orderId;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the event_ticket_internationalized_values database table.
 * 
 */
@Entity
@Table(name="event_ticket_internationalized_values")
@NamedQuery(name="EventTicketInternationalizedValue.findAll", query="SELECT e FROM EventTicketInternationalizedValue e")
public class EventTicketInternationalizedValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	private String description;

	private String locale;

	private String name;

	@Column(name="ticket_id")
	private BigDecimal ticketId;

	public EventTicketInternationalizedValue() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(BigDecimal ticketId) {
		this.ticketId = ticketId;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ticket_descriptions database table.
 * 
 */
@Entity
@Table(name="ticket_descriptions")
@NamedQuery(name="TicketDescription.findAll", query="SELECT t FROM TicketDescription t")
public class TicketDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String description;

	public TicketDescription() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
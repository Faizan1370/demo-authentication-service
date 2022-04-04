package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the user_event database table.
 * 
 */
@Entity
@Table(name="user_event")
@NamedQuery(name="UserEvent.findAll", query="SELECT u FROM UserEvent u")
public class UserEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="event_type")
	private BigDecimal eventType;

	@Column(name="user_id")
	private BigDecimal userId;

	public UserEvent() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getEventType() {
		return this.eventType;
	}

	public void setEventType(BigDecimal eventType) {
		this.eventType = eventType;
	}

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

}
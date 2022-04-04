package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the attendee_type database table.
 * 
 */
@Entity
@Table(name="attendee_type")
@NamedQuery(name="AttendeeType.findAll", query="SELECT a FROM AttendeeType a")
public class AttendeeType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="event_attendee_id")
	private BigDecimal eventAttendeeId;

	private String name;

	public AttendeeType() {
	}

	public BigDecimal getEventAttendeeId() {
		return this.eventAttendeeId;
	}

	public void setEventAttendeeId(BigDecimal eventAttendeeId) {
		this.eventAttendeeId = eventAttendeeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
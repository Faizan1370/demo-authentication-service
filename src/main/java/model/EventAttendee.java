package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the event_attendee database table.
 * 
 */
@Entity
@Table(name="event_attendee")
@NamedQuery(name="EventAttendee.findAll", query="SELECT e FROM EventAttendee e")
public class EventAttendee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="attendance_status")
	private String attendanceStatus;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="bidder_number")
	private String bidderNumber;

	@Column(name="checked_in")
	private BigDecimal checkedIn;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private String email;

	@Column(name="external_id")
	private String externalId;

	@Column(name="first_name")
	private String firstName;

	@Column(name="group_name")
	private String groupName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="meal_id")
	private BigDecimal mealId;

	private String source;

	@Column(name="table_identifier")
	private String tableIdentifier;

	@Column(name="ticket_name")
	private String ticketName;

	@Column(name="ticket_order_id")
	private BigDecimal ticketOrderId;

	public EventAttendee() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAttendanceStatus() {
		return this.attendanceStatus;
	}

	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public String getBidderNumber() {
		return this.bidderNumber;
	}

	public void setBidderNumber(String bidderNumber) {
		this.bidderNumber = bidderNumber;
	}

	public BigDecimal getCheckedIn() {
		return this.checkedIn;
	}

	public void setCheckedIn(BigDecimal checkedIn) {
		this.checkedIn = checkedIn;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getMealId() {
		return this.mealId;
	}

	public void setMealId(BigDecimal mealId) {
		this.mealId = mealId;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTableIdentifier() {
		return this.tableIdentifier;
	}

	public void setTableIdentifier(String tableIdentifier) {
		this.tableIdentifier = tableIdentifier;
	}

	public String getTicketName() {
		return this.ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	public BigDecimal getTicketOrderId() {
		return this.ticketOrderId;
	}

	public void setTicketOrderId(BigDecimal ticketOrderId) {
		this.ticketOrderId = ticketOrderId;
	}

}
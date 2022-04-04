package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the guest_checkin_audit database table.
 * 
 */
@Entity
@Table(name="guest_checkin_audit")
@NamedQuery(name="GuestCheckinAudit.findAll", query="SELECT g FROM GuestCheckinAudit g")
public class GuestCheckinAudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GuestCheckinAuditPK id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	private String description;

	//bi-directional many-to-one association to Auction
	@ManyToOne
	private Auction auction;

	public GuestCheckinAudit() {
	}

	public GuestCheckinAuditPK getId() {
		return this.id;
	}

	public void setId(GuestCheckinAuditPK id) {
		this.id = id;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Auction getAuction() {
		return this.auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

}
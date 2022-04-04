package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the guest_checkin_audit_info database table.
 * 
 */
@Entity
@Table(name="guest_checkin_audit_info")
@NamedQuery(name="GuestCheckinAuditInfo.findAll", query="SELECT g FROM GuestCheckinAuditInfo g")
public class GuestCheckinAuditInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="access_code_id")
	private BigDecimal accessCodeId;

	@Column(name="access_code_name")
	private String accessCodeName;

	@Column(name="access_code_value")
	private String accessCodeValue;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	private String description;

	private BigDecimal id;

	public GuestCheckinAuditInfo() {
	}

	public BigDecimal getAccessCodeId() {
		return this.accessCodeId;
	}

	public void setAccessCodeId(BigDecimal accessCodeId) {
		this.accessCodeId = accessCodeId;
	}

	public String getAccessCodeName() {
		return this.accessCodeName;
	}

	public void setAccessCodeName(String accessCodeName) {
		this.accessCodeName = accessCodeName;
	}

	public String getAccessCodeValue() {
		return this.accessCodeValue;
	}

	public void setAccessCodeValue(String accessCodeValue) {
		this.accessCodeValue = accessCodeValue;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
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

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

}
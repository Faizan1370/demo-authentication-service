package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the paystatus database table.
 * 
 */
@Entity
@NamedQuery(name="Paystatus.findAll", query="SELECT p FROM Paystatus p")
public class Paystatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_num")
	private BigDecimal auctionNum;

	@Column(name="auth_code")
	private String authCode;

	@Column(name="billing_status")
	private String billingStatus;

	@Column(name="event_sign_date")
	private Timestamp eventSignDate;

	@Column(name="last_updated")
	private Timestamp lastUpdated;

	private String notes;

	@Column(name="old_auction_id")
	private String oldAuctionId;

	@Column(name="payment_type")
	private String paymentType;

	@Column(name="sf_oppty_id")
	private String sfOpptyId;

	@Column(name="sub_end_date")
	private Timestamp subEndDate;

	@Column(name="sub_start_date")
	private Timestamp subStartDate;

	public Paystatus() {
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getAuctionNum() {
		return this.auctionNum;
	}

	public void setAuctionNum(BigDecimal auctionNum) {
		this.auctionNum = auctionNum;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getBillingStatus() {
		return this.billingStatus;
	}

	public void setBillingStatus(String billingStatus) {
		this.billingStatus = billingStatus;
	}

	public Timestamp getEventSignDate() {
		return this.eventSignDate;
	}

	public void setEventSignDate(Timestamp eventSignDate) {
		this.eventSignDate = eventSignDate;
	}

	public Timestamp getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOldAuctionId() {
		return this.oldAuctionId;
	}

	public void setOldAuctionId(String oldAuctionId) {
		this.oldAuctionId = oldAuctionId;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getSfOpptyId() {
		return this.sfOpptyId;
	}

	public void setSfOpptyId(String sfOpptyId) {
		this.sfOpptyId = sfOpptyId;
	}

	public Timestamp getSubEndDate() {
		return this.subEndDate;
	}

	public void setSubEndDate(Timestamp subEndDate) {
		this.subEndDate = subEndDate;
	}

	public Timestamp getSubStartDate() {
		return this.subStartDate;
	}

	public void setSubStartDate(Timestamp subStartDate) {
		this.subStartDate = subStartDate;
	}

}
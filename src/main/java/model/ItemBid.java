package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the item_bids database table.
 * 
 */
@Entity
@Table(name="item_bids")
@NamedQuery(name="ItemBid.findAll", query="SELECT i FROM ItemBid i")
public class ItemBid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private double amount;

	@Column(name="b4g_bid")
	private BigDecimal b4gBid;

	@Column(name="bid_type")
	private String bidType;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="client_id")
	private BigDecimal clientId;

	@Column(name="credit_card_id")
	private BigDecimal creditCardId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_displayed")
	private Timestamp dateDisplayed;

	@Column(name="date_retracted")
	private Timestamp dateRetracted;

	@Column(name="ip_address")
	private String ipAddress;

	@Column(name="item_bid_increment")
	private double itemBidIncrement;

	@Column(name="item_id")
	private BigDecimal itemId;

	private BigDecimal livestream;

	@Column(name="pay_the_fee")
	private BigDecimal payTheFee;

	@Column(name="retracted_by_account_id")
	private BigDecimal retractedByAccountId;

	private String status;

	public ItemBid() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public BigDecimal getB4gBid() {
		return this.b4gBid;
	}

	public void setB4gBid(BigDecimal b4gBid) {
		this.b4gBid = b4gBid;
	}

	public String getBidType() {
		return this.bidType;
	}

	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public BigDecimal getClientId() {
		return this.clientId;
	}

	public void setClientId(BigDecimal clientId) {
		this.clientId = clientId;
	}

	public BigDecimal getCreditCardId() {
		return this.creditCardId;
	}

	public void setCreditCardId(BigDecimal creditCardId) {
		this.creditCardId = creditCardId;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateDisplayed() {
		return this.dateDisplayed;
	}

	public void setDateDisplayed(Timestamp dateDisplayed) {
		this.dateDisplayed = dateDisplayed;
	}

	public Timestamp getDateRetracted() {
		return this.dateRetracted;
	}

	public void setDateRetracted(Timestamp dateRetracted) {
		this.dateRetracted = dateRetracted;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public double getItemBidIncrement() {
		return this.itemBidIncrement;
	}

	public void setItemBidIncrement(double itemBidIncrement) {
		this.itemBidIncrement = itemBidIncrement;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public BigDecimal getLivestream() {
		return this.livestream;
	}

	public void setLivestream(BigDecimal livestream) {
		this.livestream = livestream;
	}

	public BigDecimal getPayTheFee() {
		return this.payTheFee;
	}

	public void setPayTheFee(BigDecimal payTheFee) {
		this.payTheFee = payTheFee;
	}

	public BigDecimal getRetractedByAccountId() {
		return this.retractedByAccountId;
	}

	public void setRetractedByAccountId(BigDecimal retractedByAccountId) {
		this.retractedByAccountId = retractedByAccountId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the cash_donation database table.
 * 
 */
@Entity
@Table(name="cash_donation")
@NamedQuery(name="CashDonation.findAll", query="SELECT c FROM CashDonation c")
public class CashDonation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	private BigDecimal amount;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="bidder_first_name")
	private String bidderFirstName;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="bidder_last_name")
	private String bidderLastName;

	@Column(name="click_id")
	private BigDecimal clickId;

	@Column(name="client_id")
	private BigDecimal clientId;

	private String comments;

	@Column(name="credit_card_id")
	private BigDecimal creditCardId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="display_name")
	private String displayName;

	private BigDecimal fee;

	@Column(name="ip_address")
	private String ipAddress;

	private BigDecimal livestream;

	@Column(name="member_id")
	private BigDecimal memberId;

	@Column(name="pay_the_fee")
	private BigDecimal payTheFee;

	@Column(name="payment_type")
	private String paymentType;

	private String status;

	public CashDonation() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public String getBidderFirstName() {
		return this.bidderFirstName;
	}

	public void setBidderFirstName(String bidderFirstName) {
		this.bidderFirstName = bidderFirstName;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public String getBidderLastName() {
		return this.bidderLastName;
	}

	public void setBidderLastName(String bidderLastName) {
		this.bidderLastName = bidderLastName;
	}

	public BigDecimal getClickId() {
		return this.clickId;
	}

	public void setClickId(BigDecimal clickId) {
		this.clickId = clickId;
	}

	public BigDecimal getClientId() {
		return this.clientId;
	}

	public void setClientId(BigDecimal clientId) {
		this.clientId = clientId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public BigDecimal getFee() {
		return this.fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public BigDecimal getLivestream() {
		return this.livestream;
	}

	public void setLivestream(BigDecimal livestream) {
		this.livestream = livestream;
	}

	public BigDecimal getMemberId() {
		return this.memberId;
	}

	public void setMemberId(BigDecimal memberId) {
		this.memberId = memberId;
	}

	public BigDecimal getPayTheFee() {
		return this.payTheFee;
	}

	public void setPayTheFee(BigDecimal payTheFee) {
		this.payTheFee = payTheFee;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
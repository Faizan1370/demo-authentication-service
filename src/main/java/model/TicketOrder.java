package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ticket_order database table.
 * 
 */
@Entity
@Table(name="ticket_order")
@NamedQuery(name="TicketOrder.findAll", query="SELECT t FROM TicketOrder t")
public class TicketOrder implements Serializable {
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

	@Column(name="cash_donation_id")
	private BigDecimal cashDonationId;

	@Column(name="client_id")
	private BigDecimal clientId;

	private String comments;

	@Column(name="credit_card_id")
	private BigDecimal creditCardId;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="discount_amount")
	private String discountAmount;

	@Column(name="discount_code")
	private String discountCode;

	private BigDecimal fee;

	@Column(name="ip_address")
	private String ipAddress;

	@Column(name="is_offline")
	private BigDecimal isOffline;

	@Column(name="member_id")
	private BigDecimal memberId;

	@Column(name="order_date")
	private Timestamp orderDate;

	@Column(name="pay_the_fee")
	private BigDecimal payTheFee;

	@Column(name="payment_type")
	private String paymentType;

	private BigDecimal quantity;

	private String status;

	@Column(name="ticket_id")
	private BigDecimal ticketId;

	public TicketOrder() {
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

	public BigDecimal getCashDonationId() {
		return this.cashDonationId;
	}

	public void setCashDonationId(BigDecimal cashDonationId) {
		this.cashDonationId = cashDonationId;
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

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountCode() {
		return this.discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
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

	public BigDecimal getIsOffline() {
		return this.isOffline;
	}

	public void setIsOffline(BigDecimal isOffline) {
		this.isOffline = isOffline;
	}

	public BigDecimal getMemberId() {
		return this.memberId;
	}

	public void setMemberId(BigDecimal memberId) {
		this.memberId = memberId;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
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

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(BigDecimal ticketId) {
		this.ticketId = ticketId;
	}

}
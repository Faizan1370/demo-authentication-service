package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the award database table.
 * 
 */
@Entity
@NamedQuery(name="Award.findAll", query="SELECT a FROM Award a")
public class Award implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private BigDecimal amount;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="award_type")
	private String awardType;

	@Column(name="bidder_display_name")
	private String bidderDisplayName;

	@Column(name="bidder_first")
	private String bidderFirst;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="bidder_last")
	private String bidderLast;

	private String city;

	@Column(name="closed_by")
	private String closedBy;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="credit_card_id")
	private BigDecimal creditCardId;

	@Column(name="date_closed")
	private Timestamp dateClosed;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private BigDecimal fee;

	@Column(name="ip_address")
	private String ipAddress;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="notes_id")
	private BigDecimal notesId;

	@Column(name="pay_the_fee")
	private BigDecimal payTheFee;

	@Column(name="payment_type")
	private String paymentType;

	private BigDecimal quantity;

	private BigDecimal shipping;

	private String state;

	private String status;

	private BigDecimal tax;

	public Award() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getAwardType() {
		return this.awardType;
	}

	public void setAwardType(String awardType) {
		this.awardType = awardType;
	}

	public String getBidderDisplayName() {
		return this.bidderDisplayName;
	}

	public void setBidderDisplayName(String bidderDisplayName) {
		this.bidderDisplayName = bidderDisplayName;
	}

	public String getBidderFirst() {
		return this.bidderFirst;
	}

	public void setBidderFirst(String bidderFirst) {
		this.bidderFirst = bidderFirst;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public String getBidderLast() {
		return this.bidderLast;
	}

	public void setBidderLast(String bidderLast) {
		this.bidderLast = bidderLast;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getClosedBy() {
		return this.closedBy;
	}

	public void setClosedBy(String closedBy) {
		this.closedBy = closedBy;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public BigDecimal getCreditCardId() {
		return this.creditCardId;
	}

	public void setCreditCardId(BigDecimal creditCardId) {
		this.creditCardId = creditCardId;
	}

	public Timestamp getDateClosed() {
		return this.dateClosed;
	}

	public void setDateClosed(Timestamp dateClosed) {
		this.dateClosed = dateClosed;
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

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public BigDecimal getNotesId() {
		return this.notesId;
	}

	public void setNotesId(BigDecimal notesId) {
		this.notesId = notesId;
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

	public BigDecimal getShipping() {
		return this.shipping;
	}

	public void setShipping(BigDecimal shipping) {
		this.shipping = shipping;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

}
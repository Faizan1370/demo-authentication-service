package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the quick_sale database table.
 * 
 */
@Entity
@Table(name="quick_sale")
@NamedQuery(name="QuickSale.findAll", query="SELECT q FROM QuickSale q")
public class QuickSale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private BigDecimal amount;

	@Column(name="amount_old")
	private BigDecimal amountOld;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="bidder_first_name")
	private String bidderFirstName;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="bidder_last_name")
	private String bidderLastName;

	@Column(name="credit_card_id")
	private BigDecimal creditCardId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private BigDecimal fee;

	private String name;

	@Column(name="pay_the_fee")
	private BigDecimal payTheFee;

	@Column(name="payment_type")
	private String paymentType;

	private BigDecimal shipping;

	private String status;

	private BigDecimal tax;

	public QuickSale() {
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

	public BigDecimal getAmountOld() {
		return this.amountOld;
	}

	public void setAmountOld(BigDecimal amountOld) {
		this.amountOld = amountOld;
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

	public BigDecimal getFee() {
		return this.fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public BigDecimal getShipping() {
		return this.shipping;
	}

	public void setShipping(BigDecimal shipping) {
		this.shipping = shipping;
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
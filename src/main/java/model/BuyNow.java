package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the buy_now database table.
 * 
 */
@Entity
@Table(name="buy_now")
@NamedQuery(name="BuyNow.findAll", query="SELECT b FROM BuyNow b")
public class BuyNow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private double amount;

	@Column(name="award_id")
	private BigDecimal awardId;

	@Column(name="b4g_bid")
	private BigDecimal b4gBid;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="client_id")
	private BigDecimal clientId;

	@Column(name="credit_card_id")
	private BigDecimal creditCardId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="ip_address")
	private String ipAddress;

	@Column(name="item_id")
	private BigDecimal itemId;

	private BigDecimal quantity;

	public BuyNow() {
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

	public BigDecimal getAwardId() {
		return this.awardId;
	}

	public void setAwardId(BigDecimal awardId) {
		this.awardId = awardId;
	}

	public BigDecimal getB4gBid() {
		return this.b4gBid;
	}

	public void setB4gBid(BigDecimal b4gBid) {
		this.b4gBid = b4gBid;
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

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mv_exploded_awards database table.
 * 
 */
@Entity
@Table(name="mv_exploded_awards")
@NamedQuery(name="MvExplodedAward.findAll", query="SELECT m FROM MvExplodedAward m")
public class MvExplodedAward implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="award_type")
	private String awardType;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="credit_card_id")
	private BigDecimal creditCardId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	private BigDecimal id;

	private Integer idx;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="payment_type")
	private String paymentType;

	private BigDecimal quantity;

	private BigDecimal shipping;

	private String status;

	private BigDecimal tax;

	public MvExplodedAward() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAwardType() {
		return this.awardType;
	}

	public void setAwardType(String awardType) {
		this.awardType = awardType;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
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

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
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
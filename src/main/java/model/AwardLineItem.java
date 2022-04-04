package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the award_line_item database table.
 * 
 */
@Entity
@Table(name="award_line_item")
@NamedQuery(name="AwardLineItem.findAll", query="SELECT a FROM AwardLineItem a")
public class AwardLineItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private BigDecimal amount;

	@Column(name="award_id")
	private BigDecimal awardId;

	@Column(name="purchase_id")
	private BigDecimal purchaseId;

	private BigDecimal quantity;

	private double shipping;

	private double tax;

	public AwardLineItem() {
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

	public BigDecimal getAwardId() {
		return this.awardId;
	}

	public void setAwardId(BigDecimal awardId) {
		this.awardId = awardId;
	}

	public BigDecimal getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(BigDecimal purchaseId) {
		this.purchaseId = purchaseId;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public double getShipping() {
		return this.shipping;
	}

	public void setShipping(double shipping) {
		this.shipping = shipping;
	}

	public double getTax() {
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
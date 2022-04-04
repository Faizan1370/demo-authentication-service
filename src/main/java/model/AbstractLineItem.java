package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the abstract_line_item database table.
 * 
 */
@Entity
@Table(name="abstract_line_item")
@NamedQuery(name="AbstractLineItem.findAll", query="SELECT a FROM AbstractLineItem a")
public class AbstractLineItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private BigDecimal amount;

	@Column(name="amount_old")
	private BigDecimal amountOld;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private String guid;

	@Column(name="purchase_id")
	private BigDecimal purchaseId;

	private BigDecimal quantity;

	private double shipping;

	private double tax;

	public AbstractLineItem() {
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

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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
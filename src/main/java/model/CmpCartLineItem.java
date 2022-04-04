package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the cmp_cart_line_item database table.
 * 
 */
@Entity
@Table(name="cmp_cart_line_item")
@NamedQuery(name="CmpCartLineItem.findAll", query="SELECT c FROM CmpCartLineItem c")
public class CmpCartLineItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_approved")
	private Timestamp dateApproved;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="date_ordered")
	private Timestamp dateOrdered;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="ordered_by")
	private String orderedBy;

	@Column(name="shopping_cart_id")
	private BigDecimal shoppingCartId;

	@Column(name="status_id")
	private BigDecimal statusId;

	public CmpCartLineItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getDateApproved() {
		return this.dateApproved;
	}

	public void setDateApproved(Timestamp dateApproved) {
		this.dateApproved = dateApproved;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public Timestamp getDateOrdered() {
		return this.dateOrdered;
	}

	public void setDateOrdered(Timestamp dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public String getOrderedBy() {
		return this.orderedBy;
	}

	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}

	public BigDecimal getShoppingCartId() {
		return this.shoppingCartId;
	}

	public void setShoppingCartId(BigDecimal shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public BigDecimal getStatusId() {
		return this.statusId;
	}

	public void setStatusId(BigDecimal statusId) {
		this.statusId = statusId;
	}

}
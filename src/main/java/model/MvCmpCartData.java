package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mv_cmp_cart_data database table.
 * 
 */
@Entity
@Table(name="mv_cmp_cart_data")
@NamedQuery(name="MvCmpCartData.findAll", query="SELECT m FROM MvCmpCartData m")
public class MvCmpCartData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cmp_item_id")
	private BigDecimal cmpItemId;

	@Column(name="date_ordered")
	private Timestamp dateOrdered;

	@Column(name="line_item_id")
	private BigDecimal lineItemId;

	private String vendor;

	public MvCmpCartData() {
	}

	public BigDecimal getCmpItemId() {
		return this.cmpItemId;
	}

	public void setCmpItemId(BigDecimal cmpItemId) {
		this.cmpItemId = cmpItemId;
	}

	public Timestamp getDateOrdered() {
		return this.dateOrdered;
	}

	public void setDateOrdered(Timestamp dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public BigDecimal getLineItemId() {
		return this.lineItemId;
	}

	public void setLineItemId(BigDecimal lineItemId) {
		this.lineItemId = lineItemId;
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
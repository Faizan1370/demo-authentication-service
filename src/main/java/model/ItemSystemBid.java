package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the item_system_bids database table.
 * 
 */
@Entity
@Table(name="item_system_bids")
@NamedQuery(name="ItemSystemBid.findAll", query="SELECT i FROM ItemSystemBid i")
public class ItemSystemBid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private double amount;

	@Column(name="bid_id")
	private BigDecimal bidId;

	@Column(name="bid_position")
	private BigDecimal bidPosition;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="extension_bid")
	private BigDecimal extensionBid;

	private BigDecimal fee;

	@Column(name="item_id")
	private BigDecimal itemId;

	public ItemSystemBid() {
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

	public BigDecimal getBidId() {
		return this.bidId;
	}

	public void setBidId(BigDecimal bidId) {
		this.bidId = bidId;
	}

	public BigDecimal getBidPosition() {
		return this.bidPosition;
	}

	public void setBidPosition(BigDecimal bidPosition) {
		this.bidPosition = bidPosition;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getExtensionBid() {
		return this.extensionBid;
	}

	public void setExtensionBid(BigDecimal extensionBid) {
		this.extensionBid = extensionBid;
	}

	public BigDecimal getFee() {
		return this.fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

}
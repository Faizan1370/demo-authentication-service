package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the cmp_consignment_item database table.
 * 
 */
@Entity
@Table(name="cmp_consignment_item")
@NamedQuery(name="CmpConsignmentItem.findAll", query="SELECT c FROM CmpConsignmentItem c")
public class CmpConsignmentItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_category")
	private String auctionCategory;

	private BigDecimal autoauth;

	private double cost;

	@Column(name="item_type")
	private BigDecimal itemType;

	@Column(name="location_id")
	private BigDecimal locationId;

	@Column(name="opening_bid")
	private double openingBid;

	private BigDecimal quantity;

	@Column(name="reserve_price")
	private double reservePrice;

	private double value;

	@Column(name="vendor_id")
	private BigDecimal vendorId;

	public CmpConsignmentItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuctionCategory() {
		return this.auctionCategory;
	}

	public void setAuctionCategory(String auctionCategory) {
		this.auctionCategory = auctionCategory;
	}

	public BigDecimal getAutoauth() {
		return this.autoauth;
	}

	public void setAutoauth(BigDecimal autoauth) {
		this.autoauth = autoauth;
	}

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public BigDecimal getItemType() {
		return this.itemType;
	}

	public void setItemType(BigDecimal itemType) {
		this.itemType = itemType;
	}

	public BigDecimal getLocationId() {
		return this.locationId;
	}

	public void setLocationId(BigDecimal locationId) {
		this.locationId = locationId;
	}

	public double getOpeningBid() {
		return this.openingBid;
	}

	public void setOpeningBid(double openingBid) {
		this.openingBid = openingBid;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public double getReservePrice() {
		return this.reservePrice;
	}

	public void setReservePrice(double reservePrice) {
		this.reservePrice = reservePrice;
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public BigDecimal getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(BigDecimal vendorId) {
		this.vendorId = vendorId;
	}

}
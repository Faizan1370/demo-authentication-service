package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mv_top_bid_data database table.
 * 
 */
@Entity
@Table(name="mv_top_bid_data")
@NamedQuery(name="MvTopBidData.findAll", query="SELECT m FROM MvTopBidData m")
public class MvTopBidData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bid_amount")
	private double bidAmount;

	@Column(name="bid_id")
	private BigDecimal bidId;

	@Column(name="bid_type")
	private String bidType;

	@Column(name="item_id")
	private BigDecimal itemId;

	public MvTopBidData() {
	}

	public double getBidAmount() {
		return this.bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public BigDecimal getBidId() {
		return this.bidId;
	}

	public void setBidId(BigDecimal bidId) {
		this.bidId = bidId;
	}

	public String getBidType() {
		return this.bidType;
	}

	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

}
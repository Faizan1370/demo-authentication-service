package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the top_bid_data_v database table.
 * 
 */
@Entity
@Table(name="top_bid_data_v")
@NamedQuery(name="TopBidDataV.findAll", query="SELECT t FROM TopBidDataV t")
public class TopBidDataV implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bid_amount")
	private double bidAmount;

	@Column(name="bid_id")
	private BigDecimal bidId;

	@Column(name="bid_type")
	private String bidType;

	@Column(name="item_id")
	private BigDecimal itemId;

	public TopBidDataV() {
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
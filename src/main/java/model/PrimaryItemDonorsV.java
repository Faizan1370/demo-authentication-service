package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the primary_item_donors_v database table.
 * 
 */
@Entity
@Table(name="primary_item_donors_v")
@NamedQuery(name="PrimaryItemDonorsV.findAll", query="SELECT p FROM PrimaryItemDonorsV p")
public class PrimaryItemDonorsV implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="donor_id")
	private BigDecimal donorId;

	@Column(name="item_id")
	private BigDecimal itemId;

	public PrimaryItemDonorsV() {
	}

	public BigDecimal getDonorId() {
		return this.donorId;
	}

	public void setDonorId(BigDecimal donorId) {
		this.donorId = donorId;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mv_primary_item_donors database table.
 * 
 */
@Entity
@Table(name="mv_primary_item_donors")
@NamedQuery(name="MvPrimaryItemDonor.findAll", query="SELECT m FROM MvPrimaryItemDonor m")
public class MvPrimaryItemDonor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="donor_id")
	private BigDecimal donorId;

	@Column(name="item_id")
	private BigDecimal itemId;

	public MvPrimaryItemDonor() {
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
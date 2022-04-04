package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the item_donors_old database table.
 * 
 */
@Entity
@Table(name="item_donors_old")
@NamedQuery(name="ItemDonorsOld.findAll", query="SELECT i FROM ItemDonorsOld i")
public class ItemDonorsOld implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemDonorsOldPK id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="donor_id")
	private BigDecimal donorId;

	public ItemDonorsOld() {
	}

	public ItemDonorsOldPK getId() {
		return this.id;
	}

	public void setId(ItemDonorsOldPK id) {
		this.id = id;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getDonorId() {
		return this.donorId;
	}

	public void setDonorId(BigDecimal donorId) {
		this.donorId = donorId;
	}

}
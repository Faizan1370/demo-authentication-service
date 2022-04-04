package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the donated_item_image database table.
 * 
 */
@Entity
@Table(name="donated_item_image")
@NamedQuery(name="DonatedItemImage.findAll", query="SELECT d FROM DonatedItemImage d")
public class DonatedItemImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="donation_id")
	private BigDecimal donationId;

	private String filename;

	public DonatedItemImage() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getDonationId() {
		return this.donationId;
	}

	public void setDonationId(BigDecimal donationId) {
		this.donationId = donationId;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the donor_image database table.
 * 
 */
@Entity
@Table(name="donor_image")
@NamedQuery(name="DonorImage.findAll", query="SELECT d FROM DonorImage d")
public class DonorImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="donor_id")
	private BigDecimal donorId;

	private String filename;

	public DonorImage() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public BigDecimal getDonorId() {
		return this.donorId;
	}

	public void setDonorId(BigDecimal donorId) {
		this.donorId = donorId;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
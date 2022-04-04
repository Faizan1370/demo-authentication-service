package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the donor_thankables database table.
 * 
 */
@Entity
@Table(name="donor_thankables")
@NamedQuery(name="DonorThankable.findAll", query="SELECT d FROM DonorThankable d")
public class DonorThankable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String description;

	@Column(name="donor_thank_yous_id")
	private BigDecimal donorThankYousId;

	private BigDecimal value;

	public DonorThankable() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDonorThankYousId() {
		return this.donorThankYousId;
	}

	public void setDonorThankYousId(BigDecimal donorThankYousId) {
		this.donorThankYousId = donorThankYousId;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
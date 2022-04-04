package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sponsor_level_sponsors database table.
 * 
 */
@Entity
@Table(name="sponsor_level_sponsors")
@NamedQuery(name="SponsorLevelSponsor.findAll", query="SELECT s FROM SponsorLevelSponsor s")
public class SponsorLevelSponsor implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SponsorLevelSponsorPK id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="sponsor_id")
	private BigDecimal sponsorId;

	public SponsorLevelSponsor() {
	}

	public SponsorLevelSponsorPK getId() {
		return this.id;
	}

	public void setId(SponsorLevelSponsorPK id) {
		this.id = id;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getSponsorId() {
		return this.sponsorId;
	}

	public void setSponsorId(BigDecimal sponsorId) {
		this.sponsorId = sponsorId;
	}

}
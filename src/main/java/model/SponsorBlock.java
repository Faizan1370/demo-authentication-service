package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sponsor_block database table.
 * 
 */
@Entity
@Table(name="sponsor_block")
@NamedQuery(name="SponsorBlock.findAll", query="SELECT s FROM SponsorBlock s")
public class SponsorBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="sponsor_id")
	private BigDecimal sponsorId;

	public SponsorBlock() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getSponsorId() {
		return this.sponsorId;
	}

	public void setSponsorId(BigDecimal sponsorId) {
		this.sponsorId = sponsorId;
	}

}
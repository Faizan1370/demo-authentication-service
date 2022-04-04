package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sponsor_level database table.
 * 
 */
@Entity
@Table(name="sponsor_level")
@NamedQuery(name="SponsorLevel.findAll", query="SELECT s FROM SponsorLevel s")
public class SponsorLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private String tier;

	private String title;

	@Column(name="title_fr")
	private String titleFr;

	public SponsorLevel() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public String getTier() {
		return this.tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleFr() {
		return this.titleFr;
	}

	public void setTitleFr(String titleFr) {
		this.titleFr = titleFr;
	}

}
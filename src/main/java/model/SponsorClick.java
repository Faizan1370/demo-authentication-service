package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sponsor_clicks database table.
 * 
 */
@Entity
@Table(name="sponsor_clicks")
@NamedQuery(name="SponsorClick.findAll", query="SELECT s FROM SponsorClick s")
public class SponsorClick implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="donor_id")
	private BigDecimal donorId;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="org_id")
	private BigDecimal orgId;

	private String source;

	@Column(name="sponsor_blk_id")
	private BigDecimal sponsorBlkId;

	public SponsorClick() {
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

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public BigDecimal getSponsorBlkId() {
		return this.sponsorBlkId;
	}

	public void setSponsorBlkId(BigDecimal sponsorBlkId) {
		this.sponsorBlkId = sponsorBlkId;
	}

}
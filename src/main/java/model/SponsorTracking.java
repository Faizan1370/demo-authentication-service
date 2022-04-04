package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sponsor_tracking database table.
 * 
 */
@Entity
@Table(name="sponsor_tracking")
@NamedQuery(name="SponsorTracking.findAll", query="SELECT s FROM SponsorTracking s")
public class SponsorTracking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	private BigDecimal clicks;

	@Column(name="date_logged")
	private Timestamp dateLogged;

	@Column(name="donor_id")
	private BigDecimal donorId;

	private BigDecimal impressions;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="org_id")
	private BigDecimal orgId;

	private String source;

	@Column(name="sponsor_blk_id")
	private BigDecimal sponsorBlkId;

	public SponsorTracking() {
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

	public BigDecimal getClicks() {
		return this.clicks;
	}

	public void setClicks(BigDecimal clicks) {
		this.clicks = clicks;
	}

	public Timestamp getDateLogged() {
		return this.dateLogged;
	}

	public void setDateLogged(Timestamp dateLogged) {
		this.dateLogged = dateLogged;
	}

	public BigDecimal getDonorId() {
		return this.donorId;
	}

	public void setDonorId(BigDecimal donorId) {
		this.donorId = donorId;
	}

	public BigDecimal getImpressions() {
		return this.impressions;
	}

	public void setImpressions(BigDecimal impressions) {
		this.impressions = impressions;
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
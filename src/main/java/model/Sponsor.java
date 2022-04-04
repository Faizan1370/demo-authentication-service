package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sponsor database table.
 * 
 */
@Entity
@NamedQuery(name="Sponsor.findAll", query="SELECT s FROM Sponsor s")
public class Sponsor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="comments_id")
	private BigDecimal commentsId;

	private String contribution;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="donor_id")
	private BigDecimal donorId;

	private String guid;

	private BigDecimal value;

	public Sponsor() {
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

	public BigDecimal getCommentsId() {
		return this.commentsId;
	}

	public void setCommentsId(BigDecimal commentsId) {
		this.commentsId = commentsId;
	}

	public String getContribution() {
		return this.contribution;
	}

	public void setContribution(String contribution) {
		this.contribution = contribution;
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

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
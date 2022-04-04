package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the prospect database table.
 * 
 */
@Entity
@NamedQuery(name="Prospect.findAll", query="SELECT p FROM Prospect p")
public class Prospect implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	private Timestamp created;

	@Column(name="date_modified")
	private Timestamp dateModified;

	public Prospect() {
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

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the goodometer_snapshots database table.
 * 
 */
@Entity
@Table(name="goodometer_snapshots")
@NamedQuery(name="GoodometerSnapshot.findAll", query="SELECT g FROM GoodometerSnapshot g")
public class GoodometerSnapshot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_count")
	private BigDecimal auctionCount;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="dollars_raised")
	private BigDecimal dollarsRaised;

	public GoodometerSnapshot() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAuctionCount() {
		return this.auctionCount;
	}

	public void setAuctionCount(BigDecimal auctionCount) {
		this.auctionCount = auctionCount;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getDollarsRaised() {
		return this.dollarsRaised;
	}

	public void setDollarsRaised(BigDecimal dollarsRaised) {
		this.dollarsRaised = dollarsRaised;
	}

}
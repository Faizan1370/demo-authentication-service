package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the auction_lot database table.
 * 
 */
@Entity
@Table(name="auction_lot")
@NamedQuery(name="AuctionLot.findAll", query="SELECT a FROM AuctionLot a")
public class AuctionLot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="date_confirmed")
	private Timestamp dateConfirmed;

	@Column(name="date_reserved")
	private Timestamp dateReserved;

	private BigDecimal lot;

	public AuctionLot() {
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

	public Timestamp getDateConfirmed() {
		return this.dateConfirmed;
	}

	public void setDateConfirmed(Timestamp dateConfirmed) {
		this.dateConfirmed = dateConfirmed;
	}

	public Timestamp getDateReserved() {
		return this.dateReserved;
	}

	public void setDateReserved(Timestamp dateReserved) {
		this.dateReserved = dateReserved;
	}

	public BigDecimal getLot() {
		return this.lot;
	}

	public void setLot(BigDecimal lot) {
		this.lot = lot;
	}

}
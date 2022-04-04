package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the auction_access_code database table.
 * 
 */
@Embeddable
public class AuctionAccessCodePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long id;

	@Column(name="auction_id", insertable=false, updatable=false)
	private long auctionId;

	public AuctionAccessCodePK() {
	}
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAuctionId() {
		return this.auctionId;
	}
	public void setAuctionId(long auctionId) {
		this.auctionId = auctionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AuctionAccessCodePK)) {
			return false;
		}
		AuctionAccessCodePK castOther = (AuctionAccessCodePK)other;
		return 
			(this.id == castOther.id)
			&& (this.auctionId == castOther.auctionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.id ^ (this.id >>> 32)));
		hash = hash * prime + ((int) (this.auctionId ^ (this.auctionId >>> 32)));
		
		return hash;
	}
}
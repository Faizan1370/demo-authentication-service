package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the guest_checkin_audit database table.
 * 
 */
@Embeddable
public class GuestCheckinAuditPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long id;

	@Column(name="auction_id", insertable=false, updatable=false)
	private long auctionId;

	@Column(name="access_code_id")
	private long accessCodeId;

	public GuestCheckinAuditPK() {
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
	public long getAccessCodeId() {
		return this.accessCodeId;
	}
	public void setAccessCodeId(long accessCodeId) {
		this.accessCodeId = accessCodeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GuestCheckinAuditPK)) {
			return false;
		}
		GuestCheckinAuditPK castOther = (GuestCheckinAuditPK)other;
		return 
			(this.id == castOther.id)
			&& (this.auctionId == castOther.auctionId)
			&& (this.accessCodeId == castOther.accessCodeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.id ^ (this.id >>> 32)));
		hash = hash * prime + ((int) (this.auctionId ^ (this.auctionId >>> 32)));
		hash = hash * prime + ((int) (this.accessCodeId ^ (this.accessCodeId >>> 32)));
		
		return hash;
	}
}
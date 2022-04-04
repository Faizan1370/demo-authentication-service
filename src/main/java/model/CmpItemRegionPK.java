package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cmp_item_region database table.
 * 
 */
@Embeddable
public class CmpItemRegionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="abstract_item_id")
	private long abstractItemId;

	@Column(name="region_id")
	private long regionId;

	public CmpItemRegionPK() {
	}
	public long getAbstractItemId() {
		return this.abstractItemId;
	}
	public void setAbstractItemId(long abstractItemId) {
		this.abstractItemId = abstractItemId;
	}
	public long getRegionId() {
		return this.regionId;
	}
	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CmpItemRegionPK)) {
			return false;
		}
		CmpItemRegionPK castOther = (CmpItemRegionPK)other;
		return 
			(this.abstractItemId == castOther.abstractItemId)
			&& (this.regionId == castOther.regionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.abstractItemId ^ (this.abstractItemId >>> 32)));
		hash = hash * prime + ((int) (this.regionId ^ (this.regionId >>> 32)));
		
		return hash;
	}
}
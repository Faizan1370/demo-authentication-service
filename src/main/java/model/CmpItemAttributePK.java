package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cmp_item_attributes database table.
 * 
 */
@Embeddable
public class CmpItemAttributePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cmp_item_id")
	private long cmpItemId;

	@Column(name="taxonomy_id")
	private long taxonomyId;

	public CmpItemAttributePK() {
	}
	public long getCmpItemId() {
		return this.cmpItemId;
	}
	public void setCmpItemId(long cmpItemId) {
		this.cmpItemId = cmpItemId;
	}
	public long getTaxonomyId() {
		return this.taxonomyId;
	}
	public void setTaxonomyId(long taxonomyId) {
		this.taxonomyId = taxonomyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CmpItemAttributePK)) {
			return false;
		}
		CmpItemAttributePK castOther = (CmpItemAttributePK)other;
		return 
			(this.cmpItemId == castOther.cmpItemId)
			&& (this.taxonomyId == castOther.taxonomyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cmpItemId ^ (this.cmpItemId >>> 32)));
		hash = hash * prime + ((int) (this.taxonomyId ^ (this.taxonomyId >>> 32)));
		
		return hash;
	}
}
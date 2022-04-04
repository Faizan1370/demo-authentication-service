package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the item_attributes database table.
 * 
 */
@Embeddable
public class ItemAttributePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="item_id")
	private long itemId;

	@Column(name="taxonomy_id")
	private long taxonomyId;

	public ItemAttributePK() {
	}
	public long getItemId() {
		return this.itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
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
		if (!(other instanceof ItemAttributePK)) {
			return false;
		}
		ItemAttributePK castOther = (ItemAttributePK)other;
		return 
			(this.itemId == castOther.itemId)
			&& (this.taxonomyId == castOther.taxonomyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.itemId ^ (this.itemId >>> 32)));
		hash = hash * prime + ((int) (this.taxonomyId ^ (this.taxonomyId >>> 32)));
		
		return hash;
	}
}
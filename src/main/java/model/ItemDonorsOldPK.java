package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the item_donors_old database table.
 * 
 */
@Embeddable
public class ItemDonorsOldPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="item_id")
	private long itemId;

	@Column(name="display_position")
	private long displayPosition;

	public ItemDonorsOldPK() {
	}
	public long getItemId() {
		return this.itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public long getDisplayPosition() {
		return this.displayPosition;
	}
	public void setDisplayPosition(long displayPosition) {
		this.displayPosition = displayPosition;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ItemDonorsOldPK)) {
			return false;
		}
		ItemDonorsOldPK castOther = (ItemDonorsOldPK)other;
		return 
			(this.itemId == castOther.itemId)
			&& (this.displayPosition == castOther.displayPosition);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.itemId ^ (this.itemId >>> 32)));
		hash = hash * prime + ((int) (this.displayPosition ^ (this.displayPosition >>> 32)));
		
		return hash;
	}
}
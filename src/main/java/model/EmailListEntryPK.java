package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the email_list_entries database table.
 * 
 */
@Embeddable
public class EmailListEntryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="list_id")
	private long listId;

	@Column(name="entry_id")
	private long entryId;

	public EmailListEntryPK() {
	}
	public long getListId() {
		return this.listId;
	}
	public void setListId(long listId) {
		this.listId = listId;
	}
	public long getEntryId() {
		return this.entryId;
	}
	public void setEntryId(long entryId) {
		this.entryId = entryId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EmailListEntryPK)) {
			return false;
		}
		EmailListEntryPK castOther = (EmailListEntryPK)other;
		return 
			(this.listId == castOther.listId)
			&& (this.entryId == castOther.entryId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.listId ^ (this.listId >>> 32)));
		hash = hash * prime + ((int) (this.entryId ^ (this.entryId >>> 32)));
		
		return hash;
	}
}
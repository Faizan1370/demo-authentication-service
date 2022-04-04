package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cause_group_cause_category database table.
 * 
 */
@Embeddable
public class CauseGroupCauseCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cause_group_id")
	private long causeGroupId;

	@Column(name="cause_category_id")
	private long causeCategoryId;

	public CauseGroupCauseCategoryPK() {
	}
	public long getCauseGroupId() {
		return this.causeGroupId;
	}
	public void setCauseGroupId(long causeGroupId) {
		this.causeGroupId = causeGroupId;
	}
	public long getCauseCategoryId() {
		return this.causeCategoryId;
	}
	public void setCauseCategoryId(long causeCategoryId) {
		this.causeCategoryId = causeCategoryId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CauseGroupCauseCategoryPK)) {
			return false;
		}
		CauseGroupCauseCategoryPK castOther = (CauseGroupCauseCategoryPK)other;
		return 
			(this.causeGroupId == castOther.causeGroupId)
			&& (this.causeCategoryId == castOther.causeCategoryId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.causeGroupId ^ (this.causeGroupId >>> 32)));
		hash = hash * prime + ((int) (this.causeCategoryId ^ (this.causeCategoryId >>> 32)));
		
		return hash;
	}
}
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sponsor_level_sponsors database table.
 * 
 */
@Embeddable
public class SponsorLevelSponsorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="level_id")
	private long levelId;

	@Column(name="display_position")
	private long displayPosition;

	public SponsorLevelSponsorPK() {
	}
	public long getLevelId() {
		return this.levelId;
	}
	public void setLevelId(long levelId) {
		this.levelId = levelId;
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
		if (!(other instanceof SponsorLevelSponsorPK)) {
			return false;
		}
		SponsorLevelSponsorPK castOther = (SponsorLevelSponsorPK)other;
		return 
			(this.levelId == castOther.levelId)
			&& (this.displayPosition == castOther.displayPosition);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.levelId ^ (this.levelId >>> 32)));
		hash = hash * prime + ((int) (this.displayPosition ^ (this.displayPosition >>> 32)));
		
		return hash;
	}
}
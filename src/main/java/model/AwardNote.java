package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the award_notes database table.
 * 
 */
@Entity
@Table(name="award_notes")
@NamedQuery(name="AwardNote.findAll", query="SELECT a FROM AwardNote a")
public class AwardNote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="bidder_note")
	private String bidderNote;

	@Column(name="donor_note")
	private String donorNote;

	public AwardNote() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBidderNote() {
		return this.bidderNote;
	}

	public void setBidderNote(String bidderNote) {
		this.bidderNote = bidderNote;
	}

	public String getDonorNote() {
		return this.donorNote;
	}

	public void setDonorNote(String donorNote) {
		this.donorNote = donorNote;
	}

}
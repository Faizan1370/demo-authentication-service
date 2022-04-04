package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sponsorship_comments database table.
 * 
 */
@Entity
@Table(name="sponsorship_comments")
@NamedQuery(name="SponsorshipComment.findAll", query="SELECT s FROM SponsorshipComment s")
public class SponsorshipComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String comments;

	public SponsorshipComment() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
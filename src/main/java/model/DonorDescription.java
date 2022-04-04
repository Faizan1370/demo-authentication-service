package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the donor_descriptions database table.
 * 
 */
@Entity
@Table(name="donor_descriptions")
@NamedQuery(name="DonorDescription.findAll", query="SELECT d FROM DonorDescription d")
public class DonorDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String description;

	public DonorDescription() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the organization_descriptions database table.
 * 
 */
@Entity
@Table(name="organization_descriptions")
@NamedQuery(name="OrganizationDescription.findAll", query="SELECT o FROM OrganizationDescription o")
public class OrganizationDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String description;

	public OrganizationDescription() {
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
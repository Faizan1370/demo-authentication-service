package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_region database table.
 * 
 */
@Entity
@Table(name="cmp_region")
@NamedQuery(name="CmpRegion.findAll", query="SELECT c FROM CmpRegion c")
public class CmpRegion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String description;

	private String name;

	public CmpRegion() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
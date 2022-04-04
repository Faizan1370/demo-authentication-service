package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cause_category database table.
 * 
 */
@Entity
@Table(name="cause_category")
@NamedQuery(name="CauseCategory.findAll", query="SELECT c FROM CauseCategory c")
public class CauseCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String category;

	public CauseCategory() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
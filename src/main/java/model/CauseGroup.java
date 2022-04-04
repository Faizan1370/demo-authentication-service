package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cause_group database table.
 * 
 */
@Entity
@Table(name="cause_group")
@NamedQuery(name="CauseGroup.findAll", query="SELECT c FROM CauseGroup c")
public class CauseGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String name;

	public CauseGroup() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
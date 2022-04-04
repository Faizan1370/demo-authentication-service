package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the starterkit database table.
 * 
 */
@Entity
@NamedQuery(name="Starterkit.findAll", query="SELECT s FROM Starterkit s")
public class Starterkit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	public Starterkit() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
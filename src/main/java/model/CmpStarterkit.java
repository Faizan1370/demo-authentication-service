package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_starterkit database table.
 * 
 */
@Entity
@Table(name="cmp_starterkit")
@NamedQuery(name="CmpStarterkit.findAll", query="SELECT c FROM CmpStarterkit c")
public class CmpStarterkit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	public CmpStarterkit() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
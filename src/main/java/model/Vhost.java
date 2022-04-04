package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vhost database table.
 * 
 */
@Entity
@NamedQuery(name="Vhost.findAll", query="SELECT v FROM Vhost v")
public class Vhost implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VhostPK id;

	public Vhost() {
	}

	public VhostPK getId() {
		return this.id;
	}

	public void setId(VhostPK id) {
		this.id = id;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vhost database table.
 * 
 */
@Embeddable
public class VhostPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String vhost;

	private String alias;

	public VhostPK() {
	}
	public String getVhost() {
		return this.vhost;
	}
	public void setVhost(String vhost) {
		this.vhost = vhost;
	}
	public String getAlias() {
		return this.alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VhostPK)) {
			return false;
		}
		VhostPK castOther = (VhostPK)other;
		return 
			this.vhost.equals(castOther.vhost)
			&& this.alias.equals(castOther.alias);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.vhost.hashCode();
		hash = hash * prime + this.alias.hashCode();
		
		return hash;
	}
}
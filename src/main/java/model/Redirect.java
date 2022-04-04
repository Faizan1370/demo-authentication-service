package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the redirect database table.
 * 
 */
@Entity
@NamedQuery(name="Redirect.findAll", query="SELECT r FROM Redirect r")
public class Redirect implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String alias;

	private String vhost;

	public Redirect() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getVhost() {
		return this.vhost;
	}

	public void setVhost(String vhost) {
		this.vhost = vhost;
	}

}
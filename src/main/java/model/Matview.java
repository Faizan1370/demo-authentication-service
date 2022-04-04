package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the matviews database table.
 * 
 */
@Entity
@Table(name="matviews")
@NamedQuery(name="Matview.findAll", query="SELECT m FROM Matview m")
public class Matview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mv_name")
	private String mvName;

	@Column(name="last_refresh")
	private Timestamp lastRefresh;

	@Column(name="v_name")
	private String vName;

	public Matview() {
	}

	public String getMvName() {
		return this.mvName;
	}

	public void setMvName(String mvName) {
		this.mvName = mvName;
	}

	public Timestamp getLastRefresh() {
		return this.lastRefresh;
	}

	public void setLastRefresh(Timestamp lastRefresh) {
		this.lastRefresh = lastRefresh;
	}

	public String getVName() {
		return this.vName;
	}

	public void setVName(String vName) {
		this.vName = vName;
	}

}
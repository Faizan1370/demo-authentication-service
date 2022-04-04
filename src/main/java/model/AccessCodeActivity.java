package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the access_code_activity database table.
 * 
 */
@Entity
@Table(name="access_code_activity")
@NamedQuery(name="AccessCodeActivity.findAll", query="SELECT a FROM AccessCodeActivity a")
public class AccessCodeActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="checkin_date")
	private Timestamp checkinDate;

	@Column(name="ip_address")
	private String ipAddress;

	public AccessCodeActivity() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getCheckinDate() {
		return this.checkinDate;
	}

	public void setCheckinDate(Timestamp checkinDate) {
		this.checkinDate = checkinDate;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

}
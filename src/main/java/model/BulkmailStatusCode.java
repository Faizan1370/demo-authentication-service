package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bulkmail_status_codes database table.
 * 
 */
@Entity
@Table(name="bulkmail_status_codes")
@NamedQuery(name="BulkmailStatusCode.findAll", query="SELECT b FROM BulkmailStatusCode b")
public class BulkmailStatusCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="status_id")
	private long statusId;

	@Column(name="status_code")
	private String statusCode;

	public BulkmailStatusCode() {
	}

	public long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(long statusId) {
		this.statusId = statusId;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

}
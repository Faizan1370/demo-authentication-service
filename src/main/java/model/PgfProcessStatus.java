package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pgf_process_status database table.
 * 
 */
@Entity
@Table(name="pgf_process_status")
@NamedQuery(name="PgfProcessStatus.findAll", query="SELECT p FROM PgfProcessStatus p")
public class PgfProcessStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String status;

	public PgfProcessStatus() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
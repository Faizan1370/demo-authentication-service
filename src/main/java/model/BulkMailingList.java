package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bulk_mailing_lists database table.
 * 
 */
@Entity
@Table(name="bulk_mailing_lists")
@NamedQuery(name="BulkMailingList.findAll", query="SELECT b FROM BulkMailingList b")
public class BulkMailingList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="job_id")
	private BigDecimal jobId;

	@Column(name="list_id")
	private BigDecimal listId;

	public BulkMailingList() {
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getJobId() {
		return this.jobId;
	}

	public void setJobId(BigDecimal jobId) {
		this.jobId = jobId;
	}

	public BigDecimal getListId() {
		return this.listId;
	}

	public void setListId(BigDecimal listId) {
		this.listId = listId;
	}

}
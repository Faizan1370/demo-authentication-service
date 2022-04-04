package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bulk_message_rollup database table.
 * 
 */
@Entity
@Table(name="bulk_message_rollup")
@NamedQuery(name="BulkMessageRollup.findAll", query="SELECT b FROM BulkMessageRollup b")
public class BulkMessageRollup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="job_id")
	private long jobId;

	private BigDecimal attempted;

	private BigDecimal bounced;

	private BigDecimal clicked;

	@Column(name="date_created")
	private Timestamp dateCreated;

	private BigDecimal delivered;

	private BigDecimal failed;

	@Column(name="in_progress")
	private BigDecimal inProgress;

	private BigDecimal opened;

	public BulkMessageRollup() {
	}

	public long getJobId() {
		return this.jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public BigDecimal getAttempted() {
		return this.attempted;
	}

	public void setAttempted(BigDecimal attempted) {
		this.attempted = attempted;
	}

	public BigDecimal getBounced() {
		return this.bounced;
	}

	public void setBounced(BigDecimal bounced) {
		this.bounced = bounced;
	}

	public BigDecimal getClicked() {
		return this.clicked;
	}

	public void setClicked(BigDecimal clicked) {
		this.clicked = clicked;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getDelivered() {
		return this.delivered;
	}

	public void setDelivered(BigDecimal delivered) {
		this.delivered = delivered;
	}

	public BigDecimal getFailed() {
		return this.failed;
	}

	public void setFailed(BigDecimal failed) {
		this.failed = failed;
	}

	public BigDecimal getInProgress() {
		return this.inProgress;
	}

	public void setInProgress(BigDecimal inProgress) {
		this.inProgress = inProgress;
	}

	public BigDecimal getOpened() {
		return this.opened;
	}

	public void setOpened(BigDecimal opened) {
		this.opened = opened;
	}

}
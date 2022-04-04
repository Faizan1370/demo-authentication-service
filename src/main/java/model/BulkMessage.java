package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bulk_messages database table.
 * 
 */
@Entity
@Table(name="bulk_messages")
@NamedQuery(name="BulkMessage.findAll", query="SELECT b FROM BulkMessage b")
public class BulkMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="message_id")
	private long messageId;

	@Column(name="attempt_count")
	private BigDecimal attemptCount;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="email_address")
	private String emailAddress;

	@Column(name="is_clicked")
	private BigDecimal isClicked;

	@Column(name="is_opened")
	private BigDecimal isOpened;

	@Column(name="job_id")
	private BigDecimal jobId;

	@Column(name="last_attempt")
	private Timestamp lastAttempt;

	@Column(name="last_response")
	private String lastResponse;

	@Column(name="mime_type")
	private String mimeType;

	@Column(name="sendgrid_id")
	private String sendgridId;

	private String status;

	@Column(name="status_id")
	private BigDecimal statusId;

	public BulkMessage() {
	}

	public long getMessageId() {
		return this.messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public BigDecimal getAttemptCount() {
		return this.attemptCount;
	}

	public void setAttemptCount(BigDecimal attemptCount) {
		this.attemptCount = attemptCount;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public BigDecimal getIsClicked() {
		return this.isClicked;
	}

	public void setIsClicked(BigDecimal isClicked) {
		this.isClicked = isClicked;
	}

	public BigDecimal getIsOpened() {
		return this.isOpened;
	}

	public void setIsOpened(BigDecimal isOpened) {
		this.isOpened = isOpened;
	}

	public BigDecimal getJobId() {
		return this.jobId;
	}

	public void setJobId(BigDecimal jobId) {
		this.jobId = jobId;
	}

	public Timestamp getLastAttempt() {
		return this.lastAttempt;
	}

	public void setLastAttempt(Timestamp lastAttempt) {
		this.lastAttempt = lastAttempt;
	}

	public String getLastResponse() {
		return this.lastResponse;
	}

	public void setLastResponse(String lastResponse) {
		this.lastResponse = lastResponse;
	}

	public String getMimeType() {
		return this.mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getSendgridId() {
		return this.sendgridId;
	}

	public void setSendgridId(String sendgridId) {
		this.sendgridId = sendgridId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getStatusId() {
		return this.statusId;
	}

	public void setStatusId(BigDecimal statusId) {
		this.statusId = statusId;
	}

}
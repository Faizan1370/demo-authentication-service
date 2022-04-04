package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bulk_job database table.
 * 
 */
@Entity
@Table(name="bulk_job")
@NamedQuery(name="BulkJob.findAll", query="SELECT b FROM BulkJob b")
public class BulkJob implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="job_id")
	private long jobId;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="body_id")
	private BigDecimal bodyId;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="document_id")
	private BigDecimal documentId;

	@Column(name="include_all_attendees")
	private BigDecimal includeAllAttendees;

	@Column(name="include_auction_participants")
	private BigDecimal includeAuctionParticipants;

	@Column(name="include_interested_persons")
	private BigDecimal includeInterestedPersons;

	@Column(name="include_unregistered_attendees")
	private BigDecimal includeUnregisteredAttendees;

	@Column(name="job_created")
	private Timestamp jobCreated;

	@Column(name="job_finished")
	private Timestamp jobFinished;

	@Column(name="job_priority")
	private BigDecimal jobPriority;

	@Column(name="job_started")
	private Timestamp jobStarted;

	@Column(name="job_type")
	private String jobType;

	@Column(name="msg_from")
	private String msgFrom;

	@Column(name="msg_name")
	private String msgName;

	@Column(name="msg_subject")
	private String msgSubject;

	@Column(name="organization_id")
	private BigDecimal organizationId;

	@Column(name="previous_status")
	private String previousStatus;

	@Column(name="previous_status_id")
	private BigDecimal previousStatusId;

	private String status;

	@Column(name="status_id")
	private BigDecimal statusId;

	private String type;

	public BulkJob() {
	}

	public long getJobId() {
		return this.jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getBodyId() {
		return this.bodyId;
	}

	public void setBodyId(BigDecimal bodyId) {
		this.bodyId = bodyId;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public BigDecimal getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(BigDecimal documentId) {
		this.documentId = documentId;
	}

	public BigDecimal getIncludeAllAttendees() {
		return this.includeAllAttendees;
	}

	public void setIncludeAllAttendees(BigDecimal includeAllAttendees) {
		this.includeAllAttendees = includeAllAttendees;
	}

	public BigDecimal getIncludeAuctionParticipants() {
		return this.includeAuctionParticipants;
	}

	public void setIncludeAuctionParticipants(BigDecimal includeAuctionParticipants) {
		this.includeAuctionParticipants = includeAuctionParticipants;
	}

	public BigDecimal getIncludeInterestedPersons() {
		return this.includeInterestedPersons;
	}

	public void setIncludeInterestedPersons(BigDecimal includeInterestedPersons) {
		this.includeInterestedPersons = includeInterestedPersons;
	}

	public BigDecimal getIncludeUnregisteredAttendees() {
		return this.includeUnregisteredAttendees;
	}

	public void setIncludeUnregisteredAttendees(BigDecimal includeUnregisteredAttendees) {
		this.includeUnregisteredAttendees = includeUnregisteredAttendees;
	}

	public Timestamp getJobCreated() {
		return this.jobCreated;
	}

	public void setJobCreated(Timestamp jobCreated) {
		this.jobCreated = jobCreated;
	}

	public Timestamp getJobFinished() {
		return this.jobFinished;
	}

	public void setJobFinished(Timestamp jobFinished) {
		this.jobFinished = jobFinished;
	}

	public BigDecimal getJobPriority() {
		return this.jobPriority;
	}

	public void setJobPriority(BigDecimal jobPriority) {
		this.jobPriority = jobPriority;
	}

	public Timestamp getJobStarted() {
		return this.jobStarted;
	}

	public void setJobStarted(Timestamp jobStarted) {
		this.jobStarted = jobStarted;
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getMsgFrom() {
		return this.msgFrom;
	}

	public void setMsgFrom(String msgFrom) {
		this.msgFrom = msgFrom;
	}

	public String getMsgName() {
		return this.msgName;
	}

	public void setMsgName(String msgName) {
		this.msgName = msgName;
	}

	public String getMsgSubject() {
		return this.msgSubject;
	}

	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public String getPreviousStatus() {
		return this.previousStatus;
	}

	public void setPreviousStatus(String previousStatus) {
		this.previousStatus = previousStatus;
	}

	public BigDecimal getPreviousStatusId() {
		return this.previousStatusId;
	}

	public void setPreviousStatusId(BigDecimal previousStatusId) {
		this.previousStatusId = previousStatusId;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
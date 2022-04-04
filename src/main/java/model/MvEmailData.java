package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mv_email_data database table.
 * 
 */
@Entity
@Table(name="mv_email_data")
@NamedQuery(name="MvEmailData.findAll", query="SELECT m FROM MvEmailData m")
public class MvEmailData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	private BigDecimal bounced;

	private BigDecimal clicks;

	@Column(name="create_time")
	private Timestamp createTime;

	private BigDecimal delivered;

	@Column(name="email_document_id")
	private BigDecimal emailDocumentId;

	private BigDecimal emails;

	@Column(name="event_name")
	private String eventName;

	private BigDecimal failed;

	@Column(name="finish_time")
	private Timestamp finishTime;

	@Column(name="include_auction_participants")
	private BigDecimal includeAuctionParticipants;

	@Column(name="include_interested_persons")
	private BigDecimal includeInterestedPersons;

	@Column(name="job_id")
	private BigDecimal jobId;

	@Column(name="msg_name")
	private String msgName;

	@Column(name="msg_subject")
	private String msgSubject;

	private BigDecimal opened;

	@Column(name="order_no")
	private Long orderNo;

	@Column(name="organization_id")
	private BigDecimal organizationId;

	@Column(name="start_time")
	private Timestamp startTime;

	public MvEmailData() {
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getBounced() {
		return this.bounced;
	}

	public void setBounced(BigDecimal bounced) {
		this.bounced = bounced;
	}

	public BigDecimal getClicks() {
		return this.clicks;
	}

	public void setClicks(BigDecimal clicks) {
		this.clicks = clicks;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getDelivered() {
		return this.delivered;
	}

	public void setDelivered(BigDecimal delivered) {
		this.delivered = delivered;
	}

	public BigDecimal getEmailDocumentId() {
		return this.emailDocumentId;
	}

	public void setEmailDocumentId(BigDecimal emailDocumentId) {
		this.emailDocumentId = emailDocumentId;
	}

	public BigDecimal getEmails() {
		return this.emails;
	}

	public void setEmails(BigDecimal emails) {
		this.emails = emails;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public BigDecimal getFailed() {
		return this.failed;
	}

	public void setFailed(BigDecimal failed) {
		this.failed = failed;
	}

	public Timestamp getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(Timestamp finishTime) {
		this.finishTime = finishTime;
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

	public BigDecimal getJobId() {
		return this.jobId;
	}

	public void setJobId(BigDecimal jobId) {
		this.jobId = jobId;
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

	public BigDecimal getOpened() {
		return this.opened;
	}

	public void setOpened(BigDecimal opened) {
		this.opened = opened;
	}

	public Long getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

}
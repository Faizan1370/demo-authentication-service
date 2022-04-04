package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sms_preferences database table.
 * 
 */
@Entity
@Table(name="sms_preferences")
@NamedQuery(name="SmsPreference.findAll", query="SELECT s FROM SmsPreference s")
public class SmsPreference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="group_sms_enabled")
	private BigDecimal groupSmsEnabled;

	@Column(name="outbid_sms_enabled")
	private BigDecimal outbidSmsEnabled;

	@Column(name="sms_end_time")
	private Timestamp smsEndTime;

	@Column(name="sms_start_time")
	private Timestamp smsStartTime;

	@Column(name="sms_time_zone")
	private String smsTimeZone;

	public SmsPreference() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public BigDecimal getGroupSmsEnabled() {
		return this.groupSmsEnabled;
	}

	public void setGroupSmsEnabled(BigDecimal groupSmsEnabled) {
		this.groupSmsEnabled = groupSmsEnabled;
	}

	public BigDecimal getOutbidSmsEnabled() {
		return this.outbidSmsEnabled;
	}

	public void setOutbidSmsEnabled(BigDecimal outbidSmsEnabled) {
		this.outbidSmsEnabled = outbidSmsEnabled;
	}

	public Timestamp getSmsEndTime() {
		return this.smsEndTime;
	}

	public void setSmsEndTime(Timestamp smsEndTime) {
		this.smsEndTime = smsEndTime;
	}

	public Timestamp getSmsStartTime() {
		return this.smsStartTime;
	}

	public void setSmsStartTime(Timestamp smsStartTime) {
		this.smsStartTime = smsStartTime;
	}

	public String getSmsTimeZone() {
		return this.smsTimeZone;
	}

	public void setSmsTimeZone(String smsTimeZone) {
		this.smsTimeZone = smsTimeZone;
	}

}
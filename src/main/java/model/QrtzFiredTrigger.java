package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qrtz_fired_triggers database table.
 * 
 */
@Entity
@Table(name="qrtz_fired_triggers")
@NamedQuery(name="QrtzFiredTrigger.findAll", query="SELECT q FROM QrtzFiredTrigger q")
public class QrtzFiredTrigger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="entry_id")
	private String entryId;

	@Column(name="fired_time")
	private Long firedTime;

	@Column(name="instance_name")
	private String instanceName;

	@Column(name="is_stateful")
	private Boolean isStateful;

	@Column(name="is_volatile")
	private Boolean isVolatile;

	@Column(name="job_group")
	private String jobGroup;

	@Column(name="job_name")
	private String jobName;

	private Long priority;

	@Column(name="requests_recovery")
	private Boolean requestsRecovery;

	private String state;

	@Column(name="trigger_group")
	private String triggerGroup;

	@Column(name="trigger_name")
	private String triggerName;

	public QrtzFiredTrigger() {
	}

	public String getEntryId() {
		return this.entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}

	public Long getFiredTime() {
		return this.firedTime;
	}

	public void setFiredTime(Long firedTime) {
		this.firedTime = firedTime;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public Boolean getIsStateful() {
		return this.isStateful;
	}

	public void setIsStateful(Boolean isStateful) {
		this.isStateful = isStateful;
	}

	public Boolean getIsVolatile() {
		return this.isVolatile;
	}

	public void setIsVolatile(Boolean isVolatile) {
		this.isVolatile = isVolatile;
	}

	public String getJobGroup() {
		return this.jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Boolean getRequestsRecovery() {
		return this.requestsRecovery;
	}

	public void setRequestsRecovery(Boolean requestsRecovery) {
		this.requestsRecovery = requestsRecovery;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTriggerGroup() {
		return this.triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

	public String getTriggerName() {
		return this.triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

}
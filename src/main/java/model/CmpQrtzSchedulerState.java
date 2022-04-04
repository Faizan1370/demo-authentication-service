package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_qrtz_scheduler_state database table.
 * 
 */
@Entity
@Table(name="cmp_qrtz_scheduler_state")
@NamedQuery(name="CmpQrtzSchedulerState.findAll", query="SELECT c FROM CmpQrtzSchedulerState c")
public class CmpQrtzSchedulerState implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="checkin_interval")
	private Long checkinInterval;

	@Column(name="instance_name")
	private String instanceName;

	@Column(name="last_checkin_time")
	private Long lastCheckinTime;

	private String recoverer;

	public CmpQrtzSchedulerState() {
	}

	public Long getCheckinInterval() {
		return this.checkinInterval;
	}

	public void setCheckinInterval(Long checkinInterval) {
		this.checkinInterval = checkinInterval;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public Long getLastCheckinTime() {
		return this.lastCheckinTime;
	}

	public void setLastCheckinTime(Long lastCheckinTime) {
		this.lastCheckinTime = lastCheckinTime;
	}

	public String getRecoverer() {
		return this.recoverer;
	}

	public void setRecoverer(String recoverer) {
		this.recoverer = recoverer;
	}

}
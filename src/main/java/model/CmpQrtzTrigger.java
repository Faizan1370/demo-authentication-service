package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_qrtz_triggers database table.
 * 
 */
@Entity
@Table(name="cmp_qrtz_triggers")
@NamedQuery(name="CmpQrtzTrigger.findAll", query="SELECT c FROM CmpQrtzTrigger c")
public class CmpQrtzTrigger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="calendar_name")
	private String calendarName;

	private String description;

	@Column(name="end_time")
	private Long endTime;

	@Column(name="is_volatile")
	private Boolean isVolatile;

	@Column(name="job_data")
	private byte[] jobData;

	@Column(name="job_group")
	private String jobGroup;

	@Column(name="job_name")
	private String jobName;

	@Column(name="misfire_instr")
	private Integer misfireInstr;

	@Column(name="next_fire_time")
	private Long nextFireTime;

	@Column(name="prev_fire_time")
	private Long prevFireTime;

	private Integer priority;

	@Column(name="start_time")
	private Long startTime;

	@Column(name="trigger_group")
	private String triggerGroup;

	@Column(name="trigger_name")
	private String triggerName;

	@Column(name="trigger_state")
	private String triggerState;

	@Column(name="trigger_type")
	private String triggerType;

	public CmpQrtzTrigger() {
	}

	public String getCalendarName() {
		return this.calendarName;
	}

	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Boolean getIsVolatile() {
		return this.isVolatile;
	}

	public void setIsVolatile(Boolean isVolatile) {
		this.isVolatile = isVolatile;
	}

	public byte[] getJobData() {
		return this.jobData;
	}

	public void setJobData(byte[] jobData) {
		this.jobData = jobData;
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

	public Integer getMisfireInstr() {
		return this.misfireInstr;
	}

	public void setMisfireInstr(Integer misfireInstr) {
		this.misfireInstr = misfireInstr;
	}

	public Long getNextFireTime() {
		return this.nextFireTime;
	}

	public void setNextFireTime(Long nextFireTime) {
		this.nextFireTime = nextFireTime;
	}

	public Long getPrevFireTime() {
		return this.prevFireTime;
	}

	public void setPrevFireTime(Long prevFireTime) {
		this.prevFireTime = prevFireTime;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
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

	public String getTriggerState() {
		return this.triggerState;
	}

	public void setTriggerState(String triggerState) {
		this.triggerState = triggerState;
	}

	public String getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_qrtz_cron_triggers database table.
 * 
 */
@Entity
@Table(name="cmp_qrtz_cron_triggers")
@NamedQuery(name="CmpQrtzCronTrigger.findAll", query="SELECT c FROM CmpQrtzCronTrigger c")
public class CmpQrtzCronTrigger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cron_expression")
	private String cronExpression;

	@Column(name="time_zone_id")
	private String timeZoneId;

	@Column(name="trigger_group")
	private String triggerGroup;

	@Column(name="trigger_name")
	private String triggerName;

	public CmpQrtzCronTrigger() {
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getTimeZoneId() {
		return this.timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
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
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qrtz_cron_triggers database table.
 * 
 */
@Entity
@Table(name="qrtz_cron_triggers")
@NamedQuery(name="QrtzCronTrigger.findAll", query="SELECT q FROM QrtzCronTrigger q")
public class QrtzCronTrigger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cron_expression")
	private String cronExpression;

	@Column(name="time_zone_id")
	private String timeZoneId;

	@Column(name="trigger_group")
	private String triggerGroup;

	@Column(name="trigger_name")
	private String triggerName;

	public QrtzCronTrigger() {
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
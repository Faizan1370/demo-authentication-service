package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the qrtz_simple_triggers database table.
 * 
 */
@Entity
@Table(name="qrtz_simple_triggers")
@NamedQuery(name="QrtzSimpleTrigger.findAll", query="SELECT q FROM QrtzSimpleTrigger q")
public class QrtzSimpleTrigger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="repeat_count")
	private BigDecimal repeatCount;

	@Column(name="repeat_interval")
	private BigDecimal repeatInterval;

	@Column(name="times_triggered")
	private BigDecimal timesTriggered;

	@Column(name="trigger_group")
	private String triggerGroup;

	@Column(name="trigger_name")
	private String triggerName;

	public QrtzSimpleTrigger() {
	}

	public BigDecimal getRepeatCount() {
		return this.repeatCount;
	}

	public void setRepeatCount(BigDecimal repeatCount) {
		this.repeatCount = repeatCount;
	}

	public BigDecimal getRepeatInterval() {
		return this.repeatInterval;
	}

	public void setRepeatInterval(BigDecimal repeatInterval) {
		this.repeatInterval = repeatInterval;
	}

	public BigDecimal getTimesTriggered() {
		return this.timesTriggered;
	}

	public void setTimesTriggered(BigDecimal timesTriggered) {
		this.timesTriggered = timesTriggered;
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
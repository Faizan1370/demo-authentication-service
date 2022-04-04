package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qrtz_trigger_listeners database table.
 * 
 */
@Entity
@Table(name="qrtz_trigger_listeners")
@NamedQuery(name="QrtzTriggerListener.findAll", query="SELECT q FROM QrtzTriggerListener q")
public class QrtzTriggerListener implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="trigger_group")
	private String triggerGroup;

	@Column(name="trigger_listener")
	private String triggerListener;

	@Column(name="trigger_name")
	private String triggerName;

	public QrtzTriggerListener() {
	}

	public String getTriggerGroup() {
		return this.triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

	public String getTriggerListener() {
		return this.triggerListener;
	}

	public void setTriggerListener(String triggerListener) {
		this.triggerListener = triggerListener;
	}

	public String getTriggerName() {
		return this.triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

}
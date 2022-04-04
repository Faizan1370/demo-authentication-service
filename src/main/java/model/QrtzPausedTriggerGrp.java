package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qrtz_paused_trigger_grps database table.
 * 
 */
@Entity
@Table(name="qrtz_paused_trigger_grps")
@NamedQuery(name="QrtzPausedTriggerGrp.findAll", query="SELECT q FROM QrtzPausedTriggerGrp q")
public class QrtzPausedTriggerGrp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="trigger_group")
	private String triggerGroup;

	public QrtzPausedTriggerGrp() {
	}

	public String getTriggerGroup() {
		return this.triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

}
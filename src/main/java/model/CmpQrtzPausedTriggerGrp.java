package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_qrtz_paused_trigger_grps database table.
 * 
 */
@Entity
@Table(name="cmp_qrtz_paused_trigger_grps")
@NamedQuery(name="CmpQrtzPausedTriggerGrp.findAll", query="SELECT c FROM CmpQrtzPausedTriggerGrp c")
public class CmpQrtzPausedTriggerGrp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="trigger_group")
	private String triggerGroup;

	public CmpQrtzPausedTriggerGrp() {
	}

	public String getTriggerGroup() {
		return this.triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

}
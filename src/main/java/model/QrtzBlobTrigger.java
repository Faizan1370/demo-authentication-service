package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qrtz_blob_triggers database table.
 * 
 */
@Entity
@Table(name="qrtz_blob_triggers")
@NamedQuery(name="QrtzBlobTrigger.findAll", query="SELECT q FROM QrtzBlobTrigger q")
public class QrtzBlobTrigger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="blob_data")
	private String blobData;

	@Column(name="trigger_group")
	private String triggerGroup;

	@Column(name="trigger_name")
	private String triggerName;

	public QrtzBlobTrigger() {
	}

	public String getBlobData() {
		return this.blobData;
	}

	public void setBlobData(String blobData) {
		this.blobData = blobData;
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
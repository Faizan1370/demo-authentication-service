package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qrtz_job_listeners database table.
 * 
 */
@Entity
@Table(name="qrtz_job_listeners")
@NamedQuery(name="QrtzJobListener.findAll", query="SELECT q FROM QrtzJobListener q")
public class QrtzJobListener implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="job_group")
	private String jobGroup;

	@Column(name="job_listener")
	private String jobListener;

	@Column(name="job_name")
	private String jobName;

	public QrtzJobListener() {
	}

	public String getJobGroup() {
		return this.jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobListener() {
		return this.jobListener;
	}

	public void setJobListener(String jobListener) {
		this.jobListener = jobListener;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

}
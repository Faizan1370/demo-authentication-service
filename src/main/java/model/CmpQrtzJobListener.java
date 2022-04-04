package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_qrtz_job_listeners database table.
 * 
 */
@Entity
@Table(name="cmp_qrtz_job_listeners")
@NamedQuery(name="CmpQrtzJobListener.findAll", query="SELECT c FROM CmpQrtzJobListener c")
public class CmpQrtzJobListener implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="job_group")
	private String jobGroup;

	@Column(name="job_listener")
	private String jobListener;

	@Column(name="job_name")
	private String jobName;

	public CmpQrtzJobListener() {
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
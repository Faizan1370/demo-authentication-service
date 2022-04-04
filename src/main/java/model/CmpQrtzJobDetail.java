package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_qrtz_job_details database table.
 * 
 */
@Entity
@Table(name="cmp_qrtz_job_details")
@NamedQuery(name="CmpQrtzJobDetail.findAll", query="SELECT c FROM CmpQrtzJobDetail c")
public class CmpQrtzJobDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name="is_durable")
	private Boolean isDurable;

	@Column(name="is_stateful")
	private Boolean isStateful;

	@Column(name="is_volatile")
	private Boolean isVolatile;

	@Column(name="job_class_name")
	private String jobClassName;

	@Column(name="job_data")
	private byte[] jobData;

	@Column(name="job_group")
	private String jobGroup;

	@Column(name="job_name")
	private String jobName;

	@Column(name="requests_recovery")
	private Boolean requestsRecovery;

	public CmpQrtzJobDetail() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsDurable() {
		return this.isDurable;
	}

	public void setIsDurable(Boolean isDurable) {
		this.isDurable = isDurable;
	}

	public Boolean getIsStateful() {
		return this.isStateful;
	}

	public void setIsStateful(Boolean isStateful) {
		this.isStateful = isStateful;
	}

	public Boolean getIsVolatile() {
		return this.isVolatile;
	}

	public void setIsVolatile(Boolean isVolatile) {
		this.isVolatile = isVolatile;
	}

	public String getJobClassName() {
		return this.jobClassName;
	}

	public void setJobClassName(String jobClassName) {
		this.jobClassName = jobClassName;
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

	public Boolean getRequestsRecovery() {
		return this.requestsRecovery;
	}

	public void setRequestsRecovery(Boolean requestsRecovery) {
		this.requestsRecovery = requestsRecovery;
	}

}
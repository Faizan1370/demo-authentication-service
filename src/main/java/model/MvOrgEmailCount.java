package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mv_org_email_count database table.
 * 
 */
@Entity
@Table(name="mv_org_email_count")
@NamedQuery(name="MvOrgEmailCount.findAll", query="SELECT m FROM MvOrgEmailCount m")
public class MvOrgEmailCount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="email_addresses")
	private Long emailAddresses;

	@Column(name="email_lists")
	private Long emailLists;

	@Column(name="org_id")
	private BigDecimal orgId;

	public MvOrgEmailCount() {
	}

	public Long getEmailAddresses() {
		return this.emailAddresses;
	}

	public void setEmailAddresses(Long emailAddresses) {
		this.emailAddresses = emailAddresses;
	}

	public Long getEmailLists() {
		return this.emailLists;
	}

	public void setEmailLists(Long emailLists) {
		this.emailLists = emailLists;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

}
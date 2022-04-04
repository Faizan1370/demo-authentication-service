package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the org_email_count_v database table.
 * 
 */
@Entity
@Table(name="org_email_count_v")
@NamedQuery(name="OrgEmailCountV.findAll", query="SELECT o FROM OrgEmailCountV o")
public class OrgEmailCountV implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="email_addresses")
	private Long emailAddresses;

	@Column(name="email_lists")
	private Long emailLists;

	@Column(name="org_id")
	private BigDecimal orgId;

	public OrgEmailCountV() {
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
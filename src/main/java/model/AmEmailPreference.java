package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the am_email_preferences database table.
 * 
 */
@Entity
@Table(name="am_email_preferences")
@NamedQuery(name="AmEmailPreference.findAll", query="SELECT a FROM AmEmailPreference a")
public class AmEmailPreference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="organization_id")
	private BigDecimal organizationId;

	@Column(name="sending_email")
	private BigDecimal sendingEmail;

	public AmEmailPreference() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public BigDecimal getSendingEmail() {
		return this.sendingEmail;
	}

	public void setSendingEmail(BigDecimal sendingEmail) {
		this.sendingEmail = sendingEmail;
	}

}
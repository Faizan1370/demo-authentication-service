package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the gdpr_permissions database table.
 * 
 */
@Entity
@Table(name="gdpr_permissions")
@NamedQuery(name="GdprPermission.findAll", query="SELECT g FROM GdprPermission g")
public class GdprPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private BigDecimal email;

	private BigDecimal mail;

	@Column(name="organization_id")
	private BigDecimal organizationId;

	private BigDecimal phone;

	public GdprPermission() {
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

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public BigDecimal getEmail() {
		return this.email;
	}

	public void setEmail(BigDecimal email) {
		this.email = email;
	}

	public BigDecimal getMail() {
		return this.mail;
	}

	public void setMail(BigDecimal mail) {
		this.mail = mail;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public BigDecimal getPhone() {
		return this.phone;
	}

	public void setPhone(BigDecimal phone) {
		this.phone = phone;
	}

}
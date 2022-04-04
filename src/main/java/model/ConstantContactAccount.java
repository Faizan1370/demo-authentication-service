package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the constant_contact_account database table.
 * 
 */
@Entity
@Table(name="constant_contact_account")
@NamedQuery(name="ConstantContactAccount.findAll", query="SELECT c FROM ConstantContactAccount c")
public class ConstantContactAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="organization_id")
	private BigDecimal organizationId;

	@Column(name="password_encrypted")
	private String passwordEncrypted;

	@Column(name="username_encrypted")
	private String usernameEncrypted;

	public ConstantContactAccount() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public String getPasswordEncrypted() {
		return this.passwordEncrypted;
	}

	public void setPasswordEncrypted(String passwordEncrypted) {
		this.passwordEncrypted = passwordEncrypted;
	}

	public String getUsernameEncrypted() {
		return this.usernameEncrypted;
	}

	public void setUsernameEncrypted(String usernameEncrypted) {
		this.usernameEncrypted = usernameEncrypted;
	}

}
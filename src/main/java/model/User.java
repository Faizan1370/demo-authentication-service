package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="change_password")
	private BigDecimal changePassword;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="date_pwd_modified")
	private Timestamp datePwdModified;

	private BigDecimal disabled;

	private String email;

	@Column(name="encrypted_password")
	private String encryptedPassword;

	@Column(name="failed_logins")
	private BigDecimal failedLogins;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_login")
	private Timestamp lastLogin;

	@Column(name="last_name")
	private String lastName;

	@Column(name="login_count")
	private BigDecimal loginCount;

	@Column(name="organization_id")
	private BigDecimal organizationId;

	@Column(name="receive_emails")
	private BigDecimal receiveEmails;

	private String salt;

	private String username;

	public User() {
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

	public BigDecimal getChangePassword() {
		return this.changePassword;
	}

	public void setChangePassword(BigDecimal changePassword) {
		this.changePassword = changePassword;
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

	public Timestamp getDatePwdModified() {
		return this.datePwdModified;
	}

	public void setDatePwdModified(Timestamp datePwdModified) {
		this.datePwdModified = datePwdModified;
	}

	public BigDecimal getDisabled() {
		return this.disabled;
	}

	public void setDisabled(BigDecimal disabled) {
		this.disabled = disabled;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return this.encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public BigDecimal getFailedLogins() {
		return this.failedLogins;
	}

	public void setFailedLogins(BigDecimal failedLogins) {
		this.failedLogins = failedLogins;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Timestamp getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(BigDecimal loginCount) {
		this.loginCount = loginCount;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public BigDecimal getReceiveEmails() {
		return this.receiveEmails;
	}

	public void setReceiveEmails(BigDecimal receiveEmails) {
		this.receiveEmails = receiveEmails;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
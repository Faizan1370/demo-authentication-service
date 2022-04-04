package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the account_cc_settings database table.
 * 
 */
@Entity
@Table(name="account_cc_settings")
@NamedQuery(name="AccountCcSetting.findAll", query="SELECT a FROM AccountCcSetting a")
public class AccountCcSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="preferred_card_id")
	private BigDecimal preferredCardId;

	public AccountCcSetting() {
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

	public BigDecimal getPreferredCardId() {
		return this.preferredCardId;
	}

	public void setPreferredCardId(BigDecimal preferredCardId) {
		this.preferredCardId = preferredCardId;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the referral_prospect database table.
 * 
 */
@Entity
@Table(name="referral_prospect")
@NamedQuery(name="ReferralProspect.findAll", query="SELECT r FROM ReferralProspect r")
public class ReferralProspect implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="clicked_thru")
	private Timestamp clickedThru;

	@Column(name="from_account_id")
	private BigDecimal fromAccountId;

	@Column(name="from_email")
	private String fromEmail;

	@Column(name="from_member_id")
	private BigDecimal fromMemberId;

	@Column(name="from_name")
	private String fromName;

	@Column(name="to_email")
	private String toEmail;

	@Column(name="to_first_name")
	private String toFirstName;

	@Column(name="to_last_name")
	private String toLastName;

	public ReferralProspect() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getClickedThru() {
		return this.clickedThru;
	}

	public void setClickedThru(Timestamp clickedThru) {
		this.clickedThru = clickedThru;
	}

	public BigDecimal getFromAccountId() {
		return this.fromAccountId;
	}

	public void setFromAccountId(BigDecimal fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

	public String getFromEmail() {
		return this.fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public BigDecimal getFromMemberId() {
		return this.fromMemberId;
	}

	public void setFromMemberId(BigDecimal fromMemberId) {
		this.fromMemberId = fromMemberId;
	}

	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getToEmail() {
		return this.toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getToFirstName() {
		return this.toFirstName;
	}

	public void setToFirstName(String toFirstName) {
		this.toFirstName = toFirstName;
	}

	public String getToLastName() {
		return this.toLastName;
	}

	public void setToLastName(String toLastName) {
		this.toLastName = toLastName;
	}

}
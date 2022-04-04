package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the member database table.
 * 
 */
@Entity
@NamedQuery(name="Member.findAll", query="SELECT m FROM Member m")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="auction_address_id")
	private BigDecimal auctionAddressId;

	@Column(name="change_password")
	private BigDecimal changePassword;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private BigDecimal disabled;

	@Column(name="first_org_id")
	private BigDecimal firstOrgId;

	@Column(name="mob_date")
	private Timestamp mobDate;

	private BigDecimal newsletter;

	@Column(name="registration_type")
	private String registrationType;

	private BigDecimal source;

	@Column(name="volunteer_registration")
	private BigDecimal volunteerRegistration;

	public Member() {
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

	public BigDecimal getAuctionAddressId() {
		return this.auctionAddressId;
	}

	public void setAuctionAddressId(BigDecimal auctionAddressId) {
		this.auctionAddressId = auctionAddressId;
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

	public BigDecimal getDisabled() {
		return this.disabled;
	}

	public void setDisabled(BigDecimal disabled) {
		this.disabled = disabled;
	}

	public BigDecimal getFirstOrgId() {
		return this.firstOrgId;
	}

	public void setFirstOrgId(BigDecimal firstOrgId) {
		this.firstOrgId = firstOrgId;
	}

	public Timestamp getMobDate() {
		return this.mobDate;
	}

	public void setMobDate(Timestamp mobDate) {
		this.mobDate = mobDate;
	}

	public BigDecimal getNewsletter() {
		return this.newsletter;
	}

	public void setNewsletter(BigDecimal newsletter) {
		this.newsletter = newsletter;
	}

	public String getRegistrationType() {
		return this.registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public BigDecimal getSource() {
		return this.source;
	}

	public void setSource(BigDecimal source) {
		this.source = source;
	}

	public BigDecimal getVolunteerRegistration() {
		return this.volunteerRegistration;
	}

	public void setVolunteerRegistration(BigDecimal volunteerRegistration) {
		this.volunteerRegistration = volunteerRegistration;
	}

}
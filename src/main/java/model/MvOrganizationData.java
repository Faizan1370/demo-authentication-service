package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the mv_organization_data database table.
 * 
 */
@Entity
@Table(name="mv_organization_data")
@NamedQuery(name="MvOrganizationData.findAll", query="SELECT m FROM MvOrganizationData m")
public class MvOrganizationData implements Serializable {
	private static final long serialVersionUID = 1L;

	private String address1;

	private String address2;

	private Long admins;

	@Column(name="cause_group")
	private String causeGroup;

	private String city;

	private String email;

	@Column(name="email_addresses")
	private Long emailAddresses;

	@Column(name="email_lists")
	private Long emailLists;

	@Column(name="first_name")
	private String firstName;

	@Column(name="group_id")
	private Integer groupId;

	@Column(name="is_trial")
	private Integer isTrial;

	private BigDecimal isdemo;

	private BigDecimal isdisabled;

	@Temporal(TemporalType.DATE)
	@Column(name="last_login")
	private Date lastLogin;

	@Column(name="last_name")
	private String lastName;

	private BigDecimal logins;

	@Column(name="num_events")
	private Long numEvents;

	@Column(name="oem_partner")
	private String oemPartner;

	@Column(name="org_alias")
	private String orgAlias;

	@Column(name="org_id")
	private BigDecimal orgId;

	@Column(name="org_name")
	private String orgName;

	@Column(name="org_type")
	private String orgType;

	private String partner;

	private String phone;

	@Column(name="sign_date")
	private Timestamp signDate;

	private String state;

	private String zip;

	public MvOrganizationData() {
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Long getAdmins() {
		return this.admins;
	}

	public void setAdmins(Long admins) {
		this.admins = admins;
	}

	public String getCauseGroup() {
		return this.causeGroup;
	}

	public void setCauseGroup(String causeGroup) {
		this.causeGroup = causeGroup;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getIsTrial() {
		return this.isTrial;
	}

	public void setIsTrial(Integer isTrial) {
		this.isTrial = isTrial;
	}

	public BigDecimal getIsdemo() {
		return this.isdemo;
	}

	public void setIsdemo(BigDecimal isdemo) {
		this.isdemo = isdemo;
	}

	public BigDecimal getIsdisabled() {
		return this.isdisabled;
	}

	public void setIsdisabled(BigDecimal isdisabled) {
		this.isdisabled = isdisabled;
	}

	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getLogins() {
		return this.logins;
	}

	public void setLogins(BigDecimal logins) {
		this.logins = logins;
	}

	public Long getNumEvents() {
		return this.numEvents;
	}

	public void setNumEvents(Long numEvents) {
		this.numEvents = numEvents;
	}

	public String getOemPartner() {
		return this.oemPartner;
	}

	public void setOemPartner(String oemPartner) {
		this.oemPartner = oemPartner;
	}

	public String getOrgAlias() {
		return this.orgAlias;
	}

	public void setOrgAlias(String orgAlias) {
		this.orgAlias = orgAlias;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getPartner() {
		return this.partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Timestamp getSignDate() {
		return this.signDate;
	}

	public void setSignDate(Timestamp signDate) {
		this.signDate = signDate;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the organization database table.
 * 
 */
@Entity
@NamedQuery(name="Organization.findAll", query="SELECT o FROM Organization o")
public class Organization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="billing_address_id")
	private BigDecimal billingAddressId;

	@Column(name="billing_contact_id")
	private BigDecimal billingContactId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="date_modified_by_jitterbit")
	private Timestamp dateModifiedByJitterbit;

	@Column(name="description_id")
	private BigDecimal descriptionId;

	@Column(name="main_address_id")
	private BigDecimal mainAddressId;

	@Column(name="main_contact_id")
	private BigDecimal mainContactId;

	private String name;

	private String url;

	public Organization() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getBillingAddressId() {
		return this.billingAddressId;
	}

	public void setBillingAddressId(BigDecimal billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public BigDecimal getBillingContactId() {
		return this.billingContactId;
	}

	public void setBillingContactId(BigDecimal billingContactId) {
		this.billingContactId = billingContactId;
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

	public Timestamp getDateModifiedByJitterbit() {
		return this.dateModifiedByJitterbit;
	}

	public void setDateModifiedByJitterbit(Timestamp dateModifiedByJitterbit) {
		this.dateModifiedByJitterbit = dateModifiedByJitterbit;
	}

	public BigDecimal getDescriptionId() {
		return this.descriptionId;
	}

	public void setDescriptionId(BigDecimal descriptionId) {
		this.descriptionId = descriptionId;
	}

	public BigDecimal getMainAddressId() {
		return this.mainAddressId;
	}

	public void setMainAddressId(BigDecimal mainAddressId) {
		this.mainAddressId = mainAddressId;
	}

	public BigDecimal getMainContactId() {
		return this.mainContactId;
	}

	public void setMainContactId(BigDecimal mainContactId) {
		this.mainContactId = mainContactId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
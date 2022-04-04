package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the email_list_entry database table.
 * 
 */
@Entity
@Table(name="email_list_entry")
@NamedQuery(name="EmailListEntry.findAll", query="SELECT e FROM EmailListEntry e")
public class EmailListEntry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	private String email;

	@Column(name="organization_id")
	private BigDecimal organizationId;

	public EmailListEntry() {
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

}
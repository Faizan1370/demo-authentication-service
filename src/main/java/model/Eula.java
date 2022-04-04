package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the eula database table.
 * 
 */
@Entity
@NamedQuery(name="Eula.findAll", query="SELECT e FROM Eula e")
public class Eula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="created_by")
	private BigDecimal createdBy;

	@Column(name="date_created")
	private Timestamp dateCreated;

	private String message;

	private String name;

	@Column(name="old_created_by")
	private BigDecimal oldCreatedBy;

	@Column(name="partner_id")
	private BigDecimal partnerId;

	private String text;

	private String version;

	public Eula() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getOldCreatedBy() {
		return this.oldCreatedBy;
	}

	public void setOldCreatedBy(BigDecimal oldCreatedBy) {
		this.oldCreatedBy = oldCreatedBy;
	}

	public BigDecimal getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(BigDecimal partnerId) {
		this.partnerId = partnerId;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the redirect_log_entry database table.
 * 
 */
@Entity
@Table(name="redirect_log_entry")
@NamedQuery(name="RedirectLogEntry.findAll", query="SELECT r FROM RedirectLogEntry r")
public class RedirectLogEntry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="destination_url")
	private String destinationUrl;

	@Column(name="ip_address")
	private String ipAddress;

	@Column(name="source_id")
	private BigDecimal sourceId;

	public RedirectLogEntry() {
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

	public String getDestinationUrl() {
		return this.destinationUrl;
	}

	public void setDestinationUrl(String destinationUrl) {
		this.destinationUrl = destinationUrl;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public BigDecimal getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(BigDecimal sourceId) {
		this.sourceId = sourceId;
	}

}
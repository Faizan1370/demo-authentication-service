package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the pgf_transaction_response database table.
 * 
 */
@Entity
@Table(name="pgf_transaction_response")
@NamedQuery(name="PgfTransactionResponse.findAll", query="SELECT p FROM PgfTransactionResponse p")
public class PgfTransactionResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private String guid;

	@Column(name="process_status")
	private BigDecimal processStatus;

	@Column(name="response_code")
	private BigDecimal responseCode;

	private String result;

	public PgfTransactionResponse() {
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

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public BigDecimal getProcessStatus() {
		return this.processStatus;
	}

	public void setProcessStatus(BigDecimal processStatus) {
		this.processStatus = processStatus;
	}

	public BigDecimal getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(BigDecimal responseCode) {
		this.responseCode = responseCode;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
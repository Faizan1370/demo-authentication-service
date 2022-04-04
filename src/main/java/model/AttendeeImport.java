package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the attendee_imports database table.
 * 
 */
@Entity
@Table(name="attendee_imports")
@NamedQuery(name="AttendeeImport.findAll", query="SELECT a FROM AttendeeImport a")
public class AttendeeImport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="contains_header")
	private BigDecimal containsHeader;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="error_count")
	private BigDecimal errorCount;

	@Column(name="existing_count")
	private BigDecimal existingCount;

	private String message;

	@Column(name="new_count")
	private BigDecimal newCount;

	@Column(name="path_to_csv")
	private String pathToCsv;

	private String state;

	public AttendeeImport() {
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

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getContainsHeader() {
		return this.containsHeader;
	}

	public void setContainsHeader(BigDecimal containsHeader) {
		this.containsHeader = containsHeader;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getErrorCount() {
		return this.errorCount;
	}

	public void setErrorCount(BigDecimal errorCount) {
		this.errorCount = errorCount;
	}

	public BigDecimal getExistingCount() {
		return this.existingCount;
	}

	public void setExistingCount(BigDecimal existingCount) {
		this.existingCount = existingCount;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BigDecimal getNewCount() {
		return this.newCount;
	}

	public void setNewCount(BigDecimal newCount) {
		this.newCount = newCount;
	}

	public String getPathToCsv() {
		return this.pathToCsv;
	}

	public void setPathToCsv(String pathToCsv) {
		this.pathToCsv = pathToCsv;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
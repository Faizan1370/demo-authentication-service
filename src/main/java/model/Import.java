package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the imports database table.
 * 
 */
@Entity
@Table(name="imports")
@NamedQuery(name="Import.findAll", query="SELECT i FROM Import i")
public class Import implements Serializable {
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

	@Column(name="donor_created_count")
	private BigDecimal donorCreatedCount;

	@Column(name="donor_image_count")
	private BigDecimal donorImageCount;

	@Column(name="error_count")
	private BigDecimal errorCount;

	@Column(name="item_image_count")
	private BigDecimal itemImageCount;

	private String message;

	@Column(name="path_to_csv")
	private String pathToCsv;

	@Column(name="path_to_zip")
	private String pathToZip;

	private String state;

	@Column(name="user_id")
	private BigDecimal userId;

	public Import() {
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

	public BigDecimal getDonorCreatedCount() {
		return this.donorCreatedCount;
	}

	public void setDonorCreatedCount(BigDecimal donorCreatedCount) {
		this.donorCreatedCount = donorCreatedCount;
	}

	public BigDecimal getDonorImageCount() {
		return this.donorImageCount;
	}

	public void setDonorImageCount(BigDecimal donorImageCount) {
		this.donorImageCount = donorImageCount;
	}

	public BigDecimal getErrorCount() {
		return this.errorCount;
	}

	public void setErrorCount(BigDecimal errorCount) {
		this.errorCount = errorCount;
	}

	public BigDecimal getItemImageCount() {
		return this.itemImageCount;
	}

	public void setItemImageCount(BigDecimal itemImageCount) {
		this.itemImageCount = itemImageCount;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPathToCsv() {
		return this.pathToCsv;
	}

	public void setPathToCsv(String pathToCsv) {
		this.pathToCsv = pathToCsv;
	}

	public String getPathToZip() {
		return this.pathToZip;
	}

	public void setPathToZip(String pathToZip) {
		this.pathToZip = pathToZip;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

}
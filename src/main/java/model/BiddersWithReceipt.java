package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bidders_with_receipts database table.
 * 
 */
@Entity
@Table(name="bidders_with_receipts")
@NamedQuery(name="BiddersWithReceipt.findAll", query="SELECT b FROM BiddersWithReceipt b")
public class BiddersWithReceipt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="bidder_number")
	private String bidderNumber;

	@Column(name="date_receipt_sent")
	private Timestamp dateReceiptSent;

	private String email;

	@Column(name="first_name")
	private String firstName;

	private BigDecimal id;

	@Column(name="last_name")
	private String lastName;

	@Column(name="sortable_bidder_number")
	private String sortableBidderNumber;

	@Column(name="status_receipt_sent")
	private Boolean statusReceiptSent;

	private String type;

	private String username;

	public BiddersWithReceipt() {
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public String getBidderNumber() {
		return this.bidderNumber;
	}

	public void setBidderNumber(String bidderNumber) {
		this.bidderNumber = bidderNumber;
	}

	public Timestamp getDateReceiptSent() {
		return this.dateReceiptSent;
	}

	public void setDateReceiptSent(Timestamp dateReceiptSent) {
		this.dateReceiptSent = dateReceiptSent;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSortableBidderNumber() {
		return this.sortableBidderNumber;
	}

	public void setSortableBidderNumber(String sortableBidderNumber) {
		this.sortableBidderNumber = sortableBidderNumber;
	}

	public Boolean getStatusReceiptSent() {
		return this.statusReceiptSent;
	}

	public void setStatusReceiptSent(Boolean statusReceiptSent) {
		this.statusReceiptSent = statusReceiptSent;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
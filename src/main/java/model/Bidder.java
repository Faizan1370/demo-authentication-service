package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bidder database table.
 * 
 */
@Entity
@NamedQuery(name="Bidder.findAll", query="SELECT b FROM Bidder b")
public class Bidder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="bidder_number")
	private String bidderNumber;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="date_receipt_sent")
	private Timestamp dateReceiptSent;

	private String email;

	@Column(name="external_id")
	private String externalId;

	@Column(name="first_name")
	private String firstName;

	@Column(name="giftworks_registration_id")
	private String giftworksRegistrationId;

	private String guid;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_initial")
	private String middleInitial;

	@Column(name="sortable_bidder_number")
	private String sortableBidderNumber;

	@Column(name="status_receipt_sent")
	private Boolean statusReceiptSent;

	private String username;

	public Bidder() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGiftworksRegistrationId() {
		return this.giftworksRegistrationId;
	}

	public void setGiftworksRegistrationId(String giftworksRegistrationId) {
		this.giftworksRegistrationId = giftworksRegistrationId;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleInitial() {
		return this.middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
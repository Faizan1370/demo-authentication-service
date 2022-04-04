package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the auction_activity database table.
 * 
 */
@Entity
@Table(name="auction_activity")
@NamedQuery(name="AuctionActivity.findAll", query="SELECT a FROM AuctionActivity a")
public class AuctionActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_participant")
	private Timestamp auctionParticipant;

	@Column(name="cm_member_id")
	private String cmMemberId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private String email;

	@Column(name="email_prospect")
	private Timestamp emailProspect;

	@Column(name="first_name")
	private String firstName;

	@Column(name="interested_person")
	private Timestamp interestedPerson;

	@Column(name="last_name")
	private String lastName;

	@Column(name="member_id")
	private BigDecimal memberId;

	@Column(name="signed_guestbook")
	private Timestamp signedGuestbook;

	public AuctionActivity() {
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

	public Timestamp getAuctionParticipant() {
		return this.auctionParticipant;
	}

	public void setAuctionParticipant(Timestamp auctionParticipant) {
		this.auctionParticipant = auctionParticipant;
	}

	public String getCmMemberId() {
		return this.cmMemberId;
	}

	public void setCmMemberId(String cmMemberId) {
		this.cmMemberId = cmMemberId;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getEmailProspect() {
		return this.emailProspect;
	}

	public void setEmailProspect(Timestamp emailProspect) {
		this.emailProspect = emailProspect;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Timestamp getInterestedPerson() {
		return this.interestedPerson;
	}

	public void setInterestedPerson(Timestamp interestedPerson) {
		this.interestedPerson = interestedPerson;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getMemberId() {
		return this.memberId;
	}

	public void setMemberId(BigDecimal memberId) {
		this.memberId = memberId;
	}

	public Timestamp getSignedGuestbook() {
		return this.signedGuestbook;
	}

	public void setSignedGuestbook(Timestamp signedGuestbook) {
		this.signedGuestbook = signedGuestbook;
	}

}
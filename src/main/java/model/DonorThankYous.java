package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the donor_thank_yous database table.
 * 
 */
@Entity
@Table(name="donor_thank_yous")
@NamedQuery(name="DonorThankYous.findAll", query="SELECT d FROM DonorThankYous d")
public class DonorThankYous implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="address_1")
	private String address1;

	@Column(name="address_2")
	private String address2;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	private String city;

	@Column(name="contact_first_name")
	private String contactFirstName;

	@Column(name="contact_last_name")
	private String contactLastName;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="date_sent")
	private Timestamp dateSent;

	@Column(name="donor_email")
	private String donorEmail;

	@Column(name="donor_id")
	private BigDecimal donorId;

	@Column(name="donor_name")
	private String donorName;

	@Column(name="message_1")
	private String message1;

	@Column(name="message_2")
	private String message2;

	@Column(name="postal_code")
	private String postalCode;

	private String state;

	private BigDecimal thanked;

	public DonorThankYous() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactFirstName() {
		return this.contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactLastName() {
		return this.contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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

	public Timestamp getDateSent() {
		return this.dateSent;
	}

	public void setDateSent(Timestamp dateSent) {
		this.dateSent = dateSent;
	}

	public String getDonorEmail() {
		return this.donorEmail;
	}

	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}

	public BigDecimal getDonorId() {
		return this.donorId;
	}

	public void setDonorId(BigDecimal donorId) {
		this.donorId = donorId;
	}

	public String getDonorName() {
		return this.donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getMessage1() {
		return this.message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return this.message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getThanked() {
		return this.thanked;
	}

	public void setThanked(BigDecimal thanked) {
		this.thanked = thanked;
	}

}
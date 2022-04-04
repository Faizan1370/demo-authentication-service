package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the item_donation database table.
 * 
 */
@Entity
@Table(name="item_donation")
@NamedQuery(name="ItemDonation.findAll", query="SELECT i FROM ItemDonation i")
public class ItemDonation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="delivery_method")
	private String deliveryMethod;

	@Column(name="description_id")
	private BigDecimal descriptionId;

	@Column(name="donor_address_line1")
	private String donorAddressLine1;

	@Column(name="donor_address_line2")
	private String donorAddressLine2;

	@Column(name="donor_city")
	private String donorCity;

	@Column(name="donor_country_code")
	private String donorCountryCode;

	@Column(name="donor_email")
	private String donorEmail;

	@Column(name="donor_first_name")
	private String donorFirstName;

	@Column(name="donor_last_name")
	private String donorLastName;

	@Column(name="donor_link")
	private String donorLink;

	@Column(name="donor_logo_id")
	private BigDecimal donorLogoId;

	@Column(name="donor_name")
	private String donorName;

	@Column(name="donor_phone")
	private String donorPhone;

	@Column(name="donor_state")
	private String donorState;

	@Column(name="donor_zip_code")
	private String donorZipCode;

	@Column(name="is_company")
	private BigDecimal isCompany;

	@Column(name="is_submitter_donor")
	private BigDecimal isSubmitterDonor;

	@Column(name="item_category")
	private BigDecimal itemCategory;

	@Column(name="item_name")
	private String itemName;

	@Column(name="item_quantity")
	private BigDecimal itemQuantity;

	@Column(name="item_value")
	private BigDecimal itemValue;

	@Column(name="member_id")
	private BigDecimal memberId;

	private String source;

	private String status;

	public ItemDonation() {
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

	public String getDeliveryMethod() {
		return this.deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public BigDecimal getDescriptionId() {
		return this.descriptionId;
	}

	public void setDescriptionId(BigDecimal descriptionId) {
		this.descriptionId = descriptionId;
	}

	public String getDonorAddressLine1() {
		return this.donorAddressLine1;
	}

	public void setDonorAddressLine1(String donorAddressLine1) {
		this.donorAddressLine1 = donorAddressLine1;
	}

	public String getDonorAddressLine2() {
		return this.donorAddressLine2;
	}

	public void setDonorAddressLine2(String donorAddressLine2) {
		this.donorAddressLine2 = donorAddressLine2;
	}

	public String getDonorCity() {
		return this.donorCity;
	}

	public void setDonorCity(String donorCity) {
		this.donorCity = donorCity;
	}

	public String getDonorCountryCode() {
		return this.donorCountryCode;
	}

	public void setDonorCountryCode(String donorCountryCode) {
		this.donorCountryCode = donorCountryCode;
	}

	public String getDonorEmail() {
		return this.donorEmail;
	}

	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}

	public String getDonorFirstName() {
		return this.donorFirstName;
	}

	public void setDonorFirstName(String donorFirstName) {
		this.donorFirstName = donorFirstName;
	}

	public String getDonorLastName() {
		return this.donorLastName;
	}

	public void setDonorLastName(String donorLastName) {
		this.donorLastName = donorLastName;
	}

	public String getDonorLink() {
		return this.donorLink;
	}

	public void setDonorLink(String donorLink) {
		this.donorLink = donorLink;
	}

	public BigDecimal getDonorLogoId() {
		return this.donorLogoId;
	}

	public void setDonorLogoId(BigDecimal donorLogoId) {
		this.donorLogoId = donorLogoId;
	}

	public String getDonorName() {
		return this.donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getDonorPhone() {
		return this.donorPhone;
	}

	public void setDonorPhone(String donorPhone) {
		this.donorPhone = donorPhone;
	}

	public String getDonorState() {
		return this.donorState;
	}

	public void setDonorState(String donorState) {
		this.donorState = donorState;
	}

	public String getDonorZipCode() {
		return this.donorZipCode;
	}

	public void setDonorZipCode(String donorZipCode) {
		this.donorZipCode = donorZipCode;
	}

	public BigDecimal getIsCompany() {
		return this.isCompany;
	}

	public void setIsCompany(BigDecimal isCompany) {
		this.isCompany = isCompany;
	}

	public BigDecimal getIsSubmitterDonor() {
		return this.isSubmitterDonor;
	}

	public void setIsSubmitterDonor(BigDecimal isSubmitterDonor) {
		this.isSubmitterDonor = isSubmitterDonor;
	}

	public BigDecimal getItemCategory() {
		return this.itemCategory;
	}

	public void setItemCategory(BigDecimal itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getItemQuantity() {
		return this.itemQuantity;
	}

	public void setItemQuantity(BigDecimal itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public BigDecimal getItemValue() {
		return this.itemValue;
	}

	public void setItemValue(BigDecimal itemValue) {
		this.itemValue = itemValue;
	}

	public BigDecimal getMemberId() {
		return this.memberId;
	}

	public void setMemberId(BigDecimal memberId) {
		this.memberId = memberId;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
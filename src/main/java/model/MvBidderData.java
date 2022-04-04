package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the mv_bidder_data database table.
 * 
 */
@Entity
@Table(name="mv_bidder_data")
@NamedQuery(name="MvBidderData.findAll", query="SELECT m FROM MvBidderData m")
public class MvBidderData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	private String city;

	private String country;

	private String email;

	@Column(name="first_auction_id")
	private BigDecimal firstAuctionId;

	@Column(name="first_bid")
	private Timestamp firstBid;

	@Column(name="first_name")
	private String firstName;

	@Column(name="first_org_id")
	private BigDecimal firstOrgId;

	@Column(name="last_name")
	private String lastName;

	@Temporal(TemporalType.DATE)
	@Column(name="member_create_date")
	private Date memberCreateDate;

	@Column(name="member_id")
	private BigDecimal memberId;

	@Column(name="opt_newsletter")
	private BigDecimal optNewsletter;

	private String state;

	private String username;

	private String zipcode;

	public MvBidderData() {
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getFirstAuctionId() {
		return this.firstAuctionId;
	}

	public void setFirstAuctionId(BigDecimal firstAuctionId) {
		this.firstAuctionId = firstAuctionId;
	}

	public Timestamp getFirstBid() {
		return this.firstBid;
	}

	public void setFirstBid(Timestamp firstBid) {
		this.firstBid = firstBid;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public BigDecimal getFirstOrgId() {
		return this.firstOrgId;
	}

	public void setFirstOrgId(BigDecimal firstOrgId) {
		this.firstOrgId = firstOrgId;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getMemberCreateDate() {
		return this.memberCreateDate;
	}

	public void setMemberCreateDate(Date memberCreateDate) {
		this.memberCreateDate = memberCreateDate;
	}

	public BigDecimal getMemberId() {
		return this.memberId;
	}

	public void setMemberId(BigDecimal memberId) {
		this.memberId = memberId;
	}

	public BigDecimal getOptNewsletter() {
		return this.optNewsletter;
	}

	public void setOptNewsletter(BigDecimal optNewsletter) {
		this.optNewsletter = optNewsletter;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the auction_item_info database table.
 * 
 */
@Entity
@Table(name="auction_item_info")
@NamedQuery(name="AuctionItemInfo.findAll", query="SELECT a FROM AuctionItemInfo a")
public class AuctionItemInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="account_id")
	private BigDecimal accountId;

	private double amount;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="buy_now_price")
	private BigDecimal buyNowPrice;

	private String city;

	@Column(name="date_published")
	private Timestamp datePublished;

	@Column(name="first_name")
	private String firstName;

	private BigDecimal id;

	@Column(name="last_name")
	private String lastName;

	@Column(name="leading_bid")
	private BigDecimal leadingBid;

	private String lot;

	private String name;

	@Column(name="opening_bid")
	private BigDecimal openingBid;

	private BigDecimal value;

	public AuctionItemInfo() {
	}

	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public BigDecimal getBuyNowPrice() {
		return this.buyNowPrice;
	}

	public void setBuyNowPrice(BigDecimal buyNowPrice) {
		this.buyNowPrice = buyNowPrice;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Timestamp getDatePublished() {
		return this.datePublished;
	}

	public void setDatePublished(Timestamp datePublished) {
		this.datePublished = datePublished;
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

	public BigDecimal getLeadingBid() {
		return this.leadingBid;
	}

	public void setLeadingBid(BigDecimal leadingBid) {
		this.leadingBid = leadingBid;
	}

	public String getLot() {
		return this.lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getOpeningBid() {
		return this.openingBid;
	}

	public void setOpeningBid(BigDecimal openingBid) {
		this.openingBid = openingBid;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
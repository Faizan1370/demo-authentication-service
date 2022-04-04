package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the watch database table.
 * 
 */
@Entity
@NamedQuery(name="Watch.findAll", query="SELECT w FROM Watch w")
public class Watch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_item_id")
	private BigDecimal auctionItemId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="from_b4g")
	private BigDecimal fromB4g;

	@Column(name="member_id")
	private BigDecimal memberId;

	@Column(name="send_email")
	private BigDecimal sendEmail;

	public Watch() {
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

	public BigDecimal getAuctionItemId() {
		return this.auctionItemId;
	}

	public void setAuctionItemId(BigDecimal auctionItemId) {
		this.auctionItemId = auctionItemId;
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

	public BigDecimal getFromB4g() {
		return this.fromB4g;
	}

	public void setFromB4g(BigDecimal fromB4g) {
		this.fromB4g = fromB4g;
	}

	public BigDecimal getMemberId() {
		return this.memberId;
	}

	public void setMemberId(BigDecimal memberId) {
		this.memberId = memberId;
	}

	public BigDecimal getSendEmail() {
		return this.sendEmail;
	}

	public void setSendEmail(BigDecimal sendEmail) {
		this.sendEmail = sendEmail;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the auction_access_code database table.
 * 
 */
@Entity
@Table(name="auction_access_code")
@NamedQuery(name="AuctionAccessCode.findAll", query="SELECT a FROM AuctionAccessCode a")
public class AuctionAccessCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AuctionAccessCodePK id;

	private String code;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="is_disabled")
	private BigDecimal isDisabled;

	private String name;

	@Column(name="valid_from")
	private Timestamp validFrom;

	@Column(name="valid_to")
	private Timestamp validTo;

	//bi-directional many-to-one association to Auction
	@ManyToOne
	private Auction auction;

	public AuctionAccessCode() {
	}

	public AuctionAccessCodePK getId() {
		return this.id;
	}

	public void setId(AuctionAccessCodePK id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public BigDecimal getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(BigDecimal isDisabled) {
		this.isDisabled = isDisabled;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(Timestamp validFrom) {
		this.validFrom = validFrom;
	}

	public Timestamp getValidTo() {
		return this.validTo;
	}

	public void setValidTo(Timestamp validTo) {
		this.validTo = validTo;
	}

	public Auction getAuction() {
		return this.auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

}
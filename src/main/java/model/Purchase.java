package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the purchase database table.
 * 
 */
@Entity
@NamedQuery(name="Purchase.findAll", query="SELECT p FROM Purchase p")
public class Purchase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="bidder_first")
	private String bidderFirst;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="bidder_last")
	private String bidderLast;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="date_processed")
	private Timestamp dateProcessed;

	private String description;

	private BigDecimal fee;

	private String guid;

	@Column(name="processing_phase")
	private String processingPhase;

	private BigDecimal shipping;

	private String status;

	public Purchase() {
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

	public String getBidderFirst() {
		return this.bidderFirst;
	}

	public void setBidderFirst(String bidderFirst) {
		this.bidderFirst = bidderFirst;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public String getBidderLast() {
		return this.bidderLast;
	}

	public void setBidderLast(String bidderLast) {
		this.bidderLast = bidderLast;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public Timestamp getDateProcessed() {
		return this.dateProcessed;
	}

	public void setDateProcessed(Timestamp dateProcessed) {
		this.dateProcessed = dateProcessed;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getFee() {
		return this.fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getProcessingPhase() {
		return this.processingPhase;
	}

	public void setProcessingPhase(String processingPhase) {
		this.processingPhase = processingPhase;
	}

	public BigDecimal getShipping() {
		return this.shipping;
	}

	public void setShipping(BigDecimal shipping) {
		this.shipping = shipping;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
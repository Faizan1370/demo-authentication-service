package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the event_ticket database table.
 * 
 */
@Entity
@Table(name="event_ticket")
@NamedQuery(name="EventTicket.findAll", query="SELECT e FROM EventTicket e")
public class EventTicket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="amount_tax_deductible")
	private BigDecimal amountTaxDeductible;

	@Column(name="attendees_per_ticket")
	private BigDecimal attendeesPerTicket;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="collect_info")
	private BigDecimal collectInfo;

	private BigDecimal cost;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="description_id")
	private BigDecimal descriptionId;

	@Column(name="display_order")
	private BigDecimal displayOrder;

	@Column(name="max_per_order")
	private BigDecimal maxPerOrder;

	@Column(name="min_per_order")
	private BigDecimal minPerOrder;

	private String name;

	@Column(name="scheduled_end")
	private Timestamp scheduledEnd;

	@Column(name="scheduled_start")
	private Timestamp scheduledStart;

	private String status;

	@Column(name="total_quantity")
	private BigDecimal totalQuantity;

	public EventTicket() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAmountTaxDeductible() {
		return this.amountTaxDeductible;
	}

	public void setAmountTaxDeductible(BigDecimal amountTaxDeductible) {
		this.amountTaxDeductible = amountTaxDeductible;
	}

	public BigDecimal getAttendeesPerTicket() {
		return this.attendeesPerTicket;
	}

	public void setAttendeesPerTicket(BigDecimal attendeesPerTicket) {
		this.attendeesPerTicket = attendeesPerTicket;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getCollectInfo() {
		return this.collectInfo;
	}

	public void setCollectInfo(BigDecimal collectInfo) {
		this.collectInfo = collectInfo;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
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

	public BigDecimal getDescriptionId() {
		return this.descriptionId;
	}

	public void setDescriptionId(BigDecimal descriptionId) {
		this.descriptionId = descriptionId;
	}

	public BigDecimal getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(BigDecimal displayOrder) {
		this.displayOrder = displayOrder;
	}

	public BigDecimal getMaxPerOrder() {
		return this.maxPerOrder;
	}

	public void setMaxPerOrder(BigDecimal maxPerOrder) {
		this.maxPerOrder = maxPerOrder;
	}

	public BigDecimal getMinPerOrder() {
		return this.minPerOrder;
	}

	public void setMinPerOrder(BigDecimal minPerOrder) {
		this.minPerOrder = minPerOrder;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getScheduledEnd() {
		return this.scheduledEnd;
	}

	public void setScheduledEnd(Timestamp scheduledEnd) {
		this.scheduledEnd = scheduledEnd;
	}

	public Timestamp getScheduledStart() {
		return this.scheduledStart;
	}

	public void setScheduledStart(Timestamp scheduledStart) {
		this.scheduledStart = scheduledStart;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTotalQuantity() {
		return this.totalQuantity;
	}

	public void setTotalQuantity(BigDecimal totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
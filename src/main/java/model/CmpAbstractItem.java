package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the cmp_abstract_item database table.
 * 
 */
@Entity
@Table(name="cmp_abstract_item")
@NamedQuery(name="CmpAbstractItem.findAll", query="SELECT c FROM CmpAbstractItem c")
public class CmpAbstractItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="available_from")
	private Timestamp availableFrom;

	@Column(name="available_to")
	private Timestamp availableTo;

	@Column(name="category_id")
	private BigDecimal categoryId;

	@Column(name="client_accessible")
	private BigDecimal clientAccessible;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_last_modified")
	private Timestamp dateLastModified;

	private String description;

	private String name;

	@Column(name="partner_id")
	private BigDecimal partnerId;

	@Column(name="product_note")
	private String productNote;

	@Column(name="short_name")
	private String shortName;

	private String sku;

	@Column(name="special_note")
	private String specialNote;

	@Column(name="status_id")
	private BigDecimal statusId;

	public CmpAbstractItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getAvailableFrom() {
		return this.availableFrom;
	}

	public void setAvailableFrom(Timestamp availableFrom) {
		this.availableFrom = availableFrom;
	}

	public Timestamp getAvailableTo() {
		return this.availableTo;
	}

	public void setAvailableTo(Timestamp availableTo) {
		this.availableTo = availableTo;
	}

	public BigDecimal getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(BigDecimal categoryId) {
		this.categoryId = categoryId;
	}

	public BigDecimal getClientAccessible() {
		return this.clientAccessible;
	}

	public void setClientAccessible(BigDecimal clientAccessible) {
		this.clientAccessible = clientAccessible;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateLastModified() {
		return this.dateLastModified;
	}

	public void setDateLastModified(Timestamp dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(BigDecimal partnerId) {
		this.partnerId = partnerId;
	}

	public String getProductNote() {
		return this.productNote;
	}

	public void setProductNote(String productNote) {
		this.productNote = productNote;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getSpecialNote() {
		return this.specialNote;
	}

	public void setSpecialNote(String specialNote) {
		this.specialNote = specialNote;
	}

	public BigDecimal getStatusId() {
		return this.statusId;
	}

	public void setStatusId(BigDecimal statusId) {
		this.statusId = statusId;
	}

}
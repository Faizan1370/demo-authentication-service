package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the item_donors database table.
 * 
 */
@Entity
@Table(name="item_donors")
@NamedQuery(name="ItemDonor.findAll", query="SELECT i FROM ItemDonor i")
public class ItemDonor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private String description;

	@Column(name="display_position")
	private BigDecimal displayPosition;

	@Column(name="donor_id")
	private BigDecimal donorId;

	private String guid;

	@Column(name="item_id")
	private BigDecimal itemId;

	private BigDecimal value;

	public ItemDonor() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDisplayPosition() {
		return this.displayPosition;
	}

	public void setDisplayPosition(BigDecimal displayPosition) {
		this.displayPosition = displayPosition;
	}

	public BigDecimal getDonorId() {
		return this.donorId;
	}

	public void setDonorId(BigDecimal donorId) {
		this.donorId = donorId;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
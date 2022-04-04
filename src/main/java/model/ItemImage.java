package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the item_image database table.
 * 
 */
@Entity
@Table(name="item_image")
@NamedQuery(name="ItemImage.findAll", query="SELECT i FROM ItemImage i")
public class ItemImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String alt;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="display_position")
	private BigDecimal displayPosition;

	private String filename;

	@Column(name="item_id")
	private BigDecimal itemId;

	private String title;

	public ItemImage() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlt() {
		return this.alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
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

	public BigDecimal getDisplayPosition() {
		return this.displayPosition;
	}

	public void setDisplayPosition(BigDecimal displayPosition) {
		this.displayPosition = displayPosition;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
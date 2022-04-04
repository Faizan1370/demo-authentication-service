package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the imported_item database table.
 * 
 */
@Entity
@Table(name="imported_item")
@NamedQuery(name="ImportedItem.findAll", query="SELECT i FROM ImportedItem i")
public class ImportedItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="force_draft")
	private BigDecimal forceDraft;

	@Column(name="import_id")
	private BigDecimal importId;

	@Column(name="item_id")
	private BigDecimal itemId;

	private String status;

	public ImportedItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getForceDraft() {
		return this.forceDraft;
	}

	public void setForceDraft(BigDecimal forceDraft) {
		this.forceDraft = forceDraft;
	}

	public BigDecimal getImportId() {
		return this.importId;
	}

	public void setImportId(BigDecimal importId) {
		this.importId = importId;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
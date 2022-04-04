package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the item_imports database table.
 * 
 */
@Entity
@Table(name="item_imports")
@NamedQuery(name="ItemImport.findAll", query="SELECT i FROM ItemImport i")
public class ItemImport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="import_id")
	private long importId;

	@Column(name="donor_created_count")
	private BigDecimal donorCreatedCount;

	@Column(name="donor_image_count")
	private BigDecimal donorImageCount;

	@Column(name="item_image_count")
	private BigDecimal itemImageCount;

	@Column(name="path_to_zip")
	private String pathToZip;

	public ItemImport() {
	}

	public long getImportId() {
		return this.importId;
	}

	public void setImportId(long importId) {
		this.importId = importId;
	}

	public BigDecimal getDonorCreatedCount() {
		return this.donorCreatedCount;
	}

	public void setDonorCreatedCount(BigDecimal donorCreatedCount) {
		this.donorCreatedCount = donorCreatedCount;
	}

	public BigDecimal getDonorImageCount() {
		return this.donorImageCount;
	}

	public void setDonorImageCount(BigDecimal donorImageCount) {
		this.donorImageCount = donorImageCount;
	}

	public BigDecimal getItemImageCount() {
		return this.itemImageCount;
	}

	public void setItemImageCount(BigDecimal itemImageCount) {
		this.itemImageCount = itemImageCount;
	}

	public String getPathToZip() {
		return this.pathToZip;
	}

	public void setPathToZip(String pathToZip) {
		this.pathToZip = pathToZip;
	}

}
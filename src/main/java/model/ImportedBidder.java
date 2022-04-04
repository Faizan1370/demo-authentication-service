package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the imported_bidder database table.
 * 
 */
@Entity
@Table(name="imported_bidder")
@NamedQuery(name="ImportedBidder.findAll", query="SELECT i FROM ImportedBidder i")
public class ImportedBidder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="import_id")
	private BigDecimal importId;

	private String status;

	public ImportedBidder() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public BigDecimal getImportId() {
		return this.importId;
	}

	public void setImportId(BigDecimal importId) {
		this.importId = importId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
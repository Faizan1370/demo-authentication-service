package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bidder_imports database table.
 * 
 */
@Entity
@Table(name="bidder_imports")
@NamedQuery(name="BidderImport.findAll", query="SELECT b FROM BidderImport b")
public class BidderImport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="import_id")
	private long importId;

	@Column(name="ignore_count")
	private BigDecimal ignoreCount;

	public BidderImport() {
	}

	public long getImportId() {
		return this.importId;
	}

	public void setImportId(long importId) {
		this.importId = importId;
	}

	public BigDecimal getIgnoreCount() {
		return this.ignoreCount;
	}

	public void setIgnoreCount(BigDecimal ignoreCount) {
		this.ignoreCount = ignoreCount;
	}

}
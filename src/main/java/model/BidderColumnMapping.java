package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bidder_column_mappings database table.
 * 
 */
@Entity
@Table(name="bidder_column_mappings")
@NamedQuery(name="BidderColumnMapping.findAll", query="SELECT b FROM BidderColumnMapping b")
public class BidderColumnMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="column_index")
	private BigDecimal columnIndex;

	@Column(name="field_mapping")
	private String fieldMapping;

	@Column(name="import_id")
	private BigDecimal importId;

	private String label;

	public BidderColumnMapping() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getColumnIndex() {
		return this.columnIndex;
	}

	public void setColumnIndex(BigDecimal columnIndex) {
		this.columnIndex = columnIndex;
	}

	public String getFieldMapping() {
		return this.fieldMapping;
	}

	public void setFieldMapping(String fieldMapping) {
		this.fieldMapping = fieldMapping;
	}

	public BigDecimal getImportId() {
		return this.importId;
	}

	public void setImportId(BigDecimal importId) {
		this.importId = importId;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
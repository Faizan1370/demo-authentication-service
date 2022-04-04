package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the import_error database table.
 * 
 */
@Entity
@Table(name="import_error")
@NamedQuery(name="ImportError.findAll", query="SELECT i FROM ImportError i")
public class ImportError implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="column_header")
	private String columnHeader;

	@Column(name="csv_column")
	private String csvColumn;

	private String description;

	@Column(name="import_id")
	private BigDecimal importId;

	@Column(name="line_number")
	private BigDecimal lineNumber;

	public ImportError() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColumnHeader() {
		return this.columnHeader;
	}

	public void setColumnHeader(String columnHeader) {
		this.columnHeader = columnHeader;
	}

	public String getCsvColumn() {
		return this.csvColumn;
	}

	public void setCsvColumn(String csvColumn) {
		this.csvColumn = csvColumn;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getImportId() {
		return this.importId;
	}

	public void setImportId(BigDecimal importId) {
		this.importId = importId;
	}

	public BigDecimal getLineNumber() {
		return this.lineNumber;
	}

	public void setLineNumber(BigDecimal lineNumber) {
		this.lineNumber = lineNumber;
	}

}
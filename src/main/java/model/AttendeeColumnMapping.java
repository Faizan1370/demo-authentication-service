package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the attendee_column_mappings database table.
 * 
 */
@Entity
@Table(name="attendee_column_mappings")
@NamedQuery(name="AttendeeColumnMapping.findAll", query="SELECT a FROM AttendeeColumnMapping a")
public class AttendeeColumnMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="attendee_import_id")
	private BigDecimal attendeeImportId;

	@Column(name="column_index")
	private BigDecimal columnIndex;

	@Column(name="field_mapping")
	private String fieldMapping;

	private String label;

	public AttendeeColumnMapping() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAttendeeImportId() {
		return this.attendeeImportId;
	}

	public void setAttendeeImportId(BigDecimal attendeeImportId) {
		this.attendeeImportId = attendeeImportId;
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

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
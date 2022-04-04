package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the cmp_category database table.
 * 
 */
@Entity
@Table(name="cmp_category")
@NamedQuery(name="CmpCategory.findAll", query="SELECT c FROM CmpCategory c")
public class CmpCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="department_id")
	private BigDecimal departmentId;

	private String description;

	private String name;

	public CmpCategory() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(BigDecimal departmentId) {
		this.departmentId = departmentId;
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

}
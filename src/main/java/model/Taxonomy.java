package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the taxonomy database table.
 * 
 */
@Entity
@NamedQuery(name="Taxonomy.findAll", query="SELECT t FROM Taxonomy t")
public class Taxonomy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String description;

	private BigDecimal grouping;

	private String keyword;

	private String name;

	@Column(name="parent_id")
	private BigDecimal parentId;

	public Taxonomy() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getGrouping() {
		return this.grouping;
	}

	public void setGrouping(BigDecimal grouping) {
		this.grouping = grouping;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getParentId() {
		return this.parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

}
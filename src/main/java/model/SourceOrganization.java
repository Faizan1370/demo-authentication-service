package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the source_organization database table.
 * 
 */
@Entity
@Table(name="source_organization")
@NamedQuery(name="SourceOrganization.findAll", query="SELECT s FROM SourceOrganization s")
public class SourceOrganization implements Serializable {
	private static final long serialVersionUID = 1L;

	private String alias;

	private BigDecimal id;

	public SourceOrganization() {
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

}
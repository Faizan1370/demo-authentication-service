package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the default_category database table.
 * 
 */
@Entity
@Table(name="default_category")
@NamedQuery(name="DefaultCategory.findAll", query="SELECT d FROM DefaultCategory d")
public class DefaultCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="image_id")
	private BigDecimal imageId;

	private String name;

	@Column(name="name_fr")
	private String nameFr;

	@Column(name="taxonomy_id")
	private BigDecimal taxonomyId;

	public DefaultCategory() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getImageId() {
		return this.imageId;
	}

	public void setImageId(BigDecimal imageId) {
		this.imageId = imageId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameFr() {
		return this.nameFr;
	}

	public void setNameFr(String nameFr) {
		this.nameFr = nameFr;
	}

	public BigDecimal getTaxonomyId() {
		return this.taxonomyId;
	}

	public void setTaxonomyId(BigDecimal taxonomyId) {
		this.taxonomyId = taxonomyId;
	}

}
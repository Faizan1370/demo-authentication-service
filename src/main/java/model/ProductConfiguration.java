package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the product_configuration database table.
 * 
 */
@Entity
@Table(name="product_configuration")
@NamedQuery(name="ProductConfiguration.findAll", query="SELECT p FROM ProductConfiguration p")
public class ProductConfiguration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_modified")
	private Timestamp dateModified;

	public ProductConfiguration() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

}
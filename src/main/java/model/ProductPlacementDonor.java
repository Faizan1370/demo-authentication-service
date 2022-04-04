package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the product_placement_donor database table.
 * 
 */
@Entity
@Table(name="product_placement_donor")
@NamedQuery(name="ProductPlacementDonor.findAll", query="SELECT p FROM ProductPlacementDonor p")
public class ProductPlacementDonor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	public ProductPlacementDonor() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
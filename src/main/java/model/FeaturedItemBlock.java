package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the featured_item_block database table.
 * 
 */
@Entity
@Table(name="featured_item_block")
@NamedQuery(name="FeaturedItemBlock.findAll", query="SELECT f FROM FeaturedItemBlock f")
public class FeaturedItemBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="item_id")
	private BigDecimal itemId;

	public FeaturedItemBlock() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

}
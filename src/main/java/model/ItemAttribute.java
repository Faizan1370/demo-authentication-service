package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the item_attributes database table.
 * 
 */
@Entity
@Table(name="item_attributes")
@NamedQuery(name="ItemAttribute.findAll", query="SELECT i FROM ItemAttribute i")
public class ItemAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemAttributePK id;

	public ItemAttribute() {
	}

	public ItemAttributePK getId() {
		return this.id;
	}

	public void setId(ItemAttributePK id) {
		this.id = id;
	}

}
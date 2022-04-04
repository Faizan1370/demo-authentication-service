package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_item_attributes database table.
 * 
 */
@Entity
@Table(name="cmp_item_attributes")
@NamedQuery(name="CmpItemAttribute.findAll", query="SELECT c FROM CmpItemAttribute c")
public class CmpItemAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CmpItemAttributePK id;

	public CmpItemAttribute() {
	}

	public CmpItemAttributePK getId() {
		return this.id;
	}

	public void setId(CmpItemAttributePK id) {
		this.id = id;
	}

}
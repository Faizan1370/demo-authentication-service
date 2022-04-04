package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_item_region database table.
 * 
 */
@Entity
@Table(name="cmp_item_region")
@NamedQuery(name="CmpItemRegion.findAll", query="SELECT c FROM CmpItemRegion c")
public class CmpItemRegion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CmpItemRegionPK id;

	public CmpItemRegion() {
	}

	public CmpItemRegionPK getId() {
		return this.id;
	}

	public void setId(CmpItemRegionPK id) {
		this.id = id;
	}

}
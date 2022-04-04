package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the cmp_starterkit_item database table.
 * 
 */
@Entity
@Table(name="cmp_starterkit_item")
@NamedQuery(name="CmpStarterkitItem.findAll", query="SELECT c FROM CmpStarterkitItem c")
public class CmpStarterkitItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="consignment_item_id")
	private BigDecimal consignmentItemId;

	@Column(name="starterkit_id")
	private BigDecimal starterkitId;

	public CmpStarterkitItem() {
	}

	public BigDecimal getConsignmentItemId() {
		return this.consignmentItemId;
	}

	public void setConsignmentItemId(BigDecimal consignmentItemId) {
		this.consignmentItemId = consignmentItemId;
	}

	public BigDecimal getStarterkitId() {
		return this.starterkitId;
	}

	public void setStarterkitId(BigDecimal starterkitId) {
		this.starterkitId = starterkitId;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the other_purchase database table.
 * 
 */
@Entity
@Table(name="other_purchase")
@NamedQuery(name="OtherPurchase.findAll", query="SELECT o FROM OtherPurchase o")
public class OtherPurchase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="purchase_id")
	private long purchaseId;

	public OtherPurchase() {
	}

	public long getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}

}
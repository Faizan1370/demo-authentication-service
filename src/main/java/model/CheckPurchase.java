package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the check_purchase database table.
 * 
 */
@Entity
@Table(name="check_purchase")
@NamedQuery(name="CheckPurchase.findAll", query="SELECT c FROM CheckPurchase c")
public class CheckPurchase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="purchase_id")
	private long purchaseId;

	public CheckPurchase() {
	}

	public long getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}

}
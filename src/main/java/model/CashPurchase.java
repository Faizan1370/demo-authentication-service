package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cash_purchase database table.
 * 
 */
@Entity
@Table(name="cash_purchase")
@NamedQuery(name="CashPurchase.findAll", query="SELECT c FROM CashPurchase c")
public class CashPurchase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="purchase_id")
	private long purchaseId;

	public CashPurchase() {
	}

	public long getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}

}
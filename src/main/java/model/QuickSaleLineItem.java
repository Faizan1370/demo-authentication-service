package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the quick_sale_line_item database table.
 * 
 */
@Entity
@Table(name="quick_sale_line_item")
@NamedQuery(name="QuickSaleLineItem.findAll", query="SELECT q FROM QuickSaleLineItem q")
public class QuickSaleLineItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="quick_sale_id")
	private BigDecimal quickSaleId;

	public QuickSaleLineItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getQuickSaleId() {
		return this.quickSaleId;
	}

	public void setQuickSaleId(BigDecimal quickSaleId) {
		this.quickSaleId = quickSaleId;
	}

}
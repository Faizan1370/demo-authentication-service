package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the items_awarded_summary_v database table.
 * 
 */
@Entity
@Table(name="items_awarded_summary_v")
@NamedQuery(name="ItemsAwardedSummaryV.findAll", query="SELECT i FROM ItemsAwardedSummaryV i")
public class ItemsAwardedSummaryV implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long awarded;

	@Column(name="item_id")
	private BigDecimal itemId;

	public ItemsAwardedSummaryV() {
	}

	public Long getAwarded() {
		return this.awarded;
	}

	public void setAwarded(Long awarded) {
		this.awarded = awarded;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

}
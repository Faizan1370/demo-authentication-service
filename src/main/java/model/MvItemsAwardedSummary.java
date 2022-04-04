package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mv_items_awarded_summary database table.
 * 
 */
@Entity
@Table(name="mv_items_awarded_summary")
@NamedQuery(name="MvItemsAwardedSummary.findAll", query="SELECT m FROM MvItemsAwardedSummary m")
public class MvItemsAwardedSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long awarded;

	@Column(name="item_id")
	private BigDecimal itemId;

	public MvItemsAwardedSummary() {
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
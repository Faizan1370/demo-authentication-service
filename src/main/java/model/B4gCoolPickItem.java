package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the b4g_cool_pick_items database table.
 * 
 */
@Entity
@Table(name="b4g_cool_pick_items")
@NamedQuery(name="B4gCoolPickItem.findAll", query="SELECT b FROM B4gCoolPickItem b")
public class B4gCoolPickItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="cool_picks_id")
	private BigDecimal coolPicksId;

	@Column(name="item_id")
	private BigDecimal itemId;

	private BigDecimal position;

	public B4gCoolPickItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCoolPicksId() {
		return this.coolPicksId;
	}

	public void setCoolPicksId(BigDecimal coolPicksId) {
		this.coolPicksId = coolPicksId;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public BigDecimal getPosition() {
		return this.position;
	}

	public void setPosition(BigDecimal position) {
		this.position = position;
	}

}
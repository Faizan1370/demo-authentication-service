package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the b4g_featured_auctions database table.
 * 
 */
@Entity
@Table(name="b4g_featured_auctions")
@NamedQuery(name="B4gFeaturedAuction.findAll", query="SELECT b FROM B4gFeaturedAuction b")
public class B4gFeaturedAuction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="item_id_1")
	private BigDecimal itemId1;

	@Column(name="item_id_2")
	private BigDecimal itemId2;

	@Column(name="org_mission_statement")
	private String orgMissionStatement;

	public B4gFeaturedAuction() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getItemId1() {
		return this.itemId1;
	}

	public void setItemId1(BigDecimal itemId1) {
		this.itemId1 = itemId1;
	}

	public BigDecimal getItemId2() {
		return this.itemId2;
	}

	public void setItemId2(BigDecimal itemId2) {
		this.itemId2 = itemId2;
	}

	public String getOrgMissionStatement() {
		return this.orgMissionStatement;
	}

	public void setOrgMissionStatement(String orgMissionStatement) {
		this.orgMissionStatement = orgMissionStatement;
	}

}
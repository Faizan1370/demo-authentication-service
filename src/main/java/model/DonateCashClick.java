package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the donate_cash_clicks database table.
 * 
 */
@Entity
@Table(name="donate_cash_clicks")
@NamedQuery(name="DonateCashClick.findAll", query="SELECT d FROM DonateCashClick d")
public class DonateCashClick implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="org_id")
	private BigDecimal orgId;

	@Column(name="prospect_id")
	private BigDecimal prospectId;

	public DonateCashClick() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	public BigDecimal getProspectId() {
		return this.prospectId;
	}

	public void setProspectId(BigDecimal prospectId) {
		this.prospectId = prospectId;
	}

}
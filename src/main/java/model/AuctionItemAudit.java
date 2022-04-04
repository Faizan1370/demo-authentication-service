package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the auction_item_audit database table.
 * 
 */
@Entity
@Table(name="auction_item_audit")
@NamedQuery(name="AuctionItemAudit.findAll", query="SELECT a FROM AuctionItemAudit a")
public class AuctionItemAudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="deleted_at")
	private Timestamp deletedAt;

	private BigDecimal id;

	public AuctionItemAudit() {
	}

	public Timestamp getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Timestamp deletedAt) {
		this.deletedAt = deletedAt;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

}
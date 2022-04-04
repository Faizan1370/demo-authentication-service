package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the audits database table.
 * 
 */
@Entity
@Table(name="audits")
@NamedQuery(name="Audit.findAll", query="SELECT a FROM Audit a")
public class Audit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	private String description;

	private String email;

	public Audit() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
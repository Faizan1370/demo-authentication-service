package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the abstract_leader_boards database table.
 * 
 */
@Entity
@Table(name="abstract_leader_boards")
@NamedQuery(name="AbstractLeaderBoard.findAll", query="SELECT a FROM AbstractLeaderBoard a")
public class AbstractLeaderBoard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private String name;

	private String theme;

	public AbstractLeaderBoard() {
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

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the auction_access_code_activity database table.
 * 
 */
@Entity
@Table(name="auction_access_code_activity")
@NamedQuery(name="AuctionAccessCodeActivity.findAll", query="SELECT a FROM AuctionAccessCodeActivity a")
public class AuctionAccessCodeActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="checkin_date")
	private Timestamp checkinDate;

	private BigDecimal id;

	@Column(name="ip_address")
	private String ipAddress;

	public AuctionAccessCodeActivity() {
	}

	public Timestamp getCheckinDate() {
		return this.checkinDate;
	}

	public void setCheckinDate(Timestamp checkinDate) {
		this.checkinDate = checkinDate;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

}
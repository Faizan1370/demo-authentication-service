package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mv_activity_data database table.
 * 
 */
@Entity
@Table(name="mv_activity_data")
@NamedQuery(name="MvActivityData.findAll", query="SELECT m FROM MvActivityData m")
public class MvActivityData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="interested_persons")
	private Long interestedPersons;

	@Column(name="registered_users")
	private Long registeredUsers;

	public MvActivityData() {
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public Long getInterestedPersons() {
		return this.interestedPersons;
	}

	public void setInterestedPersons(Long interestedPersons) {
		this.interestedPersons = interestedPersons;
	}

	public Long getRegisteredUsers() {
		return this.registeredUsers;
	}

	public void setRegisteredUsers(Long registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

}
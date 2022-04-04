package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the online_bidder database table.
 * 
 */
@Entity
@Table(name="online_bidder")
@NamedQuery(name="OnlineBidder.findAll", query="SELECT o FROM OnlineBidder o")
public class OnlineBidder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bidder_id")
	private long bidderId;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="registered_card_id")
	private BigDecimal registeredCardId;

	public OnlineBidder() {
	}

	public long getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(long bidderId) {
		this.bidderId = bidderId;
	}

	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getRegisteredCardId() {
		return this.registeredCardId;
	}

	public void setRegisteredCardId(BigDecimal registeredCardId) {
		this.registeredCardId = registeredCardId;
	}

}
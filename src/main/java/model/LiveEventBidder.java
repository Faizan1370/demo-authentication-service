package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the live_event_bidder database table.
 * 
 */
@Entity
@Table(name="live_event_bidder")
@NamedQuery(name="LiveEventBidder.findAll", query="SELECT l FROM LiveEventBidder l")
public class LiveEventBidder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bidder_id")
	private long bidderId;

	@Column(name="auction_address_id")
	private BigDecimal auctionAddressId;

	@Column(name="auction_contact_id")
	private BigDecimal auctionContactId;

	@Column(name="bidder_number")
	private String bidderNumber;

	public LiveEventBidder() {
	}

	public long getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(long bidderId) {
		this.bidderId = bidderId;
	}

	public BigDecimal getAuctionAddressId() {
		return this.auctionAddressId;
	}

	public void setAuctionAddressId(BigDecimal auctionAddressId) {
		this.auctionAddressId = auctionAddressId;
	}

	public BigDecimal getAuctionContactId() {
		return this.auctionContactId;
	}

	public void setAuctionContactId(BigDecimal auctionContactId) {
		this.auctionContactId = auctionContactId;
	}

	public String getBidderNumber() {
		return this.bidderNumber;
	}

	public void setBidderNumber(String bidderNumber) {
		this.bidderNumber = bidderNumber;
	}

}
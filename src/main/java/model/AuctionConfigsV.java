package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the auction_configs_v database table.
 * 
 */
@Entity
@Table(name="auction_configs_v")
@NamedQuery(name="AuctionConfigsV.findAll", query="SELECT a FROM AuctionConfigsV a")
public class AuctionConfigsV implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="bid_extension")
	private Integer bidExtension;

	private Integer duration;

	@Temporal(TemporalType.DATE)
	@Column(name="finish_date")
	private Date finishDate;

	@Column(name="is_live_event")
	private String isLiveEvent;

	@Temporal(TemporalType.DATE)
	private Date liveeventdate;

	@Column(name="opt_biddersearch")
	private Integer optBiddersearch;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	public AuctionConfigsV() {
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public Integer getBidExtension() {
		return this.bidExtension;
	}

	public void setBidExtension(Integer bidExtension) {
		this.bidExtension = bidExtension;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Date getFinishDate() {
		return this.finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public String getIsLiveEvent() {
		return this.isLiveEvent;
	}

	public void setIsLiveEvent(String isLiveEvent) {
		this.isLiveEvent = isLiveEvent;
	}

	public Date getLiveeventdate() {
		return this.liveeventdate;
	}

	public void setLiveeventdate(Date liveeventdate) {
		this.liveeventdate = liveeventdate;
	}

	public Integer getOptBiddersearch() {
		return this.optBiddersearch;
	}

	public void setOptBiddersearch(Integer optBiddersearch) {
		this.optBiddersearch = optBiddersearch;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
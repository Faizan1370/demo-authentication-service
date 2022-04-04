package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the analyzer_settings database table.
 * 
 */
@Entity
@Table(name="analyzer_settings")
@NamedQuery(name="AnalyzerSetting.findAll", query="SELECT a FROM AnalyzerSetting a")
public class AnalyzerSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String auction;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	private BigDecimal audience;

	@Column(name="email_list_size")
	private BigDecimal emailListSize;

	@Column(name="first_auction")
	private BigDecimal firstAuction;

	private double goal;

	@Column(name="items_range_1")
	private BigDecimal itemsRange1;

	@Column(name="items_range_2")
	private BigDecimal itemsRange2;

	@Column(name="items_range_3")
	private BigDecimal itemsRange3;

	@Column(name="items_range_4")
	private BigDecimal itemsRange4;

	@Column(name="items_range_5")
	private BigDecimal itemsRange5;

	@Column(name="items_range_6")
	private BigDecimal itemsRange6;

	@Column(name="number_admins")
	private BigDecimal numberAdmins;

	@Column(name="number_bidders")
	private BigDecimal numberBidders;

	@Column(name="prediction_group")
	private BigDecimal predictionGroup;

	private double sponsorships;

	public AnalyzerSetting() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuction() {
		return this.auction;
	}

	public void setAuction(String auction) {
		this.auction = auction;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getAudience() {
		return this.audience;
	}

	public void setAudience(BigDecimal audience) {
		this.audience = audience;
	}

	public BigDecimal getEmailListSize() {
		return this.emailListSize;
	}

	public void setEmailListSize(BigDecimal emailListSize) {
		this.emailListSize = emailListSize;
	}

	public BigDecimal getFirstAuction() {
		return this.firstAuction;
	}

	public void setFirstAuction(BigDecimal firstAuction) {
		this.firstAuction = firstAuction;
	}

	public double getGoal() {
		return this.goal;
	}

	public void setGoal(double goal) {
		this.goal = goal;
	}

	public BigDecimal getItemsRange1() {
		return this.itemsRange1;
	}

	public void setItemsRange1(BigDecimal itemsRange1) {
		this.itemsRange1 = itemsRange1;
	}

	public BigDecimal getItemsRange2() {
		return this.itemsRange2;
	}

	public void setItemsRange2(BigDecimal itemsRange2) {
		this.itemsRange2 = itemsRange2;
	}

	public BigDecimal getItemsRange3() {
		return this.itemsRange3;
	}

	public void setItemsRange3(BigDecimal itemsRange3) {
		this.itemsRange3 = itemsRange3;
	}

	public BigDecimal getItemsRange4() {
		return this.itemsRange4;
	}

	public void setItemsRange4(BigDecimal itemsRange4) {
		this.itemsRange4 = itemsRange4;
	}

	public BigDecimal getItemsRange5() {
		return this.itemsRange5;
	}

	public void setItemsRange5(BigDecimal itemsRange5) {
		this.itemsRange5 = itemsRange5;
	}

	public BigDecimal getItemsRange6() {
		return this.itemsRange6;
	}

	public void setItemsRange6(BigDecimal itemsRange6) {
		this.itemsRange6 = itemsRange6;
	}

	public BigDecimal getNumberAdmins() {
		return this.numberAdmins;
	}

	public void setNumberAdmins(BigDecimal numberAdmins) {
		this.numberAdmins = numberAdmins;
	}

	public BigDecimal getNumberBidders() {
		return this.numberBidders;
	}

	public void setNumberBidders(BigDecimal numberBidders) {
		this.numberBidders = numberBidders;
	}

	public BigDecimal getPredictionGroup() {
		return this.predictionGroup;
	}

	public void setPredictionGroup(BigDecimal predictionGroup) {
		this.predictionGroup = predictionGroup;
	}

	public double getSponsorships() {
		return this.sponsorships;
	}

	public void setSponsorships(double sponsorships) {
		this.sponsorships = sponsorships;
	}

}
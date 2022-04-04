package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the leader_boards database table.
 * 
 */
@Entity
@Table(name="leader_boards")
@NamedQuery(name="LeaderBoard.findAll", query="SELECT l FROM LeaderBoard l")
public class LeaderBoard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_name")
	private String auctionName;

	@Column(name="category_id")
	private BigDecimal categoryId;

	@Column(name="committee_1")
	private String committee1;

	@Column(name="committee_10")
	private String committee10;

	@Column(name="committee_2")
	private String committee2;

	@Column(name="committee_3")
	private String committee3;

	@Column(name="committee_4")
	private String committee4;

	@Column(name="committee_5")
	private String committee5;

	@Column(name="committee_6")
	private String committee6;

	@Column(name="committee_7")
	private String committee7;

	@Column(name="committee_8")
	private String committee8;

	@Column(name="committee_9")
	private String committee9;

	@Column(name="committee_title")
	private String committeeTitle;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="include_bidding_revenue")
	private BigDecimal includeBiddingRevenue;

	@Column(name="include_pledge_revenue")
	private BigDecimal includePledgeRevenue;

	@Column(name="include_quick_sale_revenue")
	private BigDecimal includeQuickSaleRevenue;

	@Column(name="include_ticket_revenue")
	private BigDecimal includeTicketRevenue;

	@Column(name="item_sort")
	private String itemSort;

	private String mission;

	private String name;

	@Column(name="org_alias")
	private String orgAlias;

	@Column(name="org_name")
	private String orgName;

	@Column(name="section_id")
	private BigDecimal sectionId;

	@Column(name="show_donation_slides")
	private BigDecimal showDonationSlides;

	@Column(name="show_items_type")
	private String showItemsType;

	@Column(name="show_total_raised")
	private BigDecimal showTotalRaised;

	@Column(name="smart_category_id")
	private String smartCategoryId;

	@Column(name="sponsor_1")
	private BigDecimal sponsor1;

	@Column(name="sponsor_2")
	private BigDecimal sponsor2;

	@Column(name="sponsor_3")
	private BigDecimal sponsor3;

	@Column(name="sponsor_4")
	private BigDecimal sponsor4;

	private String theme;

	@Column(name="title_sponsor")
	private BigDecimal titleSponsor;

	public LeaderBoard() {
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

	public String getAuctionName() {
		return this.auctionName;
	}

	public void setAuctionName(String auctionName) {
		this.auctionName = auctionName;
	}

	public BigDecimal getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(BigDecimal categoryId) {
		this.categoryId = categoryId;
	}

	public String getCommittee1() {
		return this.committee1;
	}

	public void setCommittee1(String committee1) {
		this.committee1 = committee1;
	}

	public String getCommittee10() {
		return this.committee10;
	}

	public void setCommittee10(String committee10) {
		this.committee10 = committee10;
	}

	public String getCommittee2() {
		return this.committee2;
	}

	public void setCommittee2(String committee2) {
		this.committee2 = committee2;
	}

	public String getCommittee3() {
		return this.committee3;
	}

	public void setCommittee3(String committee3) {
		this.committee3 = committee3;
	}

	public String getCommittee4() {
		return this.committee4;
	}

	public void setCommittee4(String committee4) {
		this.committee4 = committee4;
	}

	public String getCommittee5() {
		return this.committee5;
	}

	public void setCommittee5(String committee5) {
		this.committee5 = committee5;
	}

	public String getCommittee6() {
		return this.committee6;
	}

	public void setCommittee6(String committee6) {
		this.committee6 = committee6;
	}

	public String getCommittee7() {
		return this.committee7;
	}

	public void setCommittee7(String committee7) {
		this.committee7 = committee7;
	}

	public String getCommittee8() {
		return this.committee8;
	}

	public void setCommittee8(String committee8) {
		this.committee8 = committee8;
	}

	public String getCommittee9() {
		return this.committee9;
	}

	public void setCommittee9(String committee9) {
		this.committee9 = committee9;
	}

	public String getCommitteeTitle() {
		return this.committeeTitle;
	}

	public void setCommitteeTitle(String committeeTitle) {
		this.committeeTitle = committeeTitle;
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

	public BigDecimal getIncludeBiddingRevenue() {
		return this.includeBiddingRevenue;
	}

	public void setIncludeBiddingRevenue(BigDecimal includeBiddingRevenue) {
		this.includeBiddingRevenue = includeBiddingRevenue;
	}

	public BigDecimal getIncludePledgeRevenue() {
		return this.includePledgeRevenue;
	}

	public void setIncludePledgeRevenue(BigDecimal includePledgeRevenue) {
		this.includePledgeRevenue = includePledgeRevenue;
	}

	public BigDecimal getIncludeQuickSaleRevenue() {
		return this.includeQuickSaleRevenue;
	}

	public void setIncludeQuickSaleRevenue(BigDecimal includeQuickSaleRevenue) {
		this.includeQuickSaleRevenue = includeQuickSaleRevenue;
	}

	public BigDecimal getIncludeTicketRevenue() {
		return this.includeTicketRevenue;
	}

	public void setIncludeTicketRevenue(BigDecimal includeTicketRevenue) {
		this.includeTicketRevenue = includeTicketRevenue;
	}

	public String getItemSort() {
		return this.itemSort;
	}

	public void setItemSort(String itemSort) {
		this.itemSort = itemSort;
	}

	public String getMission() {
		return this.mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrgAlias() {
		return this.orgAlias;
	}

	public void setOrgAlias(String orgAlias) {
		this.orgAlias = orgAlias;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public BigDecimal getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(BigDecimal sectionId) {
		this.sectionId = sectionId;
	}

	public BigDecimal getShowDonationSlides() {
		return this.showDonationSlides;
	}

	public void setShowDonationSlides(BigDecimal showDonationSlides) {
		this.showDonationSlides = showDonationSlides;
	}

	public String getShowItemsType() {
		return this.showItemsType;
	}

	public void setShowItemsType(String showItemsType) {
		this.showItemsType = showItemsType;
	}

	public BigDecimal getShowTotalRaised() {
		return this.showTotalRaised;
	}

	public void setShowTotalRaised(BigDecimal showTotalRaised) {
		this.showTotalRaised = showTotalRaised;
	}

	public String getSmartCategoryId() {
		return this.smartCategoryId;
	}

	public void setSmartCategoryId(String smartCategoryId) {
		this.smartCategoryId = smartCategoryId;
	}

	public BigDecimal getSponsor1() {
		return this.sponsor1;
	}

	public void setSponsor1(BigDecimal sponsor1) {
		this.sponsor1 = sponsor1;
	}

	public BigDecimal getSponsor2() {
		return this.sponsor2;
	}

	public void setSponsor2(BigDecimal sponsor2) {
		this.sponsor2 = sponsor2;
	}

	public BigDecimal getSponsor3() {
		return this.sponsor3;
	}

	public void setSponsor3(BigDecimal sponsor3) {
		this.sponsor3 = sponsor3;
	}

	public BigDecimal getSponsor4() {
		return this.sponsor4;
	}

	public void setSponsor4(BigDecimal sponsor4) {
		this.sponsor4 = sponsor4;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public BigDecimal getTitleSponsor() {
		return this.titleSponsor;
	}

	public void setTitleSponsor(BigDecimal titleSponsor) {
		this.titleSponsor = titleSponsor;
	}

}
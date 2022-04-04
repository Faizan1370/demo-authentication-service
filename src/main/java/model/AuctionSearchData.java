package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the auction_search_data database table.
 * 
 */
@Entity
@Table(name="auction_search_data")
@NamedQuery(name="AuctionSearchData.findAll", query="SELECT a FROM AuctionSearchData a")
public class AuctionSearchData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_accept_amex")
	private Integer auctionAcceptAmex;

	@Column(name="auction_accept_discover")
	private Integer auctionAcceptDiscover;

	@Column(name="auction_accept_mastercard")
	private Integer auctionAcceptMastercard;

	@Column(name="auction_accept_visa")
	private Integer auctionAcceptVisa;

	@Column(name="auction_accepting_cash")
	private Integer auctionAcceptingCash;

	@Column(name="auction_accepting_items")
	private Integer auctionAcceptingItems;

	@Column(name="auction_alias")
	private String auctionAlias;

	@Column(name="auction_b4g_include")
	private Integer auctionB4gInclude;

	@Column(name="auction_become_sponsor")
	private Integer auctionBecomeSponsor;

	@Column(name="auction_demo")
	private BigDecimal auctionDemo;

	@Column(name="auction_description")
	private String auctionDescription;

	@Column(name="auction_dyn_bidding_ext")
	private Integer auctionDynBiddingExt;

	@Column(name="auction_dyn_closing")
	private Integer auctionDynClosing;

	@Column(name="auction_dyn_featured_items")
	private Integer auctionDynFeaturedItems;

	@Column(name="auction_dyn_featured_name")
	private String auctionDynFeaturedName;

	@Column(name="auction_dyn_great_deals")
	private Integer auctionDynGreatDeals;

	@Column(name="auction_dyn_hot_items")
	private Integer auctionDynHotItems;

	@Column(name="auction_dyn_live_only")
	private Integer auctionDynLiveOnly;

	@Column(name="auction_dyn_new_items")
	private Integer auctionDynNewItems;

	@Column(name="auction_dyn_no_bids")
	private Integer auctionDynNoBids;

	@Column(name="auction_dyn_online_only")
	private Integer auctionDynOnlineOnly;

	@Column(name="auction_end")
	private Timestamp auctionEnd;

	@Column(name="auction_event_date")
	private Timestamp auctionEventDate;

	@Column(name="auction_event_end")
	private Timestamp auctionEventEnd;

	@Column(name="auction_featured")
	private BigDecimal auctionFeatured;

	@Column(name="auction_guestbook")
	private Integer auctionGuestbook;

	@Column(name="auction_home_page")
	private BigDecimal auctionHomePage;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_item_count")
	private Long auctionItemCount;

	@Column(name="auction_live_event")
	private Integer auctionLiveEvent;

	@Column(name="auction_masthead")
	private String auctionMasthead;

	@Column(name="auction_metrics")
	private Integer auctionMetrics;

	@Column(name="auction_name")
	private String auctionName;

	@Column(name="auction_open_item_count")
	private Long auctionOpenItemCount;

	@Column(name="auction_product_name")
	private String auctionProductName;

	@Column(name="auction_refer_friends")
	private Integer auctionReferFriends;

	@Column(name="auction_selling_tickets")
	private Integer auctionSellingTickets;

	@Column(name="auction_start")
	private Timestamp auctionStart;

	@Column(name="auction_straight_bidding")
	private Integer auctionStraightBidding;

	@Column(name="auction_tickets_mode")
	private String auctionTicketsMode;

	@Column(name="auction_tickets_url")
	private String auctionTicketsUrl;

	@Column(name="auction_time_zone")
	private String auctionTimeZone;

	@Column(name="auction_top_bidders")
	private Integer auctionTopBidders;

	@Column(name="auction_top_items")
	private Integer auctionTopItems;

	@Column(name="last_modified")
	private Timestamp lastModified;

	@Column(name="location_id")
	private BigDecimal locationId;

	@Column(name="org_alias")
	private String orgAlias;

	@Column(name="org_cause")
	private String orgCause;

	@Column(name="org_cause_id")
	private BigDecimal orgCauseId;

	@Column(name="org_city")
	private String orgCity;

	@Column(name="org_country")
	private String orgCountry;

	@Column(name="org_id")
	private BigDecimal orgId;

	@Column(name="org_name")
	private String orgName;

	@Column(name="org_partner_alias")
	private String orgPartnerAlias;

	@Column(name="org_partner_id")
	private BigDecimal orgPartnerId;

	@Column(name="org_partner_name")
	private String orgPartnerName;

	@Column(name="org_postal_code")
	private String orgPostalCode;

	@Column(name="org_state")
	private String orgState;

	public AuctionSearchData() {
	}

	public Integer getAuctionAcceptAmex() {
		return this.auctionAcceptAmex;
	}

	public void setAuctionAcceptAmex(Integer auctionAcceptAmex) {
		this.auctionAcceptAmex = auctionAcceptAmex;
	}

	public Integer getAuctionAcceptDiscover() {
		return this.auctionAcceptDiscover;
	}

	public void setAuctionAcceptDiscover(Integer auctionAcceptDiscover) {
		this.auctionAcceptDiscover = auctionAcceptDiscover;
	}

	public Integer getAuctionAcceptMastercard() {
		return this.auctionAcceptMastercard;
	}

	public void setAuctionAcceptMastercard(Integer auctionAcceptMastercard) {
		this.auctionAcceptMastercard = auctionAcceptMastercard;
	}

	public Integer getAuctionAcceptVisa() {
		return this.auctionAcceptVisa;
	}

	public void setAuctionAcceptVisa(Integer auctionAcceptVisa) {
		this.auctionAcceptVisa = auctionAcceptVisa;
	}

	public Integer getAuctionAcceptingCash() {
		return this.auctionAcceptingCash;
	}

	public void setAuctionAcceptingCash(Integer auctionAcceptingCash) {
		this.auctionAcceptingCash = auctionAcceptingCash;
	}

	public Integer getAuctionAcceptingItems() {
		return this.auctionAcceptingItems;
	}

	public void setAuctionAcceptingItems(Integer auctionAcceptingItems) {
		this.auctionAcceptingItems = auctionAcceptingItems;
	}

	public String getAuctionAlias() {
		return this.auctionAlias;
	}

	public void setAuctionAlias(String auctionAlias) {
		this.auctionAlias = auctionAlias;
	}

	public Integer getAuctionB4gInclude() {
		return this.auctionB4gInclude;
	}

	public void setAuctionB4gInclude(Integer auctionB4gInclude) {
		this.auctionB4gInclude = auctionB4gInclude;
	}

	public Integer getAuctionBecomeSponsor() {
		return this.auctionBecomeSponsor;
	}

	public void setAuctionBecomeSponsor(Integer auctionBecomeSponsor) {
		this.auctionBecomeSponsor = auctionBecomeSponsor;
	}

	public BigDecimal getAuctionDemo() {
		return this.auctionDemo;
	}

	public void setAuctionDemo(BigDecimal auctionDemo) {
		this.auctionDemo = auctionDemo;
	}

	public String getAuctionDescription() {
		return this.auctionDescription;
	}

	public void setAuctionDescription(String auctionDescription) {
		this.auctionDescription = auctionDescription;
	}

	public Integer getAuctionDynBiddingExt() {
		return this.auctionDynBiddingExt;
	}

	public void setAuctionDynBiddingExt(Integer auctionDynBiddingExt) {
		this.auctionDynBiddingExt = auctionDynBiddingExt;
	}

	public Integer getAuctionDynClosing() {
		return this.auctionDynClosing;
	}

	public void setAuctionDynClosing(Integer auctionDynClosing) {
		this.auctionDynClosing = auctionDynClosing;
	}

	public Integer getAuctionDynFeaturedItems() {
		return this.auctionDynFeaturedItems;
	}

	public void setAuctionDynFeaturedItems(Integer auctionDynFeaturedItems) {
		this.auctionDynFeaturedItems = auctionDynFeaturedItems;
	}

	public String getAuctionDynFeaturedName() {
		return this.auctionDynFeaturedName;
	}

	public void setAuctionDynFeaturedName(String auctionDynFeaturedName) {
		this.auctionDynFeaturedName = auctionDynFeaturedName;
	}

	public Integer getAuctionDynGreatDeals() {
		return this.auctionDynGreatDeals;
	}

	public void setAuctionDynGreatDeals(Integer auctionDynGreatDeals) {
		this.auctionDynGreatDeals = auctionDynGreatDeals;
	}

	public Integer getAuctionDynHotItems() {
		return this.auctionDynHotItems;
	}

	public void setAuctionDynHotItems(Integer auctionDynHotItems) {
		this.auctionDynHotItems = auctionDynHotItems;
	}

	public Integer getAuctionDynLiveOnly() {
		return this.auctionDynLiveOnly;
	}

	public void setAuctionDynLiveOnly(Integer auctionDynLiveOnly) {
		this.auctionDynLiveOnly = auctionDynLiveOnly;
	}

	public Integer getAuctionDynNewItems() {
		return this.auctionDynNewItems;
	}

	public void setAuctionDynNewItems(Integer auctionDynNewItems) {
		this.auctionDynNewItems = auctionDynNewItems;
	}

	public Integer getAuctionDynNoBids() {
		return this.auctionDynNoBids;
	}

	public void setAuctionDynNoBids(Integer auctionDynNoBids) {
		this.auctionDynNoBids = auctionDynNoBids;
	}

	public Integer getAuctionDynOnlineOnly() {
		return this.auctionDynOnlineOnly;
	}

	public void setAuctionDynOnlineOnly(Integer auctionDynOnlineOnly) {
		this.auctionDynOnlineOnly = auctionDynOnlineOnly;
	}

	public Timestamp getAuctionEnd() {
		return this.auctionEnd;
	}

	public void setAuctionEnd(Timestamp auctionEnd) {
		this.auctionEnd = auctionEnd;
	}

	public Timestamp getAuctionEventDate() {
		return this.auctionEventDate;
	}

	public void setAuctionEventDate(Timestamp auctionEventDate) {
		this.auctionEventDate = auctionEventDate;
	}

	public Timestamp getAuctionEventEnd() {
		return this.auctionEventEnd;
	}

	public void setAuctionEventEnd(Timestamp auctionEventEnd) {
		this.auctionEventEnd = auctionEventEnd;
	}

	public BigDecimal getAuctionFeatured() {
		return this.auctionFeatured;
	}

	public void setAuctionFeatured(BigDecimal auctionFeatured) {
		this.auctionFeatured = auctionFeatured;
	}

	public Integer getAuctionGuestbook() {
		return this.auctionGuestbook;
	}

	public void setAuctionGuestbook(Integer auctionGuestbook) {
		this.auctionGuestbook = auctionGuestbook;
	}

	public BigDecimal getAuctionHomePage() {
		return this.auctionHomePage;
	}

	public void setAuctionHomePage(BigDecimal auctionHomePage) {
		this.auctionHomePage = auctionHomePage;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public Long getAuctionItemCount() {
		return this.auctionItemCount;
	}

	public void setAuctionItemCount(Long auctionItemCount) {
		this.auctionItemCount = auctionItemCount;
	}

	public Integer getAuctionLiveEvent() {
		return this.auctionLiveEvent;
	}

	public void setAuctionLiveEvent(Integer auctionLiveEvent) {
		this.auctionLiveEvent = auctionLiveEvent;
	}

	public String getAuctionMasthead() {
		return this.auctionMasthead;
	}

	public void setAuctionMasthead(String auctionMasthead) {
		this.auctionMasthead = auctionMasthead;
	}

	public Integer getAuctionMetrics() {
		return this.auctionMetrics;
	}

	public void setAuctionMetrics(Integer auctionMetrics) {
		this.auctionMetrics = auctionMetrics;
	}

	public String getAuctionName() {
		return this.auctionName;
	}

	public void setAuctionName(String auctionName) {
		this.auctionName = auctionName;
	}

	public Long getAuctionOpenItemCount() {
		return this.auctionOpenItemCount;
	}

	public void setAuctionOpenItemCount(Long auctionOpenItemCount) {
		this.auctionOpenItemCount = auctionOpenItemCount;
	}

	public String getAuctionProductName() {
		return this.auctionProductName;
	}

	public void setAuctionProductName(String auctionProductName) {
		this.auctionProductName = auctionProductName;
	}

	public Integer getAuctionReferFriends() {
		return this.auctionReferFriends;
	}

	public void setAuctionReferFriends(Integer auctionReferFriends) {
		this.auctionReferFriends = auctionReferFriends;
	}

	public Integer getAuctionSellingTickets() {
		return this.auctionSellingTickets;
	}

	public void setAuctionSellingTickets(Integer auctionSellingTickets) {
		this.auctionSellingTickets = auctionSellingTickets;
	}

	public Timestamp getAuctionStart() {
		return this.auctionStart;
	}

	public void setAuctionStart(Timestamp auctionStart) {
		this.auctionStart = auctionStart;
	}

	public Integer getAuctionStraightBidding() {
		return this.auctionStraightBidding;
	}

	public void setAuctionStraightBidding(Integer auctionStraightBidding) {
		this.auctionStraightBidding = auctionStraightBidding;
	}

	public String getAuctionTicketsMode() {
		return this.auctionTicketsMode;
	}

	public void setAuctionTicketsMode(String auctionTicketsMode) {
		this.auctionTicketsMode = auctionTicketsMode;
	}

	public String getAuctionTicketsUrl() {
		return this.auctionTicketsUrl;
	}

	public void setAuctionTicketsUrl(String auctionTicketsUrl) {
		this.auctionTicketsUrl = auctionTicketsUrl;
	}

	public String getAuctionTimeZone() {
		return this.auctionTimeZone;
	}

	public void setAuctionTimeZone(String auctionTimeZone) {
		this.auctionTimeZone = auctionTimeZone;
	}

	public Integer getAuctionTopBidders() {
		return this.auctionTopBidders;
	}

	public void setAuctionTopBidders(Integer auctionTopBidders) {
		this.auctionTopBidders = auctionTopBidders;
	}

	public Integer getAuctionTopItems() {
		return this.auctionTopItems;
	}

	public void setAuctionTopItems(Integer auctionTopItems) {
		this.auctionTopItems = auctionTopItems;
	}

	public Timestamp getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public BigDecimal getLocationId() {
		return this.locationId;
	}

	public void setLocationId(BigDecimal locationId) {
		this.locationId = locationId;
	}

	public String getOrgAlias() {
		return this.orgAlias;
	}

	public void setOrgAlias(String orgAlias) {
		this.orgAlias = orgAlias;
	}

	public String getOrgCause() {
		return this.orgCause;
	}

	public void setOrgCause(String orgCause) {
		this.orgCause = orgCause;
	}

	public BigDecimal getOrgCauseId() {
		return this.orgCauseId;
	}

	public void setOrgCauseId(BigDecimal orgCauseId) {
		this.orgCauseId = orgCauseId;
	}

	public String getOrgCity() {
		return this.orgCity;
	}

	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}

	public String getOrgCountry() {
		return this.orgCountry;
	}

	public void setOrgCountry(String orgCountry) {
		this.orgCountry = orgCountry;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgPartnerAlias() {
		return this.orgPartnerAlias;
	}

	public void setOrgPartnerAlias(String orgPartnerAlias) {
		this.orgPartnerAlias = orgPartnerAlias;
	}

	public BigDecimal getOrgPartnerId() {
		return this.orgPartnerId;
	}

	public void setOrgPartnerId(BigDecimal orgPartnerId) {
		this.orgPartnerId = orgPartnerId;
	}

	public String getOrgPartnerName() {
		return this.orgPartnerName;
	}

	public void setOrgPartnerName(String orgPartnerName) {
		this.orgPartnerName = orgPartnerName;
	}

	public String getOrgPostalCode() {
		return this.orgPostalCode;
	}

	public void setOrgPostalCode(String orgPostalCode) {
		this.orgPostalCode = orgPostalCode;
	}

	public String getOrgState() {
		return this.orgState;
	}

	public void setOrgState(String orgState) {
		this.orgState = orgState;
	}

}
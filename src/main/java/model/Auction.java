package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the auction database table.
 * 
 */
@Entity
@NamedQuery(name="Auction.findAll", query="SELECT a FROM Auction a")
public class Auction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String alias;

	@Column(name="auction_font")
	private String auctionFont;

	@Column(name="auction_sort")
	private String auctionSort;

	@Column(name="auction_view")
	private String auctionView;

	@Column(name="cash_donations_percent")
	private BigDecimal cashDonationsPercent;

	@Column(name="catalog_id")
	private String catalogId;

	@Column(name="chair_person")
	private String chairPerson;

	@Column(name="close_lock_date")
	private Timestamp closeLockDate;

	@Column(name="close_lock_user")
	private BigDecimal closeLockUser;

	@Column(name="config_id")
	private BigDecimal configId;

	@Column(name="created_by")
	private BigDecimal createdBy;

	@Column(name="credit_card_id")
	private BigDecimal creditCardId;

	private String currency;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_integrated")
	private Timestamp dateIntegrated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	@Column(name="date_modified_by_jitterbit")
	private Timestamp dateModifiedByJitterbit;

	private String description;

	private BigDecimal featured;

	@Column(name="featured_on_b4g")
	private BigDecimal featuredOnB4g;

	@Column(name="graphic_services_fee")
	private BigDecimal graphicServicesFee;

	private String guid;

	@Column(name="home_page_id")
	private BigDecimal homePageId;

	@Column(name="is_billed")
	private BigDecimal isBilled;

	@Column(name="is_integrated")
	private BigDecimal isIntegrated;

	@Column(name="is_test")
	private BigDecimal isTest;

	@Column(name="managed_services_fee")
	private BigDecimal managedServicesFee;

	private String masthead;

	@Column(name="merchant_account_id")
	private BigDecimal merchantAccountId;

	@Column(name="min_perform_fee")
	private BigDecimal minPerformFee;

	private String name;

	@Column(name="nap_percent_1")
	private BigDecimal napPercent1;

	@Column(name="nap_percent_2")
	private BigDecimal napPercent2;

	@Column(name="nap_percent_3")
	private BigDecimal napPercent3;

	@Column(name="nap_range_1")
	private BigDecimal napRange1;

	@Column(name="nap_range_2")
	private BigDecimal napRange2;

	@Column(name="nap_range_3")
	private BigDecimal napRange3;

	@Column(name="net_opt_in")
	private BigDecimal netOptIn;

	@Column(name="organization_id")
	private BigDecimal organizationId;

	@Column(name="processing_fees")
	private BigDecimal processingFees;

	@Column(name="prod_placement_percent")
	private BigDecimal prodPlacementPercent;

	@Column(name="product_id")
	private BigDecimal productId;

	@Column(name="quick_sales_percent")
	private BigDecimal quickSalesPercent;

	@Column(name="revenue_target")
	private BigDecimal revenueTarget;

	private BigDecimal shareable;

	@Column(name="signed_eula_id")
	private BigDecimal signedEulaId;

	@Column(name="sms_number")
	private String smsNumber;

	@Column(name="ticket_percent")
	private BigDecimal ticketPercent;

	@Column(name="time_zone")
	private String timeZone;

	@Column(name="urchin_id")
	private String urchinId;

	//bi-directional many-to-one association to AuctionAccessCode
	@OneToMany(mappedBy="auction")
	private List<AuctionAccessCode> auctionAccessCodes;

	//bi-directional many-to-one association to GuestCheckinAudit
	@OneToMany(mappedBy="auction")
	private List<GuestCheckinAudit> guestCheckinAudits;

	public Auction() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAuctionFont() {
		return this.auctionFont;
	}

	public void setAuctionFont(String auctionFont) {
		this.auctionFont = auctionFont;
	}

	public String getAuctionSort() {
		return this.auctionSort;
	}

	public void setAuctionSort(String auctionSort) {
		this.auctionSort = auctionSort;
	}

	public String getAuctionView() {
		return this.auctionView;
	}

	public void setAuctionView(String auctionView) {
		this.auctionView = auctionView;
	}

	public BigDecimal getCashDonationsPercent() {
		return this.cashDonationsPercent;
	}

	public void setCashDonationsPercent(BigDecimal cashDonationsPercent) {
		this.cashDonationsPercent = cashDonationsPercent;
	}

	public String getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public String getChairPerson() {
		return this.chairPerson;
	}

	public void setChairPerson(String chairPerson) {
		this.chairPerson = chairPerson;
	}

	public Timestamp getCloseLockDate() {
		return this.closeLockDate;
	}

	public void setCloseLockDate(Timestamp closeLockDate) {
		this.closeLockDate = closeLockDate;
	}

	public BigDecimal getCloseLockUser() {
		return this.closeLockUser;
	}

	public void setCloseLockUser(BigDecimal closeLockUser) {
		this.closeLockUser = closeLockUser;
	}

	public BigDecimal getConfigId() {
		return this.configId;
	}

	public void setConfigId(BigDecimal configId) {
		this.configId = configId;
	}

	public BigDecimal getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public BigDecimal getCreditCardId() {
		return this.creditCardId;
	}

	public void setCreditCardId(BigDecimal creditCardId) {
		this.creditCardId = creditCardId;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateIntegrated() {
		return this.dateIntegrated;
	}

	public void setDateIntegrated(Timestamp dateIntegrated) {
		this.dateIntegrated = dateIntegrated;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public Timestamp getDateModifiedByJitterbit() {
		return this.dateModifiedByJitterbit;
	}

	public void setDateModifiedByJitterbit(Timestamp dateModifiedByJitterbit) {
		this.dateModifiedByJitterbit = dateModifiedByJitterbit;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getFeatured() {
		return this.featured;
	}

	public void setFeatured(BigDecimal featured) {
		this.featured = featured;
	}

	public BigDecimal getFeaturedOnB4g() {
		return this.featuredOnB4g;
	}

	public void setFeaturedOnB4g(BigDecimal featuredOnB4g) {
		this.featuredOnB4g = featuredOnB4g;
	}

	public BigDecimal getGraphicServicesFee() {
		return this.graphicServicesFee;
	}

	public void setGraphicServicesFee(BigDecimal graphicServicesFee) {
		this.graphicServicesFee = graphicServicesFee;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public BigDecimal getHomePageId() {
		return this.homePageId;
	}

	public void setHomePageId(BigDecimal homePageId) {
		this.homePageId = homePageId;
	}

	public BigDecimal getIsBilled() {
		return this.isBilled;
	}

	public void setIsBilled(BigDecimal isBilled) {
		this.isBilled = isBilled;
	}

	public BigDecimal getIsIntegrated() {
		return this.isIntegrated;
	}

	public void setIsIntegrated(BigDecimal isIntegrated) {
		this.isIntegrated = isIntegrated;
	}

	public BigDecimal getIsTest() {
		return this.isTest;
	}

	public void setIsTest(BigDecimal isTest) {
		this.isTest = isTest;
	}

	public BigDecimal getManagedServicesFee() {
		return this.managedServicesFee;
	}

	public void setManagedServicesFee(BigDecimal managedServicesFee) {
		this.managedServicesFee = managedServicesFee;
	}

	public String getMasthead() {
		return this.masthead;
	}

	public void setMasthead(String masthead) {
		this.masthead = masthead;
	}

	public BigDecimal getMerchantAccountId() {
		return this.merchantAccountId;
	}

	public void setMerchantAccountId(BigDecimal merchantAccountId) {
		this.merchantAccountId = merchantAccountId;
	}

	public BigDecimal getMinPerformFee() {
		return this.minPerformFee;
	}

	public void setMinPerformFee(BigDecimal minPerformFee) {
		this.minPerformFee = minPerformFee;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getNapPercent1() {
		return this.napPercent1;
	}

	public void setNapPercent1(BigDecimal napPercent1) {
		this.napPercent1 = napPercent1;
	}

	public BigDecimal getNapPercent2() {
		return this.napPercent2;
	}

	public void setNapPercent2(BigDecimal napPercent2) {
		this.napPercent2 = napPercent2;
	}

	public BigDecimal getNapPercent3() {
		return this.napPercent3;
	}

	public void setNapPercent3(BigDecimal napPercent3) {
		this.napPercent3 = napPercent3;
	}

	public BigDecimal getNapRange1() {
		return this.napRange1;
	}

	public void setNapRange1(BigDecimal napRange1) {
		this.napRange1 = napRange1;
	}

	public BigDecimal getNapRange2() {
		return this.napRange2;
	}

	public void setNapRange2(BigDecimal napRange2) {
		this.napRange2 = napRange2;
	}

	public BigDecimal getNapRange3() {
		return this.napRange3;
	}

	public void setNapRange3(BigDecimal napRange3) {
		this.napRange3 = napRange3;
	}

	public BigDecimal getNetOptIn() {
		return this.netOptIn;
	}

	public void setNetOptIn(BigDecimal netOptIn) {
		this.netOptIn = netOptIn;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public BigDecimal getProcessingFees() {
		return this.processingFees;
	}

	public void setProcessingFees(BigDecimal processingFees) {
		this.processingFees = processingFees;
	}

	public BigDecimal getProdPlacementPercent() {
		return this.prodPlacementPercent;
	}

	public void setProdPlacementPercent(BigDecimal prodPlacementPercent) {
		this.prodPlacementPercent = prodPlacementPercent;
	}

	public BigDecimal getProductId() {
		return this.productId;
	}

	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}

	public BigDecimal getQuickSalesPercent() {
		return this.quickSalesPercent;
	}

	public void setQuickSalesPercent(BigDecimal quickSalesPercent) {
		this.quickSalesPercent = quickSalesPercent;
	}

	public BigDecimal getRevenueTarget() {
		return this.revenueTarget;
	}

	public void setRevenueTarget(BigDecimal revenueTarget) {
		this.revenueTarget = revenueTarget;
	}

	public BigDecimal getShareable() {
		return this.shareable;
	}

	public void setShareable(BigDecimal shareable) {
		this.shareable = shareable;
	}

	public BigDecimal getSignedEulaId() {
		return this.signedEulaId;
	}

	public void setSignedEulaId(BigDecimal signedEulaId) {
		this.signedEulaId = signedEulaId;
	}

	public String getSmsNumber() {
		return this.smsNumber;
	}

	public void setSmsNumber(String smsNumber) {
		this.smsNumber = smsNumber;
	}

	public BigDecimal getTicketPercent() {
		return this.ticketPercent;
	}

	public void setTicketPercent(BigDecimal ticketPercent) {
		this.ticketPercent = ticketPercent;
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getUrchinId() {
		return this.urchinId;
	}

	public void setUrchinId(String urchinId) {
		this.urchinId = urchinId;
	}

	public List<AuctionAccessCode> getAuctionAccessCodes() {
		return this.auctionAccessCodes;
	}

	public void setAuctionAccessCodes(List<AuctionAccessCode> auctionAccessCodes) {
		this.auctionAccessCodes = auctionAccessCodes;
	}

	public AuctionAccessCode addAuctionAccessCode(AuctionAccessCode auctionAccessCode) {
		getAuctionAccessCodes().add(auctionAccessCode);
		auctionAccessCode.setAuction(this);

		return auctionAccessCode;
	}

	public AuctionAccessCode removeAuctionAccessCode(AuctionAccessCode auctionAccessCode) {
		getAuctionAccessCodes().remove(auctionAccessCode);
		auctionAccessCode.setAuction(null);

		return auctionAccessCode;
	}

	public List<GuestCheckinAudit> getGuestCheckinAudits() {
		return this.guestCheckinAudits;
	}

	public void setGuestCheckinAudits(List<GuestCheckinAudit> guestCheckinAudits) {
		this.guestCheckinAudits = guestCheckinAudits;
	}

	public GuestCheckinAudit addGuestCheckinAudit(GuestCheckinAudit guestCheckinAudit) {
		getGuestCheckinAudits().add(guestCheckinAudit);
		guestCheckinAudit.setAuction(this);

		return guestCheckinAudit;
	}

	public GuestCheckinAudit removeGuestCheckinAudit(GuestCheckinAudit guestCheckinAudit) {
		getGuestCheckinAudits().remove(guestCheckinAudit);
		guestCheckinAudit.setAuction(null);

		return guestCheckinAudit;
	}

}
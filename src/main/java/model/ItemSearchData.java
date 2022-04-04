package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the item_search_data database table.
 * 
 */
@Entity
@Table(name="item_search_data")
@NamedQuery(name="ItemSearchData.findAll", query="SELECT i FROM ItemSearchData i")
public class ItemSearchData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auction_alias")
	private String auctionAlias;

	@Column(name="auction_demo")
	private BigDecimal auctionDemo;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="auction_name")
	private String auctionName;

	@Column(name="auction_time_zone")
	private String auctionTimeZone;

	@Column(name="grouping_sku")
	private String groupingSku;

	@Column(name="item_absentee_bidding")
	private Integer itemAbsenteeBidding;

	@Column(name="item_attributes")
	private String itemAttributes;

	@Column(name="item_attributes_ids")
	private String itemAttributesIds;

	@Column(name="item_b4g_include")
	private BigDecimal itemB4gInclude;

	@Column(name="item_biddable")
	private Integer itemBiddable;

	@Column(name="item_buy_price")
	private BigDecimal itemBuyPrice;

	@Column(name="item_buyable")
	private Integer itemBuyable;

	@Column(name="item_category")
	private String itemCategory;

	@Column(name="item_category_id")
	private BigDecimal itemCategoryId;

	@Column(name="item_close_date")
	private Timestamp itemCloseDate;

	@Column(name="item_cost")
	private BigDecimal itemCost;

	@Column(name="item_current_bid")
	private BigDecimal itemCurrentBid;

	@Column(name="item_description")
	private String itemDescription;

	@Column(name="item_donor_ids")
	private String itemDonorIds;

	@Column(name="item_donor_names")
	private String itemDonorNames;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="item_image_ids")
	private String itemImageIds;

	@Column(name="item_image_names")
	private String itemImageNames;

	@Column(name="item_live_event")
	private Integer itemLiveEvent;

	@Column(name="item_lot")
	private String itemLot;

	@Column(name="item_name")
	private String itemName;

	@Column(name="item_number_bids")
	private Long itemNumberBids;

	@Column(name="item_open_date")
	private Timestamp itemOpenDate;

	@Column(name="item_price_range")
	private Integer itemPriceRange;

	@Column(name="item_published")
	private Integer itemPublished;

	@Column(name="item_quantity")
	private BigDecimal itemQuantity;

	@Column(name="item_quantity_available")
	private BigDecimal itemQuantityAvailable;

	@Column(name="item_sku")
	private String itemSku;

	@Column(name="item_type")
	private String itemType;

	@Column(name="item_type_id")
	private BigDecimal itemTypeId;

	@Column(name="item_value")
	private BigDecimal itemValue;

	@Column(name="item_value_display")
	private String itemValueDisplay;

	@Column(name="item_value_sort")
	private BigDecimal itemValueSort;

	@Column(name="item_vendor_id")
	private BigDecimal itemVendorId;

	@Column(name="item_vendor_name")
	private String itemVendorName;

	@Column(name="last_modified")
	private Timestamp lastModified;

	@Column(name="location_id")
	private BigDecimal locationId;

	@Column(name="location_name")
	private String locationName;

	@Column(name="location_parent_id")
	private BigDecimal locationParentId;

	@Column(name="location_parent_name")
	private String locationParentName;

	@Column(name="org_alias")
	private String orgAlias;

	@Column(name="org_cause")
	private String orgCause;

	@Column(name="org_cause_id")
	private BigDecimal orgCauseId;

	@Column(name="org_city")
	private String orgCity;

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

	public ItemSearchData() {
	}

	public String getAuctionAlias() {
		return this.auctionAlias;
	}

	public void setAuctionAlias(String auctionAlias) {
		this.auctionAlias = auctionAlias;
	}

	public BigDecimal getAuctionDemo() {
		return this.auctionDemo;
	}

	public void setAuctionDemo(BigDecimal auctionDemo) {
		this.auctionDemo = auctionDemo;
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

	public String getAuctionTimeZone() {
		return this.auctionTimeZone;
	}

	public void setAuctionTimeZone(String auctionTimeZone) {
		this.auctionTimeZone = auctionTimeZone;
	}

	public String getGroupingSku() {
		return this.groupingSku;
	}

	public void setGroupingSku(String groupingSku) {
		this.groupingSku = groupingSku;
	}

	public Integer getItemAbsenteeBidding() {
		return this.itemAbsenteeBidding;
	}

	public void setItemAbsenteeBidding(Integer itemAbsenteeBidding) {
		this.itemAbsenteeBidding = itemAbsenteeBidding;
	}

	public String getItemAttributes() {
		return this.itemAttributes;
	}

	public void setItemAttributes(String itemAttributes) {
		this.itemAttributes = itemAttributes;
	}

	public String getItemAttributesIds() {
		return this.itemAttributesIds;
	}

	public void setItemAttributesIds(String itemAttributesIds) {
		this.itemAttributesIds = itemAttributesIds;
	}

	public BigDecimal getItemB4gInclude() {
		return this.itemB4gInclude;
	}

	public void setItemB4gInclude(BigDecimal itemB4gInclude) {
		this.itemB4gInclude = itemB4gInclude;
	}

	public Integer getItemBiddable() {
		return this.itemBiddable;
	}

	public void setItemBiddable(Integer itemBiddable) {
		this.itemBiddable = itemBiddable;
	}

	public BigDecimal getItemBuyPrice() {
		return this.itemBuyPrice;
	}

	public void setItemBuyPrice(BigDecimal itemBuyPrice) {
		this.itemBuyPrice = itemBuyPrice;
	}

	public Integer getItemBuyable() {
		return this.itemBuyable;
	}

	public void setItemBuyable(Integer itemBuyable) {
		this.itemBuyable = itemBuyable;
	}

	public String getItemCategory() {
		return this.itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public BigDecimal getItemCategoryId() {
		return this.itemCategoryId;
	}

	public void setItemCategoryId(BigDecimal itemCategoryId) {
		this.itemCategoryId = itemCategoryId;
	}

	public Timestamp getItemCloseDate() {
		return this.itemCloseDate;
	}

	public void setItemCloseDate(Timestamp itemCloseDate) {
		this.itemCloseDate = itemCloseDate;
	}

	public BigDecimal getItemCost() {
		return this.itemCost;
	}

	public void setItemCost(BigDecimal itemCost) {
		this.itemCost = itemCost;
	}

	public BigDecimal getItemCurrentBid() {
		return this.itemCurrentBid;
	}

	public void setItemCurrentBid(BigDecimal itemCurrentBid) {
		this.itemCurrentBid = itemCurrentBid;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemDonorIds() {
		return this.itemDonorIds;
	}

	public void setItemDonorIds(String itemDonorIds) {
		this.itemDonorIds = itemDonorIds;
	}

	public String getItemDonorNames() {
		return this.itemDonorNames;
	}

	public void setItemDonorNames(String itemDonorNames) {
		this.itemDonorNames = itemDonorNames;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public String getItemImageIds() {
		return this.itemImageIds;
	}

	public void setItemImageIds(String itemImageIds) {
		this.itemImageIds = itemImageIds;
	}

	public String getItemImageNames() {
		return this.itemImageNames;
	}

	public void setItemImageNames(String itemImageNames) {
		this.itemImageNames = itemImageNames;
	}

	public Integer getItemLiveEvent() {
		return this.itemLiveEvent;
	}

	public void setItemLiveEvent(Integer itemLiveEvent) {
		this.itemLiveEvent = itemLiveEvent;
	}

	public String getItemLot() {
		return this.itemLot;
	}

	public void setItemLot(String itemLot) {
		this.itemLot = itemLot;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemNumberBids() {
		return this.itemNumberBids;
	}

	public void setItemNumberBids(Long itemNumberBids) {
		this.itemNumberBids = itemNumberBids;
	}

	public Timestamp getItemOpenDate() {
		return this.itemOpenDate;
	}

	public void setItemOpenDate(Timestamp itemOpenDate) {
		this.itemOpenDate = itemOpenDate;
	}

	public Integer getItemPriceRange() {
		return this.itemPriceRange;
	}

	public void setItemPriceRange(Integer itemPriceRange) {
		this.itemPriceRange = itemPriceRange;
	}

	public Integer getItemPublished() {
		return this.itemPublished;
	}

	public void setItemPublished(Integer itemPublished) {
		this.itemPublished = itemPublished;
	}

	public BigDecimal getItemQuantity() {
		return this.itemQuantity;
	}

	public void setItemQuantity(BigDecimal itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public BigDecimal getItemQuantityAvailable() {
		return this.itemQuantityAvailable;
	}

	public void setItemQuantityAvailable(BigDecimal itemQuantityAvailable) {
		this.itemQuantityAvailable = itemQuantityAvailable;
	}

	public String getItemSku() {
		return this.itemSku;
	}

	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public BigDecimal getItemTypeId() {
		return this.itemTypeId;
	}

	public void setItemTypeId(BigDecimal itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public BigDecimal getItemValue() {
		return this.itemValue;
	}

	public void setItemValue(BigDecimal itemValue) {
		this.itemValue = itemValue;
	}

	public String getItemValueDisplay() {
		return this.itemValueDisplay;
	}

	public void setItemValueDisplay(String itemValueDisplay) {
		this.itemValueDisplay = itemValueDisplay;
	}

	public BigDecimal getItemValueSort() {
		return this.itemValueSort;
	}

	public void setItemValueSort(BigDecimal itemValueSort) {
		this.itemValueSort = itemValueSort;
	}

	public BigDecimal getItemVendorId() {
		return this.itemVendorId;
	}

	public void setItemVendorId(BigDecimal itemVendorId) {
		this.itemVendorId = itemVendorId;
	}

	public String getItemVendorName() {
		return this.itemVendorName;
	}

	public void setItemVendorName(String itemVendorName) {
		this.itemVendorName = itemVendorName;
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

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public BigDecimal getLocationParentId() {
		return this.locationParentId;
	}

	public void setLocationParentId(BigDecimal locationParentId) {
		this.locationParentId = locationParentId;
	}

	public String getLocationParentName() {
		return this.locationParentName;
	}

	public void setLocationParentName(String locationParentName) {
		this.locationParentName = locationParentName;
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
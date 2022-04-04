package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the location_search_data database table.
 * 
 */
@Entity
@Table(name="location_search_data")
@NamedQuery(name="LocationSearchData.findAll", query="SELECT l FROM LocationSearchData l")
public class LocationSearchData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="combined_location")
	private String combinedLocation;

	@Column(name="display_name")
	private String displayName;

	@Column(name="geo_location")
	private String geoLocation;

	private String id;

	private BigDecimal lat;

	private BigDecimal lng;

	@Column(name="location_id")
	private BigDecimal locationId;

	@Column(name="location_name")
	private String locationName;

	@Column(name="location_rank")
	private Long locationRank;

	@Column(name="primary_location")
	private String primaryLocation;

	@Column(name="secondary_location")
	private String secondaryLocation;

	private String type;

	public LocationSearchData() {
	}

	public String getCombinedLocation() {
		return this.combinedLocation;
	}

	public void setCombinedLocation(String combinedLocation) {
		this.combinedLocation = combinedLocation;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getGeoLocation() {
		return this.geoLocation;
	}

	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getLat() {
		return this.lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLng() {
		return this.lng;
	}

	public void setLng(BigDecimal lng) {
		this.lng = lng;
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

	public Long getLocationRank() {
		return this.locationRank;
	}

	public void setLocationRank(Long locationRank) {
		this.locationRank = locationRank;
	}

	public String getPrimaryLocation() {
		return this.primaryLocation;
	}

	public void setPrimaryLocation(String primaryLocation) {
		this.primaryLocation = primaryLocation;
	}

	public String getSecondaryLocation() {
		return this.secondaryLocation;
	}

	public void setSecondaryLocation(String secondaryLocation) {
		this.secondaryLocation = secondaryLocation;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
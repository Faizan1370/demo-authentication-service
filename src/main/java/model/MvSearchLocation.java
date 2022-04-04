package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mv_search_locations database table.
 * 
 */
@Entity
@Table(name="mv_search_locations")
@NamedQuery(name="MvSearchLocation.findAll", query="SELECT m FROM MvSearchLocation m")
public class MvSearchLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="location_id")
	private BigDecimal locationId;

	@Column(name="location_name")
	private String locationName;

	@Column(name="parent_id")
	private BigDecimal parentId;

	@Column(name="parent_name")
	private String parentName;

	public MvSearchLocation() {
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

	public BigDecimal getParentId() {
		return this.parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return this.parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

}
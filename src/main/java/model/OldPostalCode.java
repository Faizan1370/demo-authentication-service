package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the old_postal_code database table.
 * 
 */
@Entity
@Table(name="old_postal_code")
@NamedQuery(name="OldPostalCode.findAll", query="SELECT o FROM OldPostalCode o")
public class OldPostalCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="area_code")
	private String areaCode;

	private String city;

	private String code;

	private String country;

	private BigDecimal dst;

	private BigDecimal latitude;

	@Column(name="location_id")
	private BigDecimal locationId;

	private BigDecimal longitude;

	@Column(name="msa_code")
	private String msaCode;

	@Column(name="msa_name")
	private String msaName;

	private String state;

	@Column(name="time_zone")
	private String timeZone;

	private BigDecimal utc;

	public OldPostalCode() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigDecimal getDst() {
		return this.dst;
	}

	public void setDst(BigDecimal dst) {
		this.dst = dst;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLocationId() {
		return this.locationId;
	}

	public void setLocationId(BigDecimal locationId) {
		this.locationId = locationId;
	}

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getMsaCode() {
		return this.msaCode;
	}

	public void setMsaCode(String msaCode) {
		this.msaCode = msaCode;
	}

	public String getMsaName() {
		return this.msaName;
	}

	public void setMsaName(String msaName) {
		this.msaName = msaName;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public BigDecimal getUtc() {
		return this.utc;
	}

	public void setUtc(BigDecimal utc) {
		this.utc = utc;
	}

}
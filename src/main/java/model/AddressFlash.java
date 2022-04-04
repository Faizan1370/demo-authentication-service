package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the address_flash database table.
 * 
 */
@Entity
@Table(name="address_flash")
@NamedQuery(name="AddressFlash.findAll", query="SELECT a FROM AddressFlash a")
public class AddressFlash implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String city;

	@Column(name="country_code")
	private String countryCode;

	private String fax;

	private String line1;

	private String line2;

	private String phone;

	private String state;

	private String zip;

	public AddressFlash() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLine1() {
		return this.line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return this.line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
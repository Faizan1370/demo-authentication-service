package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the purchase_address database table.
 * 
 */
@Entity
@Table(name="purchase_address")
@NamedQuery(name="PurchaseAddress.findAll", query="SELECT p FROM PurchaseAddress p")
public class PurchaseAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String city;

	@Column(name="country_code")
	private String countryCode;

	private String line1;

	private String line2;

	@Column(name="postal_code")
	private String postalCode;

	private String state;

	public PurchaseAddress() {
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

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
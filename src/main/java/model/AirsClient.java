package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the airs_clients database table.
 * 
 */
@Entity
@Table(name="airs_clients")
@NamedQuery(name="AirsClient.findAll", query="SELECT a FROM AirsClient a")
public class AirsClient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String alias;

	private String city;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="is_showing")
	private BigDecimal isShowing;

	private String name;

	private String state;

	private String type;

	private String url;

	public AirsClient() {
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

	public BigDecimal getIsShowing() {
		return this.isShowing;
	}

	public void setIsShowing(BigDecimal isShowing) {
		this.isShowing = isShowing;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
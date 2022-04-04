package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the referral_partner database table.
 * 
 */
@Entity
@Table(name="referral_partner")
@NamedQuery(name="ReferralPartner.findAll", query="SELECT r FROM ReferralPartner r")
public class ReferralPartner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String alt;

	private BigDecimal cobranded;

	private BigDecimal disabled;

	private String name;

	private String url;

	public ReferralPartner() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlt() {
		return this.alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public BigDecimal getCobranded() {
		return this.cobranded;
	}

	public void setCobranded(BigDecimal cobranded) {
		this.cobranded = cobranded;
	}

	public BigDecimal getDisabled() {
		return this.disabled;
	}

	public void setDisabled(BigDecimal disabled) {
		this.disabled = disabled;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
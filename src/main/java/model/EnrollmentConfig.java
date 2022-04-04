package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the enrollment_config database table.
 * 
 */
@Entity
@Table(name="enrollment_config")
@NamedQuery(name="EnrollmentConfig.findAll", query="SELECT e FROM EnrollmentConfig e")
public class EnrollmentConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private BigDecimal amount;

	@Column(name="ask_premium_support")
	private BigDecimal askPremiumSupport;

	@Column(name="collect_cc")
	private BigDecimal collectCc;

	private String currency;

	@Column(name="eula_id")
	private BigDecimal eulaId;

	@Column(name="is_default")
	private BigDecimal isDefault;

	private String name;

	@Column(name="partner_id")
	private BigDecimal partnerId;

	@Column(name="product_config_id")
	private BigDecimal productConfigId;

	@Column(name="product_mode")
	private String productMode;

	public EnrollmentConfig() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAskPremiumSupport() {
		return this.askPremiumSupport;
	}

	public void setAskPremiumSupport(BigDecimal askPremiumSupport) {
		this.askPremiumSupport = askPremiumSupport;
	}

	public BigDecimal getCollectCc() {
		return this.collectCc;
	}

	public void setCollectCc(BigDecimal collectCc) {
		this.collectCc = collectCc;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getEulaId() {
		return this.eulaId;
	}

	public void setEulaId(BigDecimal eulaId) {
		this.eulaId = eulaId;
	}

	public BigDecimal getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(BigDecimal isDefault) {
		this.isDefault = isDefault;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(BigDecimal partnerId) {
		this.partnerId = partnerId;
	}

	public BigDecimal getProductConfigId() {
		return this.productConfigId;
	}

	public void setProductConfigId(BigDecimal productConfigId) {
		this.productConfigId = productConfigId;
	}

	public String getProductMode() {
		return this.productMode;
	}

	public void setProductMode(String productMode) {
		this.productMode = productMode;
	}

}
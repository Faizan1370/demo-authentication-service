package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the config_values database table.
 * 
 */
@Entity
@Table(name="config_values")
@NamedQuery(name="ConfigValue.findAll", query="SELECT c FROM ConfigValue c")
public class ConfigValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String name;

	@Column(name="product_config_id")
	private BigDecimal productConfigId;

	private String type;

	private String value;

	public ConfigValue() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getProductConfigId() {
		return this.productConfigId;
	}

	public void setProductConfigId(BigDecimal productConfigId) {
		this.productConfigId = productConfigId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
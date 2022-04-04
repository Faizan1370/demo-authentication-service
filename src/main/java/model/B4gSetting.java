package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the b4g_settings database table.
 * 
 */
@Entity
@Table(name="b4g_settings")
@NamedQuery(name="B4gSetting.findAll", query="SELECT b FROM B4gSetting b")
public class B4gSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String name;

	private BigDecimal enabled;

	public B4gSetting() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getEnabled() {
		return this.enabled;
	}

	public void setEnabled(BigDecimal enabled) {
		this.enabled = enabled;
	}

}
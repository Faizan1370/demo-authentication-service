package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the toggle_block database table.
 * 
 */
@Entity
@Table(name="toggle_block")
@NamedQuery(name="ToggleBlock.findAll", query="SELECT t FROM ToggleBlock t")
public class ToggleBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="is_on")
	private BigDecimal isOn;

	public ToggleBlock() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getIsOn() {
		return this.isOn;
	}

	public void setIsOn(BigDecimal isOn) {
		this.isOn = isOn;
	}

}
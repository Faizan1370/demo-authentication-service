package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the demographic_data database table.
 * 
 */
@Entity
@Table(name="demographic_data")
@NamedQuery(name="DemographicData.findAll", query="SELECT d FROM DemographicData d")
public class DemographicData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="zip_3")
	private String zip3;

	@Column(name="median_income")
	private BigDecimal medianIncome;

	private BigDecimal population;

	public DemographicData() {
	}

	public String getZip3() {
		return this.zip3;
	}

	public void setZip3(String zip3) {
		this.zip3 = zip3;
	}

	public BigDecimal getMedianIncome() {
		return this.medianIncome;
	}

	public void setMedianIncome(BigDecimal medianIncome) {
		this.medianIncome = medianIncome;
	}

	public BigDecimal getPopulation() {
		return this.population;
	}

	public void setPopulation(BigDecimal population) {
		this.population = population;
	}

}
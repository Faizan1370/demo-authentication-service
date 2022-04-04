package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pgf_response_codes database table.
 * 
 */
@Entity
@Table(name="pgf_response_codes")
@NamedQuery(name="PgfResponseCode.findAll", query="SELECT p FROM PgfResponseCode p")
public class PgfResponseCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="response_code")
	private Integer responseCode;

	private String description;

	public PgfResponseCode() {
	}

	public Integer getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
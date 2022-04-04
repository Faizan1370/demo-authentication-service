package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the b4g_cool_picks database table.
 * 
 */
@Entity
@Table(name="b4g_cool_picks")
@NamedQuery(name="B4gCoolPick.findAll", query="SELECT b FROM B4gCoolPick b")
public class B4gCoolPick implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="finish_date")
	private Timestamp finishDate;

	private BigDecimal position;

	@Column(name="source_organization_id")
	private BigDecimal sourceOrganizationId;

	@Column(name="start_date")
	private Timestamp startDate;

	private String title;

	public B4gCoolPick() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getFinishDate() {
		return this.finishDate;
	}

	public void setFinishDate(Timestamp finishDate) {
		this.finishDate = finishDate;
	}

	public BigDecimal getPosition() {
		return this.position;
	}

	public void setPosition(BigDecimal position) {
		this.position = position;
	}

	public BigDecimal getSourceOrganizationId() {
		return this.sourceOrganizationId;
	}

	public void setSourceOrganizationId(BigDecimal sourceOrganizationId) {
		this.sourceOrganizationId = sourceOrganizationId;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
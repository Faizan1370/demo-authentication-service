package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the viewed_alert database table.
 * 
 */
@Entity
@Table(name="viewed_alert")
@NamedQuery(name="ViewedAlert.findAll", query="SELECT v FROM ViewedAlert v")
public class ViewedAlert implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="account_id")
	private BigDecimal accountId;

	@Column(name="alert_id")
	private BigDecimal alertId;

	@Column(name="viewed_date")
	private Timestamp viewedDate;

	public ViewedAlert() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getAlertId() {
		return this.alertId;
	}

	public void setAlertId(BigDecimal alertId) {
		this.alertId = alertId;
	}

	public Timestamp getViewedDate() {
		return this.viewedDate;
	}

	public void setViewedDate(Timestamp viewedDate) {
		this.viewedDate = viewedDate;
	}

}
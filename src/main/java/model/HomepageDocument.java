package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the homepage_document database table.
 * 
 */
@Entity
@Table(name="homepage_document")
@NamedQuery(name="HomepageDocument.findAll", query="SELECT h FROM HomepageDocument h")
public class HomepageDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_scheduled")
	private Timestamp dateScheduled;

	@Column(name="page_mode")
	private String pageMode;

	@Column(name="page_type")
	private String pageType;

	public HomepageDocument() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getDateScheduled() {
		return this.dateScheduled;
	}

	public void setDateScheduled(Timestamp dateScheduled) {
		this.dateScheduled = dateScheduled;
	}

	public String getPageMode() {
		return this.pageMode;
	}

	public void setPageMode(String pageMode) {
		this.pageMode = pageMode;
	}

	public String getPageType() {
		return this.pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

}
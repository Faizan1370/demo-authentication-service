package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_department_content database table.
 * 
 */
@Entity
@Table(name="cmp_department_content")
@NamedQuery(name="CmpDepartmentContent.findAll", query="SELECT c FROM CmpDepartmentContent c")
public class CmpDepartmentContent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String content;

	private String name;

	private String skyscraper;

	public CmpDepartmentContent() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkyscraper() {
		return this.skyscraper;
	}

	public void setSkyscraper(String skyscraper) {
		this.skyscraper = skyscraper;
	}

}
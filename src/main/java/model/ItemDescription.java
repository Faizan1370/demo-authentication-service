package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the item_descriptions database table.
 * 
 */
@Entity
@Table(name="item_descriptions")
@NamedQuery(name="ItemDescription.findAll", query="SELECT i FROM ItemDescription i")
public class ItemDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String description;

	private String internal;

	private String special;

	public ItemDescription() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInternal() {
		return this.internal;
	}

	public void setInternal(String internal) {
		this.internal = internal;
	}

	public String getSpecial() {
		return this.special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

}
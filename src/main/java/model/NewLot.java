package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the new_lot database table.
 * 
 */
@Entity
@Table(name="new_lot")
@NamedQuery(name="NewLot.findAll", query="SELECT n FROM NewLot n")
public class NewLot implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer coalesce;

	public NewLot() {
	}

	public Integer getCoalesce() {
		return this.coalesce;
	}

	public void setCoalesce(Integer coalesce) {
		this.coalesce = coalesce;
	}

}
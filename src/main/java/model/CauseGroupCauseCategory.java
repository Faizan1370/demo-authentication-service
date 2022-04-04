package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cause_group_cause_category database table.
 * 
 */
@Entity
@Table(name="cause_group_cause_category")
@NamedQuery(name="CauseGroupCauseCategory.findAll", query="SELECT c FROM CauseGroupCauseCategory c")
public class CauseGroupCauseCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CauseGroupCauseCategoryPK id;

	public CauseGroupCauseCategory() {
	}

	public CauseGroupCauseCategoryPK getId() {
		return this.id;
	}

	public void setId(CauseGroupCauseCategoryPK id) {
		this.id = id;
	}

}
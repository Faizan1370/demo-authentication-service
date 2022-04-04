package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the prediction_group database table.
 * 
 */
@Entity
@Table(name="prediction_group")
@NamedQuery(name="PredictionGroup.findAll", query="SELECT p FROM PredictionGroup p")
public class PredictionGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="group_id")
	private long groupId;

	private String description;

	private String name;

	public PredictionGroup() {
	}

	public long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
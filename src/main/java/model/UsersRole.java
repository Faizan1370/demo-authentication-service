package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the users_roles database table.
 * 
 */
@Entity
@Table(name="users_roles")
@NamedQuery(name="UsersRole.findAll", query="SELECT u FROM UsersRole u")
public class UsersRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsersRolePK id;

	private String description;

	public UsersRole() {
	}

	public UsersRolePK getId() {
		return this.id;
	}

	public void setId(UsersRolePK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
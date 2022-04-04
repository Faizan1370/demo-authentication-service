package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the users_roles database table.
 * 
 */
@Embeddable
public class UsersRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="users_id")
	private long usersId;

	@Column(name="roles_id")
	private long rolesId;

	public UsersRolePK() {
	}
	public long getUsersId() {
		return this.usersId;
	}
	public void setUsersId(long usersId) {
		this.usersId = usersId;
	}
	public long getRolesId() {
		return this.rolesId;
	}
	public void setRolesId(long rolesId) {
		this.rolesId = rolesId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsersRolePK)) {
			return false;
		}
		UsersRolePK castOther = (UsersRolePK)other;
		return 
			(this.usersId == castOther.usersId)
			&& (this.rolesId == castOther.rolesId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.usersId ^ (this.usersId >>> 32)));
		hash = hash * prime + ((int) (this.rolesId ^ (this.rolesId >>> 32)));
		
		return hash;
	}
}
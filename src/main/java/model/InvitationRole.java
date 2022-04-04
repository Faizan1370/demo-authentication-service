package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the invitation_role database table.
 * 
 */
@Entity
@Table(name="invitation_role")
@NamedQuery(name="InvitationRole.findAll", query="SELECT i FROM InvitationRole i")
public class InvitationRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="invitation_id")
	private BigDecimal invitationId;

	private String role;

	public InvitationRole() {
	}

	public BigDecimal getInvitationId() {
		return this.invitationId;
	}

	public void setInvitationId(BigDecimal invitationId) {
		this.invitationId = invitationId;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
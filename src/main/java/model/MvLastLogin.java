package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mv_last_logins database table.
 * 
 */
@Entity
@Table(name="mv_last_logins")
@NamedQuery(name="MvLastLogin.findAll", query="SELECT m FROM MvLastLogin m")
public class MvLastLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="last_login")
	private Timestamp lastLogin;

	@Column(name="org_id")
	private BigDecimal orgId;

	public MvLastLogin() {
	}

	public Timestamp getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

}
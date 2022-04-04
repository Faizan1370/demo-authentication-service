package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cmp_qrtz_locks database table.
 * 
 */
@Entity
@Table(name="cmp_qrtz_locks")
@NamedQuery(name="CmpQrtzLock.findAll", query="SELECT c FROM CmpQrtzLock c")
public class CmpQrtzLock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="lock_name")
	private String lockName;

	public CmpQrtzLock() {
	}

	public String getLockName() {
		return this.lockName;
	}

	public void setLockName(String lockName) {
		this.lockName = lockName;
	}

}
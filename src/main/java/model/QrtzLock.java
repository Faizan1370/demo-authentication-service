package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qrtz_locks database table.
 * 
 */
@Entity
@Table(name="qrtz_locks")
@NamedQuery(name="QrtzLock.findAll", query="SELECT q FROM QrtzLock q")
public class QrtzLock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="lock_name")
	private String lockName;

	public QrtzLock() {
	}

	public String getLockName() {
		return this.lockName;
	}

	public void setLockName(String lockName) {
		this.lockName = lockName;
	}

}
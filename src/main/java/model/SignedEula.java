package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the signed_eula database table.
 * 
 */
@Entity
@Table(name="signed_eula")
@NamedQuery(name="SignedEula.findAll", query="SELECT s FROM SignedEula s")
public class SignedEula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="date_signed")
	private Timestamp dateSigned;

	private BigDecimal eula;

	@Column(name="ip_addr")
	private String ipAddr;

	@Column(name="old_signer")
	private BigDecimal oldSigner;

	private BigDecimal organization;

	private BigDecimal signer;

	public SignedEula() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getDateSigned() {
		return this.dateSigned;
	}

	public void setDateSigned(Timestamp dateSigned) {
		this.dateSigned = dateSigned;
	}

	public BigDecimal getEula() {
		return this.eula;
	}

	public void setEula(BigDecimal eula) {
		this.eula = eula;
	}

	public String getIpAddr() {
		return this.ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public BigDecimal getOldSigner() {
		return this.oldSigner;
	}

	public void setOldSigner(BigDecimal oldSigner) {
		this.oldSigner = oldSigner;
	}

	public BigDecimal getOrganization() {
		return this.organization;
	}

	public void setOrganization(BigDecimal organization) {
		this.organization = organization;
	}

	public BigDecimal getSigner() {
		return this.signer;
	}

	public void setSigner(BigDecimal signer) {
		this.signer = signer;
	}

}
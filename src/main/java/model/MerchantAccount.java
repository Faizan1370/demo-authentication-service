package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the merchant_account database table.
 * 
 */
@Entity
@Table(name="merchant_account")
@NamedQuery(name="MerchantAccount.findAll", query="SELECT m FROM MerchantAccount m")
public class MerchantAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="auth1_encrypted")
	private String auth1Encrypted;

	@Column(name="auth2_encrypted")
	private String auth2Encrypted;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_modified")
	private Timestamp dateModified;

	private String processor;

	public MerchantAccount() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuth1Encrypted() {
		return this.auth1Encrypted;
	}

	public void setAuth1Encrypted(String auth1Encrypted) {
		this.auth1Encrypted = auth1Encrypted;
	}

	public String getAuth2Encrypted() {
		return this.auth2Encrypted;
	}

	public void setAuth2Encrypted(String auth2Encrypted) {
		this.auth2Encrypted = auth2Encrypted;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public String getProcessor() {
		return this.processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

}
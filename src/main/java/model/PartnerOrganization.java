package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the partner_organization database table.
 * 
 */
@Entity
@Table(name="partner_organization")
@NamedQuery(name="PartnerOrganization.findAll", query="SELECT p FROM PartnerOrganization p")
public class PartnerOrganization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String alias;

	@Column(name="copyright_name")
	private String copyrightName;

	@Column(name="powered_by_url")
	private String poweredByUrl;

	public PartnerOrganization() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCopyrightName() {
		return this.copyrightName;
	}

	public void setCopyrightName(String copyrightName) {
		this.copyrightName = copyrightName;
	}

	public String getPoweredByUrl() {
		return this.poweredByUrl;
	}

	public void setPoweredByUrl(String poweredByUrl) {
		this.poweredByUrl = poweredByUrl;
	}

}
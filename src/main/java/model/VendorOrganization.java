package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vendor_organization database table.
 * 
 */
@Entity
@Table(name="vendor_organization")
@NamedQuery(name="VendorOrganization.findAll", query="SELECT v FROM VendorOrganization v")
public class VendorOrganization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	public VendorOrganization() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the donation_descriptions database table.
 * 
 */
@Entity
@Table(name="donation_descriptions")
@NamedQuery(name="DonationDescription.findAll", query="SELECT d FROM DonationDescription d")
public class DonationDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="delivery_comments")
	private String deliveryComments;

	@Column(name="donor_comments")
	private String donorComments;

	@Column(name="item_description")
	private String itemDescription;

	@Column(name="item_special")
	private String itemSpecial;

	public DonationDescription() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDeliveryComments() {
		return this.deliveryComments;
	}

	public void setDeliveryComments(String deliveryComments) {
		this.deliveryComments = deliveryComments;
	}

	public String getDonorComments() {
		return this.donorComments;
	}

	public void setDonorComments(String donorComments) {
		this.donorComments = donorComments;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemSpecial() {
		return this.itemSpecial;
	}

	public void setItemSpecial(String itemSpecial) {
		this.itemSpecial = itemSpecial;
	}

}
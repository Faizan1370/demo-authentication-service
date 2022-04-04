package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cash_campaign_email_config database table.
 * 
 */
@Entity
@Table(name="cash_campaign_email_config")
@NamedQuery(name="CashCampaignEmailConfig.findAll", query="SELECT c FROM CashCampaignEmailConfig c")
public class CashCampaignEmailConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="auction_id")
	private long auctionId;

	@Column(name="optional_text1")
	private String optionalText1;

	@Column(name="optional_text2")
	private String optionalText2;

	public CashCampaignEmailConfig() {
	}

	public long getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(long auctionId) {
		this.auctionId = auctionId;
	}

	public String getOptionalText1() {
		return this.optionalText1;
	}

	public void setOptionalText1(String optionalText1) {
		this.optionalText1 = optionalText1;
	}

	public String getOptionalText2() {
		return this.optionalText2;
	}

	public void setOptionalText2(String optionalText2) {
		this.optionalText2 = optionalText2;
	}

}
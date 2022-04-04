package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the account_credit_cards database table.
 * 
 */
@Embeddable
public class AccountCreditCardPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="account_cc_settings_id")
	private long accountCcSettingsId;

	@Column(name="credit_card_id")
	private long creditCardId;

	public AccountCreditCardPK() {
	}
	public long getAccountCcSettingsId() {
		return this.accountCcSettingsId;
	}
	public void setAccountCcSettingsId(long accountCcSettingsId) {
		this.accountCcSettingsId = accountCcSettingsId;
	}
	public long getCreditCardId() {
		return this.creditCardId;
	}
	public void setCreditCardId(long creditCardId) {
		this.creditCardId = creditCardId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccountCreditCardPK)) {
			return false;
		}
		AccountCreditCardPK castOther = (AccountCreditCardPK)other;
		return 
			(this.accountCcSettingsId == castOther.accountCcSettingsId)
			&& (this.creditCardId == castOther.creditCardId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.accountCcSettingsId ^ (this.accountCcSettingsId >>> 32)));
		hash = hash * prime + ((int) (this.creditCardId ^ (this.creditCardId >>> 32)));
		
		return hash;
	}
}
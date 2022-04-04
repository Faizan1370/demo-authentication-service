package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the account_credit_cards database table.
 * 
 */
@Entity
@Table(name="account_credit_cards")
@NamedQuery(name="AccountCreditCard.findAll", query="SELECT a FROM AccountCreditCard a")
public class AccountCreditCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AccountCreditCardPK id;

	@Column(name="date_created")
	private Timestamp dateCreated;

	public AccountCreditCard() {
	}

	public AccountCreditCardPK getId() {
		return this.id;
	}

	public void setId(AccountCreditCardPK id) {
		this.id = id;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

}
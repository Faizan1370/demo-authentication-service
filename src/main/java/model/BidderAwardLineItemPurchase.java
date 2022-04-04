package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bidder_award_line_item_purchase database table.
 * 
 */
@Entity
@Table(name="bidder_award_line_item_purchase")
@NamedQuery(name="BidderAwardLineItemPurchase.findAll", query="SELECT b FROM BidderAwardLineItemPurchase b")
public class BidderAwardLineItemPurchase implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="award_id")
	private BigDecimal awardId;

	@Column(name="bidder_id")
	private BigDecimal bidderId;

	@Column(name="card_type")
	private String cardType;

	@Column(name="credit_card_id")
	private BigDecimal creditCardId;

	private String currency;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="end_digits")
	private String endDigits;

	@Column(name="item_id")
	private BigDecimal itemId;

	@Column(name="organization_alias")
	private String organizationAlias;

	@Column(name="organization_name")
	private String organizationName;

	@Column(name="payment_type")
	private String paymentType;

	@Column(name="purchase_id")
	private BigDecimal purchaseId;

	private BigDecimal quantity;

	private double shipping;

	private double tax;

	public BidderAwardLineItemPurchase() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public BigDecimal getAwardId() {
		return this.awardId;
	}

	public void setAwardId(BigDecimal awardId) {
		this.awardId = awardId;
	}

	public BigDecimal getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(BigDecimal bidderId) {
		this.bidderId = bidderId;
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public BigDecimal getCreditCardId() {
		return this.creditCardId;
	}

	public void setCreditCardId(BigDecimal creditCardId) {
		this.creditCardId = creditCardId;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getEndDigits() {
		return this.endDigits;
	}

	public void setEndDigits(String endDigits) {
		this.endDigits = endDigits;
	}

	public BigDecimal getItemId() {
		return this.itemId;
	}

	public void setItemId(BigDecimal itemId) {
		this.itemId = itemId;
	}

	public String getOrganizationAlias() {
		return this.organizationAlias;
	}

	public void setOrganizationAlias(String organizationAlias) {
		this.organizationAlias = organizationAlias;
	}

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public BigDecimal getPurchaseId() {
		return this.purchaseId;
	}

	public void setPurchaseId(BigDecimal purchaseId) {
		this.purchaseId = purchaseId;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public double getShipping() {
		return this.shipping;
	}

	public void setShipping(double shipping) {
		this.shipping = shipping;
	}

	public double getTax() {
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
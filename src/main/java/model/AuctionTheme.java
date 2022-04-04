package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the auction_theme database table.
 * 
 */
@Entity
@Table(name="auction_theme")
@NamedQuery(name="AuctionTheme.findAll", query="SELECT a FROM AuctionTheme a")
public class AuctionTheme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String active;

	@Column(name="auction_id")
	private BigDecimal auctionId;

	@Column(name="box_background")
	private String boxBackground;

	@Column(name="box_header_bar")
	private String boxHeaderBar;

	@Column(name="box_header_text")
	private String boxHeaderText;

	@Column(name="button_background")
	private String buttonBackground;

	@Column(name="button_bottom")
	private String buttonBottom;

	@Column(name="button_left")
	private String buttonLeft;

	@Column(name="button_right")
	private String buttonRight;

	@Column(name="button_text")
	private String buttonText;

	@Column(name="button_top")
	private String buttonTop;

	@Column(name="category_active")
	private String categoryActive;

	@Column(name="category_active_background")
	private String categoryActiveBackground;

	@Column(name="category_background")
	private String categoryBackground;

	@Column(name="category_hover")
	private String categoryHover;

	@Column(name="category_hover_background")
	private String categoryHoverBackground;

	@Column(name="category_link")
	private String categoryLink;

	@Column(name="category_link_background")
	private String categoryLinkBackground;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="feature_background")
	private String featureBackground;

	@Column(name="feature_hover")
	private String featureHover;

	@Column(name="feature_link")
	private String featureLink;

	@Column(name="general_background")
	private String generalBackground;

	@Column(name="headline_text")
	private String headlineText;

	private String hover;

	private String link;

	private String visited;

	public AuctionTheme() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public BigDecimal getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(BigDecimal auctionId) {
		this.auctionId = auctionId;
	}

	public String getBoxBackground() {
		return this.boxBackground;
	}

	public void setBoxBackground(String boxBackground) {
		this.boxBackground = boxBackground;
	}

	public String getBoxHeaderBar() {
		return this.boxHeaderBar;
	}

	public void setBoxHeaderBar(String boxHeaderBar) {
		this.boxHeaderBar = boxHeaderBar;
	}

	public String getBoxHeaderText() {
		return this.boxHeaderText;
	}

	public void setBoxHeaderText(String boxHeaderText) {
		this.boxHeaderText = boxHeaderText;
	}

	public String getButtonBackground() {
		return this.buttonBackground;
	}

	public void setButtonBackground(String buttonBackground) {
		this.buttonBackground = buttonBackground;
	}

	public String getButtonBottom() {
		return this.buttonBottom;
	}

	public void setButtonBottom(String buttonBottom) {
		this.buttonBottom = buttonBottom;
	}

	public String getButtonLeft() {
		return this.buttonLeft;
	}

	public void setButtonLeft(String buttonLeft) {
		this.buttonLeft = buttonLeft;
	}

	public String getButtonRight() {
		return this.buttonRight;
	}

	public void setButtonRight(String buttonRight) {
		this.buttonRight = buttonRight;
	}

	public String getButtonText() {
		return this.buttonText;
	}

	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	public String getButtonTop() {
		return this.buttonTop;
	}

	public void setButtonTop(String buttonTop) {
		this.buttonTop = buttonTop;
	}

	public String getCategoryActive() {
		return this.categoryActive;
	}

	public void setCategoryActive(String categoryActive) {
		this.categoryActive = categoryActive;
	}

	public String getCategoryActiveBackground() {
		return this.categoryActiveBackground;
	}

	public void setCategoryActiveBackground(String categoryActiveBackground) {
		this.categoryActiveBackground = categoryActiveBackground;
	}

	public String getCategoryBackground() {
		return this.categoryBackground;
	}

	public void setCategoryBackground(String categoryBackground) {
		this.categoryBackground = categoryBackground;
	}

	public String getCategoryHover() {
		return this.categoryHover;
	}

	public void setCategoryHover(String categoryHover) {
		this.categoryHover = categoryHover;
	}

	public String getCategoryHoverBackground() {
		return this.categoryHoverBackground;
	}

	public void setCategoryHoverBackground(String categoryHoverBackground) {
		this.categoryHoverBackground = categoryHoverBackground;
	}

	public String getCategoryLink() {
		return this.categoryLink;
	}

	public void setCategoryLink(String categoryLink) {
		this.categoryLink = categoryLink;
	}

	public String getCategoryLinkBackground() {
		return this.categoryLinkBackground;
	}

	public void setCategoryLinkBackground(String categoryLinkBackground) {
		this.categoryLinkBackground = categoryLinkBackground;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getFeatureBackground() {
		return this.featureBackground;
	}

	public void setFeatureBackground(String featureBackground) {
		this.featureBackground = featureBackground;
	}

	public String getFeatureHover() {
		return this.featureHover;
	}

	public void setFeatureHover(String featureHover) {
		this.featureHover = featureHover;
	}

	public String getFeatureLink() {
		return this.featureLink;
	}

	public void setFeatureLink(String featureLink) {
		this.featureLink = featureLink;
	}

	public String getGeneralBackground() {
		return this.generalBackground;
	}

	public void setGeneralBackground(String generalBackground) {
		this.generalBackground = generalBackground;
	}

	public String getHeadlineText() {
		return this.headlineText;
	}

	public void setHeadlineText(String headlineText) {
		this.headlineText = headlineText;
	}

	public String getHover() {
		return this.hover;
	}

	public void setHover(String hover) {
		this.hover = hover;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getVisited() {
		return this.visited;
	}

	public void setVisited(String visited) {
		this.visited = visited;
	}

}
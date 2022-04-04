package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the paddle_up_leader_boards database table.
 * 
 */
@Entity
@Table(name="paddle_up_leader_boards")
@NamedQuery(name="PaddleUpLeaderBoard.findAll", query="SELECT p FROM PaddleUpLeaderBoard p")
public class PaddleUpLeaderBoard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private BigDecimal goal;

	@Column(name="show_donation_amount")
	private BigDecimal showDonationAmount;

	public PaddleUpLeaderBoard() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getGoal() {
		return this.goal;
	}

	public void setGoal(BigDecimal goal) {
		this.goal = goal;
	}

	public BigDecimal getShowDonationAmount() {
		return this.showDonationAmount;
	}

	public void setShowDonationAmount(BigDecimal showDonationAmount) {
		this.showDonationAmount = showDonationAmount;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the anonymous_bidder database table.
 * 
 */
@Entity
@Table(name="anonymous_bidder")
@NamedQuery(name="AnonymousBidder.findAll", query="SELECT a FROM AnonymousBidder a")
public class AnonymousBidder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bidder_id")
	private long bidderId;

	public AnonymousBidder() {
	}

	public long getBidderId() {
		return this.bidderId;
	}

	public void setBidderId(long bidderId) {
		this.bidderId = bidderId;
	}

}
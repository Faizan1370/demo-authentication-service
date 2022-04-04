package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the message_bodies database table.
 * 
 */
@Entity
@Table(name="message_bodies")
@NamedQuery(name="MessageBody.findAll", query="SELECT m FROM MessageBody m")
public class MessageBody implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String body;

	public MessageBody() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the text_block database table.
 * 
 */
@Entity
@Table(name="text_block")
@NamedQuery(name="TextBlock.findAll", query="SELECT t FROM TextBlock t")
public class TextBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String text;

	public TextBlock() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
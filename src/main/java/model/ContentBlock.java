package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the content_block database table.
 * 
 */
@Entity
@Table(name="content_block")
@NamedQuery(name="ContentBlock.findAll", query="SELECT c FROM ContentBlock c")
public class ContentBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="document_id")
	private BigDecimal documentId;

	private String name;

	public ContentBlock() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(BigDecimal documentId) {
		this.documentId = documentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
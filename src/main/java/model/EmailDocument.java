package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the email_document database table.
 * 
 */
@Entity
@Table(name="email_document")
@NamedQuery(name="EmailDocument.findAll", query="SELECT e FROM EmailDocument e")
public class EmailDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String subject;

	@Column(name="template_name")
	private String templateName;

	private String visibility;

	public EmailDocument() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

}
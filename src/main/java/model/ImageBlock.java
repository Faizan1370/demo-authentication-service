package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the image_block database table.
 * 
 */
@Entity
@Table(name="image_block")
@NamedQuery(name="ImageBlock.findAll", query="SELECT i FROM ImageBlock i")
public class ImageBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="file_name")
	private String fileName;

	public ImageBlock() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
package csvFileUpload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csvModel")
public class CsvModel {

	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "published")
	private boolean published;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	@Override
	public String toString() {
		return "CsvModel [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published
				+ "]";
	}

	public CsvModel(long id, String title, String description, boolean published) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.published = published;
	}

	public CsvModel() {
		super();
		// TODO Auto-generated constructor stub
	} 
}

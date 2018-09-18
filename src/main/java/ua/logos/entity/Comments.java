package ua.logos.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "comments")
@Getter @Setter
@NoArgsConstructor
@ToString(callSuper = true, exclude = {"student", "courses"})
public class Comments extends BaseEntity {

	@Column(name = "title", length = 50)
	private String title;
	
	@Column(columnDefinition = "TEXT")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToMany(mappedBy = "comments")
	List<Course> courses;
		
}

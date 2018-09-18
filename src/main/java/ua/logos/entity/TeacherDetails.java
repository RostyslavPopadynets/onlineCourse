package ua.logos.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "teacher_details")
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true, exclude = "teacher")
public class TeacherDetails extends BaseEntity {

	private String hobbies;
	
	private String description;
	
	@OneToOne(mappedBy = "teacherDetails")
	private Teacher teacher;
}

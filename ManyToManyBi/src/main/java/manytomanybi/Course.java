package manytomanybi;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    private int course_id;

    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

   
}

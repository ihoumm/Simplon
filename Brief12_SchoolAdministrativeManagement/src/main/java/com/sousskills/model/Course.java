package com.sousskills.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int course_id;
	private String courseName;
	@ManyToOne @JoinColumn( name="teacher_id" )
	private Teacher teacher;

    @ManyToMany
    @JoinTable(name = "students_courses", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> student = new ArrayList<>();

	public Course() {
		super();
	}

	public Course(int course_id, String courseName) {
		super();
		this.course_id = course_id;
		this.courseName = courseName;
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	public Course(String courseName, Teacher teacher, List<Student> student) {
		super();
		this.courseName = courseName;
		this.teacher = teacher;
		this.student = student;
	}

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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", courseName=" + courseName + ", teacher=" + teacher + ", student="
				+ student + "]";
	}
}

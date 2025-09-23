package courseManageProgram.model;

import java.io.Serializable;

public class Course implements Serializable {

	private static final long serialVersionUID = 3874283750235920L;
	
	private int courseId;
	private String courseName;
	private int max_student;
	private int curr_std_ct; // default 0
	private String location;
	private String subject_division;
	private String classTime;
	private String professorId;
	private String major;
	
	public Course() {};
	
	public Course(int courseId, String courseName, int max_student, int curr_std_ct, String location,
			String subject_division, String classTime, String professorId, String major) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.max_student = max_student;
		this.curr_std_ct = curr_std_ct;
		this.location = location;
		this.subject_division = subject_division;
		this.classTime = classTime;
		this.professorId = professorId;
		this.setMajor(major);
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getMax_student() {
		return max_student;
	}

	public void setMax_student(int max_student) {
		this.max_student = max_student;
	}

	public int getCurr_std_ct() {
		return curr_std_ct;
	}

	public void setCurr_std_ct(int curr_std_ct) {
		this.curr_std_ct = curr_std_ct;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSubject_division() {
		return subject_division;
	}

	public void setSubject_division(String subject_division) {
		this.subject_division = subject_division;
	}

	public String getClassTime() {
		return classTime;
	}

	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}

	public String getProfessorId() {
		return professorId;
	}

	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", max_student=" + max_student
				+ ", curr_std_ct=" + curr_std_ct + ", location=" + location + ", subject_division=" + subject_division
				+ ", classTime=" + classTime + ", professorId=" + professorId + ", major=" + major + "]";
	}

}

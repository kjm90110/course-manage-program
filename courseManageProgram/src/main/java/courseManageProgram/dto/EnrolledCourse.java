package courseManageProgram.dto;

public class EnrolledCourse {

	private int seat_no;
	private String courseName;
	private String professorName;
	private String subject_division;
	private String classTime;
	private String location;
	private int courseId;
	
	public EnrolledCourse() {
	}

	public EnrolledCourse(int seat_no, String courseName, String professorName, String subject_division,
			String classTime, String location, int courseId) {
		super();
		this.seat_no = seat_no;
		this.courseName = courseName;
		this.professorName = professorName;
		this.subject_division = subject_division;
		this.classTime = classTime;
		this.location = location;
		this.courseId = courseId;
	}

	public int getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "EnrolledCourse [seat_no=" + seat_no + ", courseName=" + courseName + ", professorName=" + professorName
				+ ", subject_division=" + subject_division + ", classTime=" + classTime + ", location=" + location
				+ ", courseId=" + courseId + "]";
	}
	
}

package courseManageProgram.dto;

public class AppliedStudent {

	private int class_number;
	private String sname;
	private String major;
	private int grade;
	private int seat_no;
	
	public AppliedStudent() {
	}

	public AppliedStudent(int class_number, String sname, String major, int grade, int seat_no) {
		super();
		this.class_number = class_number;
		this.sname = sname;
		this.major = major;
		this.grade = grade;
		this.seat_no = seat_no;
	}

	public int getClass_number() {
		return class_number;
	}

	public void setClass_number(int class_number) {
		this.class_number = class_number;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}

	@Override
	public String toString() {
		return "AppliedStudents [class_number=" + class_number + ", sname=" + sname + ", major=" + major + ", grade="
				+ grade + ", seat_no=" + seat_no + "]";
	}
	
}

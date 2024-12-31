package q614;

public class Student {
	private String schoolName;
	private int grade;
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(grade + " grade in " + schoolName + " School");
	}
}

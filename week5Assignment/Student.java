package week5Assignment;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Divya");
	}
	public void studentDept() {
		System.out.println("Electronics and Instrumentation");
	}
	public void studentId() {
		System.out.println("310618107018");
	}

	public static void main(String[] args) {
		Student studentInfo=new Student();
		studentInfo.collegeName();
		studentInfo.collegecode();
		studentInfo.collegeRank();
		studentInfo.departmentName();
		studentInfo.studentName();
		studentInfo.studentId();
		studentInfo.studentDept();
	}
}
package assignment4;


public class CourseManagement {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setStudentType('A');
		System.out.println(s1);

		Student s2 = new Student();
		s2.setStudentType('C');
		System.out.println(s2.getStudentType());
		
	}
}

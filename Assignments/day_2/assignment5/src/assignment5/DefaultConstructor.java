package assignment5;

public class DefaultConstructor {
	public static void main(String[] args) {
		Student s1 = new Student(1, 'A');
		Student s2 = new Student(2, 'B');
		Student s3 = new Student(3, 'C');
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3.getStudentId());
	}
}

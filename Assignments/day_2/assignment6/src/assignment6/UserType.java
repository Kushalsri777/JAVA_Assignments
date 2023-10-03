package assignment6;

public class UserType {
	String name;
	
	//Constructors
	//parameterized constructor
	UserType(String parameterValue){
		name = parameterValue;
	}
	
	//default constructor
	UserType(){
		this("student");
	}
	
	public static void main(String[] args) {
		UserType ut1 = new UserType("Faculty");
		UserType ut2 = new UserType();
		
		System.out.println(ut1.name);
		System.out.println(ut2.name);
	}
}

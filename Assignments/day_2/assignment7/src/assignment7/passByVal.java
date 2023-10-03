package assignment7;

public class passByVal {
	
	public void passTheValueMethod(int sId) {
		sId=10;
		System.out.println("The sId are" + sId);
	}
	
	public static void main(String[] args) {
		int sId = 25;
		System.out.println(sId);

		passByVal val = new passByVal();
		
		val.passTheValueMethod(sId);
		System.out.println("The sId are" + sId);
	}
}

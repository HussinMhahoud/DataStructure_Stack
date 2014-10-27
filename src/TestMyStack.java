import java.util.Scanner;


public class TestMyStack {
	
	public static String[] inputusertoArray(Scanner inp) {
		String str = inp.nextLine();
		String[] z = str.split(" ");
		return z;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyStack s = new MyStack();
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to linked lists");

		while (s.isEndorder()) {

			System.out.println("Operation: ");
			String[] z = inputusertoArray(input);
			s.runOrder(z);

		}
	}


}

import java.util.Scanner;

public class MyStackVirabl {
	private MyLinkedList arrayint = new MyLinkedList();
	private int topindex = -1;
	private boolean endorder = true;

	public void push(int x) {

		this.topindex++;
		this.arrayint.add(x, topindex);
	}

	public int pop() {
		int v = this.arrayint.remove(topindex);
		this.topindex--;
		return v;

	}

	public int top() {
		return this.arrayint.getelemnt(topindex);

	}

	public int size() {
		return this.topindex + 1;
	}

	public String[] inputusertoArray(Scanner inp) {
		String str = inp.nextLine();
		String[] z = str.split(" ");
		return z;
	}

	public void end() {
		this.endorder = false;
	}

	public void runOrder(String[] str) {
		if (str.length == 0) {
			return;
		}
		switch (str[0]) {
		case "push":
			int z = Integer.parseInt(str[1]);
			this.push(z);
			break;
		case "pop":
			System.out.println(this.pop());
			break;
		case "top":
			System.out.println(this.top());
			break;
		case "size":
			System.out.println(this.size());
			break;
		case "end":
			this.end();
			break;

		default:
			break;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStackVirabl s = new MyStackVirabl();
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to linked lists");

		while (s.endorder) {

			System.out.println("Operation: ");
			String[] z = s.inputusertoArray(input);
			s.runOrder(z);

		}

	}

}

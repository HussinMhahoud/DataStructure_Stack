
public class MyStack {
	private int[] arrayint = new int[10];
	private int topindex = -1;
	private boolean endorder = true;

	public boolean isEndorder() {
		return endorder;
	}

	public void setEndorder(boolean endorder) {
		this.endorder = endorder;
	}

	public void push(int x) {
		this.topindex++;
		this.arrayint[this.topindex] = x;
	}

	public int pop() throws Exception {
		if (this.topindex < 0) {
			throw new Exception("Stack is empty !");
		}
		int v = this.arrayint[this.topindex];
		this.topindex--;
		return v;

	}

	public int top() {
		return this.arrayint[this.topindex];

	}

	public int size() {
		return this.topindex + 1;
	}

	public void runOrder(String[] str) throws Exception {
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

	public void end() {
		this.endorder = false;
	}

}

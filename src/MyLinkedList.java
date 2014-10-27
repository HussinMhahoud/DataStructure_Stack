
public class MyLinkedList {
	private ListNode head = null;
	public boolean endorder = true;

	public void print() {
		ListNode i = this.head;
		while (i != null) {
			System.out.print(i.value + " ");
			i = i.next;

		}

	}

	public void add(int v, int indx) {
		if (indx < 0) {
			System.out.println("add err");
			return;
		}

		ListNode newNode = new ListNode();
		newNode.value = v;
		if (indx == 0) {
			newNode.next = head;
			head = newNode;

		} else {
			ListNode i = head;
			if (i == null) {
				System.out.println("add err #1#");
				return;
			}
			for (int j = 0; j < indx - 1; j++) {

				if (i == null) {
					System.out.println("add err");
					return;
				}

				i = i.next;
			}

			newNode.next = i.next;
			i.next = newNode;

		}

	}

	public int remove(int indx) {
		if (indx < 0) {
			System.out.println("remov err");
			return -1;
		}

		if (indx == 0) {
			System.out.println(head.value);
			int reslat = head.value;
			head = head.next;
			return reslat;
		} else {
			ListNode i = head;
			if (i == null) {
				System.out.println("remov err #1#");
				return -1;
			}
			for (int z = 0; z < indx - 1; z++) {

				if (i == null) {
					System.out.println("remov err");
					return -1;
				}

				i = i.next;
			}

			ListNode j = i.next;
			int rsalt = j.value;
			i.next = j.next;

			return rsalt;

		}

	}

	public int getelemnt(int indx) {
		if (indx < 0) {
			// System.out.println("remov err");
			return -1;
		}

		if (indx == 0) {
			System.out.println(head.value);
			int reslat = head.value;
			// head = head.next;
			return reslat;
		} else {
			ListNode i = head;
			if (i == null) {
				// System.out.println("remov err #1#");
				return -1;
			}
			for (int z = 0; z < indx - 1; z++) {

				if (i == null) {
					System.out.println("remov err");
					return -1;
				}

				i = i.next;
			}

			ListNode j = i.next;
			int rsalt = j.value;
			// i.next = j.next;

			return rsalt;

		}

	}

	public class ListNode {
		public int value;
		public ListNode next = null;

	}

	public int lengthMylinkedList() {
		ListNode i = this.head;
		int leangth = 0;
		while (i != null) {
			leangth++;
			i = i.next;
		}
		return leangth;

	}

	public void push(int v) {
		this.add(v, this.lengthMylinkedList());
	}

	public void pop() {
		this.remove(this.lengthMylinkedList() - 1);

	}

	public void concat(String[] str) {
		for (int i = 1; i < str.length; i++) {
			int x = Integer.parseInt(str[i]);
			this.push(x);

		}
	}

	public void clear() {
		this.head = null;
	}

	public int search(int x) {
		int indextargt = -1;
		int length = 0;
		ListNode i = this.head;

		while (i != null) {
			if (i.value == x) {
				indextargt = length;
				break;
			}
			i = i.next;
			length++;
		}
		return indextargt;
	}

	public void end() {
		this.endorder = false;
	}

	public int[] convert() {

		int[] target = new int[this.lengthMylinkedList()];

		for (int i = 0; i < target.length; i++) {

			target[i] = this.showelement(i);
			// System.out.println(target[i]);
		}
		return target;
	}

	private int showelement(int indx) {

		if (indx == 0) {
			return head.value;

		} else {
			ListNode i = head;
			if (i == null) {

				return -1;
			}
			for (int z = 0; z < indx - 1; z++) {

				if (i == null) {

					return -1;
				}

				i = i.next;
			}

			ListNode j = i.next;
			return j.value;
		}
	}

	public void runOrder(String[] z) {

		switch (z[0]) {
		case "add":
			int x = Integer.parseInt(z[1]);
			int y = Integer.parseInt(z[2]);
			this.add(x, y);
			break;
		case "push":
			int pushvalu = Integer.parseInt(z[1]);
			this.push(pushvalu);

			break;
		case "remove":
			int numindx = Integer.parseInt(z[1]);
			this.remove(numindx);

			break;
		case "pop":
			this.pop();

			break;
		case "clear":
			this.clear();

			break;
		case "length":
			System.out.println(this.lengthMylinkedList());

			break;
		case "print":
			this.print();

			break;
		case "search":
			int searchvalu = Integer.parseInt(z[1]);
			System.out.println(this.search(searchvalu));

			break;
		case "concat":
			this.concat(z);

			break;
		case "convert":

			int[] targt = this.convert();
			for (int i = 0; i < targt.length; i++) {
				System.out.println(targt[i]);

			}

			break;
		case "end":
			this.end();

			break;
		default:
			break;
		}

	}

}

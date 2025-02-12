package in.amjadIT.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> s = new Stack<>();

		s.add("Amjad");
		s.add("Manish");
		s.add("SRK");
		s.add("Ashraf");
		s.add("Bada Manish");
		s.add("Sameer");
		s.add("Sangita");

		System.out.println(s.add("Sumit"));

		System.out.println(s.remove(2));

		System.out.println(s.capacity());

		System.out.println(s.empty());

		System.out.println(s.get(1));

		System.out.println(s);

	}

}

package in.amjadIT.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		list.add("Amjad");
		list.add("101");
		list.add("Sameer");
		list.add("Salik");
		list.add("10.98");
		list.add("Sumit");
		list.add("1209.09f");
		list.add("Shree");
		list.add("SRK");
		list.add("Amjad"); // list supports duplicates value

		System.out.println(list.get(2));

		System.out.println(list.remove(1));

		System.out.println(list.getFirst());

		System.out.println(list.getLast());

		System.out.println(list.get(4));

		System.out.println(list.set(7, "Khan"));

		System.out.println(list.isEmpty());

		System.out.println(list);

	}

}

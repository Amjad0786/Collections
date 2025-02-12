package in.amjadIT.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Amjad");
		list.add("Sameer");
		list.add("Salik");
		list.add("Ashraf");
		list.add("Manish");
		list.add("Sumit");
		list.add("Sangita");
		list.add("Shree");
		list.add("SRK");
		list.add("SRK");

		System.out.println(list);

		System.out.println(list.get(0));

		System.out.println(list.get(1));

		System.out.println(list.get(2));

		System.out.println(list.get(3));

		System.out.println(list.get(4));

		System.out.println(list.get(5));

		System.out.println(list.get(6));

		System.out.println(list.get(7));

		System.out.println(list.get(8));

		System.out.println("++++++++++++++++++++++++++++++++");

		System.out.println(list.equals(list));

		System.out.println("+++++++++++++++++++++++++");

		System.out.println(list.contains("SRK"));

		System.out.println(list.contains("Amjad"));

		System.out.println("+++++++++++++++++++++++++++++");

		System.out.println(list.get(0));

		System.out.println(list.get(1));

		System.out.println("++++++++++++++++++++++++++++++++++++");

		System.out.println(list.indexOf("Amjad"));

		System.out.println(list.indexOf("Ashraf"));

		System.out.println(list.indexOf("Salik"));

		System.out.println(list.indexOf("Sangita"));

		System.out.println("+++++++++++++++++++++++++++++++");

		System.out.println(list.lastIndexOf("SRK"));

		System.out.println(list.indexOf("SRK"));

		System.out.println("++++++++++++++++++++++++");

		System.out.println(list.getFirst());

		System.out.println(list.getLast());

		System.out.println(list.removeFirst());

		System.out.println(list.remove("SRK"));

		System.out.println(list);

		System.out.println(list.set(2, "Danish"));

		System.out.println(list);

		System.out.println(list.hashCode());

	}

}

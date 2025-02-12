package in.amjadIT.list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();

		v.add("amjad");

		v.add("Sameer");

		v.add("10120");

		System.out.println(v.add("Salik"));

		System.out.println(v.clone());

		System.out.println(v.firstElement());

		System.out.println(v.lastElement());

		System.out.println(v.get(3));

		System.out.println(v.remove("10120"));

		System.out.println(v.capacity());

		System.out.println(v.indexOf("Sameer"));

		System.out.println(v.indexOf("amjad"));

		System.out.println(v.hashCode());

		System.out.println(v);
	}

}

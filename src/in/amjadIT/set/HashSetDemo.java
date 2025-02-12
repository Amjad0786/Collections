package in.amjadIT.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Amjad");
		set.add("Farhan");
		set.add("Sameer");
		set.add("Sumit");
		set.add("Ashok");
		set.add("2367");

		System.out.println(set.remove("Farhan"));

		System.out.println(set.add("Farhan"));

		System.out.println(set.hashCode());

		System.out.println(set.equals("Manish"));

		System.out.println(set.size());

		System.out.println(set.contains("Amjad"));

		System.out.println(set.contains("SRK"));

		System.out.println(set.isEmpty());

		System.out.println(set.toString());

		System.out.println(set);
	}
}

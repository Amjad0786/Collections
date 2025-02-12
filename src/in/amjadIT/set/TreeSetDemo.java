package in.amjadIT.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set <String> set = new TreeSet<>();
		
		set.add("Amjad");
		
		set.add("Sameer");
		set.add("Farhan");
		set.add("Shahrukh");
		set.add("Bada Manish");
		set.add("Chota Manish");
		set.add("Sumit");
		set.add("Salik");
		set.add("Sangita");
		set.add("Shree");
		
		System.out.println(set.remove("Sumit"));
		
		System.out.println(set);
		
		
	}

}

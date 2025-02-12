package in.amjadIT.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>() ;
		
		set.add("Ashraf");
		set.add("Amjad");
		set.add("Wasim");
		set.add("Azam");
		set.add("Athar");
		set.add("Aamir");
		set.add("Shaquib");
		set.add("Arshlan");
		set.add("Talha");
		
		System.out.println(set.remove("Aamir"));
		
		System.out.println(set.add("Aamir"));
		
		System.out.println(set.contains("Ashraf"));
		
		System.out.println(set.equals(set));
		
		System.out.println(set.size());
		
		System.out.println(set);
			
				
		
	}
}

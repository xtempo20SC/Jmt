package module1.practice.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(8);
		set.add(14);
		set.add(70);
		set.add(8);
		set.add(null);
		System.out.println(set);
		
		Set<Integer> tset = new TreeSet<>();
		tset.add(8);
		tset.add(14);
		tset.add(70);
		tset.add(8);
		//tset.add(null);  .NullPointerExceptio at java.base/java.util.Objects.requireNonNull
		System.out.println(tset);
	}
}

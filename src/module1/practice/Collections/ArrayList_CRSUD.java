package module1.practice.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_CRSUD {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		//C
		list.add(8);
		list.add(9);
		list.add(4);
		list.add(5);
		list.add(2);
		System.out.println(list);
		
		//R
		System.out.println(list.get(3));  // 3 <-index
		
		//Search
		System.out.println(list.contains(2));
		if(list.contains(2))
			System.out.println(list.indexOf(2));
		
		//U
		list.set(3, 20);
		System.out.println(list);
		
		//D
		list.remove(3);
		System.out.println(list);
		
		
	}
}

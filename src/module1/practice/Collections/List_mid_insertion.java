package module1.practice.Collections;

import java.util.ArrayList;
import java.util.List;

public class List_mid_insertion {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(56);
		list.add(88);
		
		//insert at place where do u want
		
		list.add(1,55);
		list.add(2,0);
		
		list.forEach(System.out::println);
	}
}

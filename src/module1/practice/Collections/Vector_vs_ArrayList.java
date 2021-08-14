package module1.practice.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector_vs_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(7);
		
		System.out.println(list.size());
		
		
		
		
		List<Integer> vectorL = new Vector<>();
		vectorL.add(8);
		vectorL.add(3);
		vectorL.add(6);
		vectorL.add(2);
		vectorL.add(7);
		
		System.out.println(vectorL.size());
		
		
		Vector<Integer> vector = new Vector<>();
		vector.add(8);
		vector.add(3);
		vector.add(6);
		vector.add(2);
		vector.add(7);
		
		System.out.println(vector.capacity());
		
		System.out.println(vector.size());
		
	}
}

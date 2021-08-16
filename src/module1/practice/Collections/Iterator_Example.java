package module1.practice.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Example {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
		 list.add(7);
		 list.add(8);
		 list.add(6);
		 list.add(4);
		 
		 System.out.println(list);
		 
		Iterator<Integer> it = list.iterator();
		 
		 while(it.hasNext())
		 {
			 if(it.next()==6)
				 it.remove();
		 }
		 
		 System.out.println(list);
	}
}

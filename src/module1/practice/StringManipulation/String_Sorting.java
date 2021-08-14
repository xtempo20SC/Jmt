package module1.practice.StringManipulation;

import java.util.Arrays;

public class String_Sorting {

	public static void main(String[] args) {
		String str = "nvfngrorkwjeo";
		
		char []arr = str.toCharArray();
		Arrays.sort(arr);
		
		String result = String.valueOf(arr);
		System.out.println(result);
	}
}

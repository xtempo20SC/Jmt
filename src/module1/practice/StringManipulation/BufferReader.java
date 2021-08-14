package module1.practice.StringManipulation;


import java.io.BufferedReader;

import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader input = new InputStreamReader(System.in); 
		
		BufferedReader br = new BufferedReader(input);
		
		//int n = Integer.parseInt(br.readLine()); //int
		
		//int n = br.read();  //ASCII
		     //char n = (char)br.read();
		
		String n = br.readLine();
		
		System.out.println(n);
	}
		
	
}

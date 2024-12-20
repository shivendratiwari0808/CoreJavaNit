package io_Stream;


import java.io.*;

///WAP in java to read your gender from the keyboard using BufferedReader
public class Test3 {

	public static void main(String[] args) throws IOException{
		var br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your gender :");
		char gender = (char)br.read();
		
		System.out.println("your age is :"+gender);
	}

}

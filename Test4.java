package io_Stream;
import java.io.*;
public class Test4 {

	public static void main(String[] args) throws IOException{
	var br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter your id :");
	int id=Integer.parseInt(br.readLine());
	
	System.out.println("Enter your gender :");
	char gender =br.readLine().charAt(0);
	
	System.out.println("Enter your name :");
	String name=br.readLine();
	
	
	
	}

}

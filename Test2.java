package io_Stream;
import java.io.*;
public class Test2 {
public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter your salery :");
	String sal=br.readLine();
	
	double salery=Double.parseDouble(sal);
	
	System.out.println("your salery is :"+salery);
}
}

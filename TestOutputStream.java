package io_Stream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class TestOutputStream {
public static void main(String[] args) throws Exception{
//	FileOutputStream fos = new FileOutputStream("D:\\JavaLabPractice\\batch_35\\bin\\io_Stream\\test1.txt");
//	fos.write(123);
//	String s="hyd";
//	fos.write(s.getBytes());
	FileInputStream fis = new FileInputStream("text.txt");
	fis.read();
	
}
}

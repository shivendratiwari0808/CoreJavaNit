/* program to write into a file using FileWriter and write()
*/

import java.io.FileWriter;
import java.io.IOException;
import java.lang.ArithmeticException;

	public class WriteFile1{
	public static void main(String []args){
		
	try(FileWriter fw = new FileWriter("Test1.txt")){
		fw.write("hello world");
		System.out.println(10/0);
	}catch (IOException | ArithmeticException e){
		e.printStackTrace();
		}
		
	}
}
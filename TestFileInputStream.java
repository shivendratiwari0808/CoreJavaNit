/* Reading a file using FileInputStream
*/
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream{
	public static void main(String []args){
	try(FileInputStream fi = new FileInputStream("shibbu.txt")){
	int byteData;
	while((byteData = fi.read())!=-1){
		System.out.print((char)byteData);
		}
	}catch(IOException e){
		e.printStackTrace();
	}
	}
}
/* program to read one byte data at a time from a file bu using read() */
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{
public static void main(String []args){
	try(FileReader reader = new FileReader("Test.txt")){
	int character;
	while((character=reader.read())!=-1){
		System.out.println(character+" ");
		}	
	}
	catch(IOException e){
	e.printStackTrace();
	}
   }
}
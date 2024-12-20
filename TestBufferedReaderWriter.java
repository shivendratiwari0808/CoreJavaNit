/*  using BufferedReader and BufferedWriter
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedReaderWriter{
	public static void main (String [] args){
	try (BufferedWriter bfw = new BufferedWriter(new FileWriter("Example1.txt"))){
		bfw.write("hello world");
		bfw.write("Buffered writer example");
		}catch(IOException e){
			e.printStackTrace();	
		}
	
		try(BufferedReader bfr = new BufferedReader(new FileReader("Example1.txt"))){
		String line;
		while((line=bfr.readLine())!=null){
			System.out.println(line);
			}
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
}

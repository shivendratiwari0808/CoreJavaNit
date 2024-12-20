/* converting Byte Streams to Character Streams
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class TestStreamConverter{
	public static void main(String [] args){
	try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("output1.txt"))){
		osw.write("hello world");
		}
		catch (IOException e){
			e.printStackTrace();	
		}
	
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("output1.txt"))){
	int character;
	while((character = isr.read())!=-1){
		System.out.print((char)character);
		}
	}catch(IOException e){
		e.printStackTrace();
		}
	}
}

/* writing to a file using FileOutPutStream
*/

import java.io.FileOutputStream;
import java.io.IOException;

	public class TestFileOutputStream{
	
	public static void main(String[]args){
		String data="omkar pathak";
	try(FileOutputStream fos = new FileOutputStream("Tiwari.txt")){
		fos.write(data.getBytes());
		}catch(IOException e){
		e.printStackTrace();
		}
	}
}
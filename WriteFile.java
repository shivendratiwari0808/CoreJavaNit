/* program to write into a file using FileWriter and Write()
*/

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile{
public static void main(String []args){
	try(FileWriter writer = new FileWriter("Example.txt")){
		writer.write("shivendra tiwari");
		}catch(IOException e){
			e.printStackTrace();
			}
	}
}
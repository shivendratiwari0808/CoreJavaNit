package io_Stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class TestStreamConverter {
public static void main(String[] args) throws FileNotFoundException, IOException {
	try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Output.txt"))){
		
	}
}

}

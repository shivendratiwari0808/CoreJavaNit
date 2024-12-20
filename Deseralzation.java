/* Deserialization Program
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deseralzation{
	public static void main(String [] args){
	Person person=null;
	
	try(FileInputStream filein = new FileInputStream("person1.ser");
	ObjectInputStream in = new ObjectInputStream(filein)){
	person = (Person) in.readObject();
	}catch(IOException i){
		i.printStackTrace();
		}catch(ClassNotFoundException c){
		System.out.println("person class not found");
		c.printStackTrace();
		}
		System.out.println(person);	
	}
	
}
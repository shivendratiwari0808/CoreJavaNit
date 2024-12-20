/*  serializable program
*/

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Person implements Serializable{
	private String name;
	private int age;
	
	public Person(String name, int age){
	this.name=name;
	this.age=age;
	}
	@Override
	public String toString(){
		return "Person{name=' "+ name +"',age="+age+"}";
	}
	
}
public class TestSerialisation{
	public static void main(String [] args){
	Person P = new Person("shivendra", 23);
	
	try(FileOutputStream fileout = new FileOutputStream("person.ser");ObjectOutputStream out=new ObjectOutputStream(fileout)){
	out.writeObject(P);
	System.out.println("Serialized data is saved in person.ser");
		}catch(IOException i){
			i.printStackTrace();		
			}
	
	}
	
}
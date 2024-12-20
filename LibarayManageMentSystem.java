package lab_practice;

import java.util.ArrayList;
import java.util.List;
// encapulation
class Book {
	private String title;
	private String author;
	
	public Book(String title ,String author) {
		this.title=title;
		this.author=author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
}

class Member{
	private String name;
	
	public Member(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
// inheritance
abstract class LibraryItem{
	private int id;
	private String title;
	
	public LibraryItem(int id,String title) {
		this.id=id;
		this.title=title;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public abstract void displayInfo();
}
// polymorphism
 class BookItem extends LibraryItem{
	 private String author;
	 
	 public BookItem(int id,String title,String author) {
		 super(id,title);
		 this.author=author;
	 }
	 @Override
	 public void displayInfo() {
		 System.out.println("Book Id :"+getId()+"title :"+getTitle()+"Auhtor :"+author);
		 
	 }
 }
 // inheritance & polymorphism
 
 class MagazineItem extends LibraryItem{
	 private String issueNumber;
	 
	 public MagazineItem(int id,String title,String issueNumber) {
		 super(id,title);
		 this.issueNumber=issueNumber;
	 }
	 
	 @Override
	 public void displayInfo() {
		 System.out.println("Magazine ID:"+getId() +"title :"+getTitle()+"issue Number :"+issueNumber);
	 }
 }
 // abstraction
 
 abstract class Library{
	 public abstract void addItem(LibraryItem item);
	 
	 public abstract void removeItem(LibraryItem item);
 }
 
 class PublicLibrary extends Library{
	 private List<LibraryItem>items=new ArrayList<>();
	 
	 @Override
	 public void addItem(LibraryItem item) {
		 items.add(item);
		 System.out.println("Item :"+item.getTitle()+"added to the libaray ");
	 }
	 
	 @Override
	 public void removeItem(LibraryItem item) {
		 items.remove(item);
		 System.out.println("Item :"+item.getTitle() +"removed from the libaray :");
	 }
	 public void displayItems() {
		 for(LibraryItem item:items) {
			 item.displayInfo();
		 }
	 }
 }
 public class LibarayManageMentSystem{
	 public static void main(String[] args) {
		 PublicLibrary library=new PublicLibrary();
		
		BookItem book1=new BookItem(1,"1984","george orwell");
		MagazineItem magazine1=new MagazineItem(2,"time","2024-09");
		
		
		library.addItem(book1);
		library.addItem(magazine1);
		
		library.displayItems();
		
		library.removeItem(book1);
		library.displayItems();
	}
 }
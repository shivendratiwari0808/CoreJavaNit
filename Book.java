package lab_practice;
import java.util.Objects;
public class Book {
	private int bookId;
	private String title;
	private String author;
	private int copies;
	
	public int getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies=copies;
	}
	public Book(int bookId,String title,String author,int copies) {
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.copies=copies;
	}
	@Override
	public String toString() {
		return "Library{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", copies=" + copies +
                '}';
	}
	@Override
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && copies == book.copies && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
	
}

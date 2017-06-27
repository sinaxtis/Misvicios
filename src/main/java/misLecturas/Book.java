package misLecturas;
import java.util.List;

public class Book {
	private String title;
	private List<Author> authors;
	private BookState bookState;
	private List<Genere> generes;
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public BookState getBookState() {
		return bookState;
	}
	public void setBookState(BookState bookState) {
		this.bookState = bookState;
	}
	public List<Genere> getGeneres() {
		return generes;
	}
	public void setGeneres(List<Genere> generes) {
		this.generes = generes;
	}
	
}

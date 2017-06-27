package misLecturas;

import java.util.List;


public class Author extends People{
	private List<Book> bookList;

	public List<Book> getBookList(){
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public Author(String name, String lastname, List<Book> bookList) {
		super(name, lastname);
		this.bookList = bookList;
	}

	public Author() {
		// TODO Auto-generated constructor stub
	}
	
}

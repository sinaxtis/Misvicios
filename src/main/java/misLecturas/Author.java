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
	
	public void addBookList(Book book){
		this.bookList.add(book);
	}

	public Author(String name, String lastname, List<Book> bookList) {
		super(name, lastname);
		this.bookList = bookList;
	}

	public Author(String name, String lastname) {
		super(name, lastname);
	}
	public String toString(){
		return this.getName().concat(" ").concat(getLastname());
	}
	public String getDatos(){
		return this.getName().concat(" ").concat(getLastname()).concat(", y sus libros son: ").concat(this.getBookList().toString());
	}
	
}

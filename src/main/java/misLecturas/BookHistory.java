package misLecturas;
import java.util.ArrayList;


public class BookHistory {
	private ArrayList<Book> books;

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	public BookHistory(ArrayList<Book> books){
		this.books = books;
	}
	public String toString(){
		return this.getBooks().toString();
	}
	public String librosLeidos(){
		ArrayList<Book> booksLeidos = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getBookState().getName().compareTo("Leido") == 0) {
				booksLeidos.add(book);
			}
		}
		return booksLeidos.toString();
	}
	public String librosPorLeer(){
		ArrayList<Book> booksLeidos = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getBookState().getName().compareTo("Por Leer") == 0) {
				booksLeidos.add(book);
			}
		}
		return booksLeidos.toString();
	}
	public String seleccionCola(){
		ArrayList<Book> booksLeidos = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getBookState().getName().compareTo("Por Leer") == 0) {
				booksLeidos.add(book);
			}
		}
		return booksLeidos.get(0).toString();
	}
	public String seleccionPila(){
		ArrayList<Book> booksLeidos = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getBookState().getName().compareTo("Por Leer") == 0) {
				booksLeidos.add(book);
			}
		}
		int index = booksLeidos.size()-1;
		return booksLeidos.get(index).toString();
	}
	public int duracionTotal(int j){
		int duracion;
		if (j > 0){
			duracion = this.getBooks().get(j).getDuracion() + duracionTotal(j-1);
		}
		else{
			return duracion = this.getBooks().get(j).getDuracion();
		}
		return duracion;
	}
	
}

package misLecturas;


public class Book {
	private String title;
	private Author author;
	private BookState bookState;
	private Genere genere;
	private int duracion;
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public BookState getBookState() {
		return bookState;
	}
	public void setBookState(BookState bookState) {
		this.bookState = bookState;
	}
	public Genere getGenere() {
		return genere;
	}
	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	public String toString(){
		return this.getTitle();
	}
	public Book(String title, Author author, BookState bookState, Genere genere, int duracion){
		this.title = title;
		this.author = author;
		this.bookState = bookState;
		this.genere = genere;
		this.duracion = duracion;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}

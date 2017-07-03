package misLecturas;

public class Users extends People{
	private String username;
	private BookHistory bookList;
	public Users(String username, String name, String lastname){
		super(name, lastname);
		this.setUsername(username);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDatos(){
		return this.getName().concat(" ").concat(this.getLastname()).concat(" tiene el usuario: ").concat(getUsername());
	}
	public BookHistory getBookList() {
		return bookList;
	}
	public void setBookList(BookHistory bookList) {
		this.bookList = bookList;
	}
}

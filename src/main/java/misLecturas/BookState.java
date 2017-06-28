package misLecturas;

public class BookState {
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BookState(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		return this.getName();
	}
}

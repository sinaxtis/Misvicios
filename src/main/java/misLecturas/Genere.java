package misLecturas;

public class Genere {
	private int id;
	private String nameGenere;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameGenere() {
		return nameGenere;
	}
	public void setNameGenere(String nameGenere) {
		this.nameGenere = nameGenere;
	}
	public Genere(int id, String nameGenere) {
		this.id = id;
		this.nameGenere = nameGenere;
	}
	
}

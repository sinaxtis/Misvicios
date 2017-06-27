package misLecturas;

public abstract class People {
	private String name, lastname;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public People(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;
	}
	
}

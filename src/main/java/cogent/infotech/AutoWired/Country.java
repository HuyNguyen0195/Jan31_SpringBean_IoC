package cogent.infotech.AutoWired;

public class Country {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

package cogent.infotech.AutoWired;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	int id;
	String name;
	int age;
	
	@Autowired
	Country country;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int age, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country.toString() + "]";
	}
	
}

package cogent.infotech.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonBean {
	
	@Bean(name="per")
	public Person getPerson() {
		Person person=new Person();
		person.setId(1001);
		person.setName("philip");
		person.setAge(20);
		return person;
	}
}

package cogent.infotech.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBean {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(PersonBean.class);
		Person p=context.getBean("per",Person.class);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}

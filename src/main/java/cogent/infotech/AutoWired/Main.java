package cogent.infotech.AutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/beans.xml");
		Person p=context.getBean("personWired",Person.class);
		System.out.println(p.toString());
	}
}

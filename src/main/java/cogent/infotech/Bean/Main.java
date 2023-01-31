package cogent.infotech.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/beans.xml");
		Greeting gr=ctx.getBean("greeting",Greeting.class);
		gr.message();
		Person p=ctx.getBean("person",Person.class);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}

package cogent.infotech.ProductBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		ApplicationContext context=new AnnotationConfigApplicationContext(ProductBean.class);
		Product p=context.getBean("product",Product.class);
		System.out.println(p.getProductId());
		System.out.println(p.getProductName());
		System.out.println(p.getProductPrice());
	}
}

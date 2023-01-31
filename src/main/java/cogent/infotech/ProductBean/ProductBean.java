package cogent.infotech.ProductBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductBean {
	
	@Bean(name="product")
	public Product getProduct() {
		Product product=new Product();
		product.setProductId(1111);
		product.setProductName("honda");
		product.setProductPrice(222);
		return product;
	}
}

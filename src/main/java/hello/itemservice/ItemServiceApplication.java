package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	/* Spring 이 직접 해준다.
	 * @Bean
	 * public MessageSource messageSource() {
	 *  ResourceBundleMessageSource messageSource = new
	 * ResourceBundleMessageSource();
	 *  messageSource.setBasenames("messages", "errors");
	 *  messageSource.setDefaultEncoding("utf-8");
	 *  return messageSource;
	 * }
	 */

}

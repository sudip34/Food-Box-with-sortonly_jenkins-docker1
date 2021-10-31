package kitchenstory.kitchenstory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class KitchenStoryWebApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(KitchenStoryWebApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JarToWarApp.class);
	}

}

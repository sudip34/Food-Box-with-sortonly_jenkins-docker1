package kitchenstory.kitchenstory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KitchenStoryWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(KitchenStoryWebApplication.class, args);
	}
	@Override
   	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        	return builder.sources(KitchenStoryWebApplication.class);
    	}

}

package ninja.bombardelli.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ninja.bombardelli.controller"})
@EntityScan({"ninja.bombardelli.model.entity"})
//@EnableJpaRepositories("br.com.imagetec.astar.crudrepositories")
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

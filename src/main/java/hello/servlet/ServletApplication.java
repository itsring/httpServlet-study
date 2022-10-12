package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

	// spring부트가 해주기 때문에 작성할 필요 없음
//	@Bean
//	InternalResourceViewResolver internalResourceViewResolver(){
//		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
//	}
}

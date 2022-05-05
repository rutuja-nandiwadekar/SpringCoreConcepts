package com.example.springcoreconcepts;


import com.example.springcoreconcepts.components.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static final Logger logger = (Logger) LoggerFactory.getLogger(SpringCoreConceptsApplication.class);


	public static void main(String[] args) {
		logger.error("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.error("Demo Bean = "+demoBean.toString());
		HelloRestController controller = context.getBean(HelloRestController.class);
		logger.error("HelloRestController = "+controller.toString());
	}
}
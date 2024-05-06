package io.datajek.spring.basics.movierecommendersystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import java.util.Arrays;
@SpringBootApplication
/**
 * @SpringBootApplication is an equivalent of 
 * @Configuration, which declares a class as the source for bean definitions
 * @EnableAutoConfiguration, which allows the application to add beans using classpath definitions
 * @ComponentScan, which directs Spring to search for components in the path specified
 */
public class MovieRecommenderSystemApplication {
	private static Logger logger = LoggerFactory.getLogger(MovieRecommenderSystemApplication.class);
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		logger.info(Arrays.toString(recommender.recommendMovies("Finding Dory")));
	}

}

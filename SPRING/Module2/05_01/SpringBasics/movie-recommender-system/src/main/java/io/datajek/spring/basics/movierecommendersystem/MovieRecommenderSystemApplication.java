package io.datajek.spring.basics.movierecommendersystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
@SpringBootApplication
public class MovieRecommenderSystemApplication {
	private static Logger logger = LoggerFactory.getLogger(MovieRecommenderSystemApplication.class);
	public static void main(String[] args) {
		Filter contentBasedFilter = new ContentBasedFilter();
		Filter collabFilter = new CollaborativeFilter();
		RecommenderImplementation recommender = new RecommenderImplementation(contentBasedFilter);	
		RecommenderImplementation recommender2 = new RecommenderImplementation(collabFilter);	

    	String[] result = recommender.recommendMovies("Finding Dory");
		String[] result2 = recommender2.recommendMovies("Finding Dory");
    	logger.info(Arrays.toString(result));
		logger.info(Arrays.toString(result2));

	}

}

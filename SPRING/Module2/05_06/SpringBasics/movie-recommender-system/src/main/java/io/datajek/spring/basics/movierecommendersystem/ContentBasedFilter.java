package io.datajek.spring.basics.movierecommendersystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("ContentBasedFilter")
public class ContentBasedFilter implements Filter {
	private static Logger logger = LoggerFactory.getLogger(ContentBasedFilter.class);
    @Override
    public String[] getRecommendations(String movie) {
            logger.info("Inside ContentBasedFilter");
          return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}

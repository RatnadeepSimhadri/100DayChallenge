package io.datajek.spring.basics.movierecommendersystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("CollaborativeFilter")
public class CollaborativeFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(ContentBasedFilter.class);

    @Override
    public String[] getRecommendations(String movie) {
        logger.info("Inside Collaborative Filter");
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}

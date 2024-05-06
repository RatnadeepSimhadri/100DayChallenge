package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    
    @Autowired
    private Filter contentBasedFilter;

    public String[] recommendMovies(String movie){
        return contentBasedFilter.getRecommendations(movie);
    }
}

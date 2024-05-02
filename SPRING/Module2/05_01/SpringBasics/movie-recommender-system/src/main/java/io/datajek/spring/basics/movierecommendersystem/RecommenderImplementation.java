package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    
    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter){
        this.filter = filter;
    }
    public String[] recommendMovies(String movie){
        return filter.getRecommendations(movie);
    }
}

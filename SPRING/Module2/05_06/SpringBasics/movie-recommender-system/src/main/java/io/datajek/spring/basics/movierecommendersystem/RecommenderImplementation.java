package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    
    /**
     * This is because @Autowired annotation tries to resolve dependency by type first. 
     * If it fails to resolve a conflict and finds more than one bean of the same 
     * type then it tries to resolve it by name.
     */


    @Autowired
    /**
     * 
     * The @Qualifier annotation takes precedence over the @Primary annotation. 
     */
    @Qualifier("CollaborativeFilter")
    private Filter filter;

    public String[] recommendMovies(String movie){
        return filter.getRecommendations(movie);
    }
}

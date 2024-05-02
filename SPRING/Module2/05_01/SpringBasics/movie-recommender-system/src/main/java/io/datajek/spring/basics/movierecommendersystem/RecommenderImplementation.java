package io.datajek.spring.basics.movierecommendersystem;

public class RecommenderImplementation {
    private Filter filter;

    public RecommenderImplementation(Filter filter){
        this.filter = filter;
    }
    public String[] recommendMovies(String movie){
        return filter.getRecommendations(movie);
    }
}

package io.datajek.spring.basics.movierecommendersystem;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie){
        ContentBasedFilter filter = new ContentBasedFilter();
        return filter.recommend(movie);
    }
}

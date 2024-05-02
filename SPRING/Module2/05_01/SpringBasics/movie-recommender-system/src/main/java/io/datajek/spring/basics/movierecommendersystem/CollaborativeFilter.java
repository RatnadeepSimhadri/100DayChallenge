package io.datajek.spring.basics.movierecommendersystem;

public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}

package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
    FilterInterface filter;
    public RecommenderImplementation(FilterInterface filterInterface) {
        this.filter = filterInterface;
    }

    public String[] recommendMovies(String movie){
        //use content based filters
       // return new String[]{"Iron Man", "Avengers End Game"};
        return filter.getRecommendations(movie);
    }

}

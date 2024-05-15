package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {

    public String[] recommendMovies(String movie){
        //use content based filters
       // return new String[]{"Iron Man", "Avengers End Game"};
        ContentBasedFilter filter = new ContentBasedFilter();
        return filter.getRecommendations(movie);
    }

}

package io.datajek.spring.basics.movierecommendersystem.lesson5;

//import io.datajek.spring.basics.movierecommendersystem.lesson2.FilterInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private FilterInterface contentBasedFilter;

    /*
    public RecommenderImplementation(FilterInterface filterInterface) {
        this.contentBasedFilter = filterInterface;
    }
    */


    public String[] recommendMovies(String movie){
        //use content based filters
       // return new String[]{"Iron Man", "Avengers End Game"};
        return contentBasedFilter.getRecommendations(movie);
    }

}

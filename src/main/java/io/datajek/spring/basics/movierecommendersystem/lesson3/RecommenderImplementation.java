package io.datajek.spring.basics.movierecommendersystem.lesson3;

import io.datajek.spring.basics.movierecommendersystem.lesson2.FilterInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

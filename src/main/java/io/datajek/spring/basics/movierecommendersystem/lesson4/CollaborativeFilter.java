package io.datajek.spring.basics.movierecommendersystem.lesson4;

import io.datajek.spring.basics.movierecommendersystem.lesson2.FilterInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements FilterInterface {

    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[]{"Iron Man", "Avengers End Game", "Collaborative Filter"};
    }
}

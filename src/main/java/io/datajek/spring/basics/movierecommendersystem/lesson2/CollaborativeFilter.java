package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class CollaborativeFilter implements FilterInterface{
    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[]{"Iron Man", "Avengers End Game", "Collaborative Filter"};
    }
}

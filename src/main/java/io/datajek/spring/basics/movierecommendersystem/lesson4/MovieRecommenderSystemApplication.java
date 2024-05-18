package io.datajek.spring.basics.movierecommendersystem.lesson4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//RecommenderImplementation recommenderImplementation = new RecommenderImplementation(new CollaborativeFilter());
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class);
		RecommenderImplementation recommenderImplementation = appContext.getBean(RecommenderImplementation.class);
		String[] movies = recommenderImplementation.recommendMovies("Thor");
		System.out.println(Arrays.toString(movies));
	}

}

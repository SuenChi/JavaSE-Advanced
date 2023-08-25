package com.suenchi._03Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public class Demo3 {
    public static void main(String[] args) {
        Collection<Movie> movieCollection = new ArrayList<>();
        movieCollection.add(new Movie("肖申克的救赎", "弗兰克·德拉邦特", "蒂姆·罗宾斯", "1994", "美国", "犯罪/剧情", 9.7));
        movieCollection.add(new Movie("再见,我的妾", "陈凯歌", "张国荣", "1993", "中国", "剧情/爱情/同性", 9.6));
        movieCollection.add(new Movie("阿甘正传", "罗伯特·泽米吉斯", "汤姆·汉克斯", "1994", "美国", "剧情/爱情", 9.5));
        System.out.println("==================================================================迭代器(开始)==================================================================");
        Iterator<Movie> it = movieCollection.iterator();
        while (it.hasNext()) {
            Movie movie = it.next();
            System.out.println(movie);
        }
        System.out.println("==================================================================迭代器(结束)==================================================================");
        System.out.println("==================================================================增强for(开始)==================================================================");
        for (Movie movie : movieCollection) {
            System.out.println(movie);
        }
        System.out.println("==================================================================增强for(结束)==================================================================");
        System.out.println("==================================================================forEach(开始)==================================================================");
        movieCollection.forEach(new Consumer<Movie>() {
            @Override
            public void accept(Movie movie) {
                System.out.println(movie);
            }
        });
        System.out.println("==================================================================forEach(结束)==================================================================");

    }
}


class Movie {
    private String name;
    private String director;
    private String actor;
    private String time;
    private String country;
    private String category;
    private Double score;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                ", time='" + time + '\'' +
                ", country='" + country + '\'' +
                ", category='" + category + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) && Objects.equals(director, movie.director) && Objects.equals(actor, movie.actor) && Objects.equals(time, movie.time) && Objects.equals(country, movie.country) && Objects.equals(category, movie.category) && Objects.equals(score, movie.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, director, actor, time, country, category, score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Movie(String name, String director, String actor, String time, String country, String category, Double score) {
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.time = time;
        this.country = country;
        this.category = category;
        this.score = score;
    }

    public Movie() {
    }
}
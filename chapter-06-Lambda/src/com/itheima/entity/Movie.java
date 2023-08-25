package com.itheima.entity;

/**
 * PROJECT_NAME: advanced-415
 * NAME: Movie
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/19
 */
public class Movie {
    private String name; //电影名称
    private String director; //导演名称
    private String actor; //演员名称
    private String time; //上市年份
    private String country; //上市国家
    private String category; //电影分类
    private Double score; //评分

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

        if (name != null ? !name.equals(movie.name) : movie.name != null) return false;
        if (director != null ? !director.equals(movie.director) : movie.director != null) return false;
        if (actor != null ? !actor.equals(movie.actor) : movie.actor != null) return false;
        if (time != null ? !time.equals(movie.time) : movie.time != null) return false;
        if (country != null ? !country.equals(movie.country) : movie.country != null) return false;
        if (category != null ? !category.equals(movie.category) : movie.category != null) return false;
        return score != null ? score.equals(movie.score) : movie.score == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (actor != null ? actor.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
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

    public Movie() {
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
}

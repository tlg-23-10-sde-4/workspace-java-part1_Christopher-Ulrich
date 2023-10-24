package net.flix.client;

import net.flix.Movie;

class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Akira");     // calls first constructor method; all values must be set here
        // movie1.setTitle("Akira");                removed because there is no longer a default constructor type
        movie1.setReleaseYear(1988);
        movie1.setRevenue(240_000_000.0);
        movie1.setRating(Rating.R);
        System.out.println(movie1);     // toString() automatically called

        Movie movie2 = new Movie("Iron Man", 2008, 29_000_000_000.0, Rating.PG_13);   // calls second constructor method
        movie2.setTitle("Iron Man 2");           //This will overwrite the title set within the parentheses
        System.out.println(movie2);

        Movie movie3 = new Movie("Jay2Jay", Genre.COMEDY);    // Calls third constructor method; two fields are set to default
        System.out.println(movie3);
    }
}
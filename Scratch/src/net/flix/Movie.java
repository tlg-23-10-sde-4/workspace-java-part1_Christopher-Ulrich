package net.flix;

public class Movie {
    // fields or instances variables come first (aka properties or attributes

    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;

    // Constructors - how the client side creates objects
    // Normally ordered from smallest to largest

    public Movie(String title) {
        setTitle(title);        // Delegate validation/conversion to the setter
    }

    public Movie(String title, Genre genre) {
        this(title);                    // delegates fetching title to the single-argument ctor
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear) {
        this(title);                    // delegates fetching title to the single-argument ctor
        setReleaseYear(releaseYear);
    }

    public Movie(String title, Integer releaseYear, Double revenue) {
        this(title, releaseYear);                    // delegates fetching title to the single-argument ctor
        setRevenue(revenue);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating) {
        this(title, releaseYear, revenue);
        setRating(rating);
    }

    // Methods - business or action or functions

    // Access control - getter and setters
    private Object getGenre() {
        return revenue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }
    public void setRating(Rating rating) {
        this.rating = rating;
    }

    // toString
    /*
     * This is what the generated toString looks like:
     *
     * @Override
     *    public String toString() {
     *        return "Movie{" +
     *                "title='" + title + '\'' +
     *                ", releaseYear=" + releaseYear +
     *                ", revenue=" + revenue +
     *                '}';
     */
    public String toString() {
        // TODO: get this right, so that if revenue is null, you use %s, and if not, go with %, .2f

        return String.format("Movie: title=%s, releaseYear=%s, revenue=%s, rating=%s, genre=%s",
        getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
//        return "Movie: title= " + getTitle() +
//                ", releaseYear= " + getReleaseYear() +
//                ", revenue= " + getRevenue();
    }




}
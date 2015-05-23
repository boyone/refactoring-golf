package movierental.refactotring11;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    double getCharge() {
        return movie.getCharge(getDaysRented());
    }

    int getFrequentRenterPoints() {
        // add bonus for a two day new release rental
        if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1)
            return 2;
        return 1;
    }
}

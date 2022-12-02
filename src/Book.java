public class Book extends Product{
    private double price;
    private double rating;

    public Book(double price, double rating) {
        this.price = price;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", rating=" + rating +
                '}';
    }
}

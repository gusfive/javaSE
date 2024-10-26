package Q_CollectionFramework;

public class Movie {
    private String name;
    private double price;
    private String actor;

    public Movie() {
    }

    public Movie(String name, double price, String actor) {
        this.name = name;
        this.price = price;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", actor='" + actor + '\'' +
                '}';
    }
}

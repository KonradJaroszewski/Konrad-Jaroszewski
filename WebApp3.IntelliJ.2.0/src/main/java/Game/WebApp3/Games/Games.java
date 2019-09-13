package Game.WebApp3.Games;
public class Games {
    private String Title;
    private String Developer;
    private Integer ReleaseDate;
    private String Engine;
    private String Type;
    private Double Price;

    public Games() {
    }

    public Games(String title,String developer, Integer releaseDate, String engine, String type, Double price) {
        Title = title;
        Developer = developer;
        ReleaseDate = releaseDate;
        Engine = engine;
        Type = type;
        Price = price;

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDeveloper() {
        return Developer;
    }

    public void setDeveloper(String developer) {
        Developer = developer;
    }

    public Integer getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
}

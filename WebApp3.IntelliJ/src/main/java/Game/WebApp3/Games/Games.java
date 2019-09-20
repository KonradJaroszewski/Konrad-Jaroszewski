package Game.WebApp3.Games;

import javax.persistence.*;

public class Games {
    private int id;
    private String Title;
    private String Developer;
    private Integer ReleaseDate;
    private String Engine;
    private String Type;
    private Double Price;
@Entity
@Table(name="Games")
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
    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public int getId() {
        return id;
    }
    @Column(name = "Title",nullable = false)
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
    @Column(name = "Developer",nullable = false)
    public String getDeveloper() {
        return Developer;
    }

    public void setDeveloper(String developer) {
        Developer = developer;
    }
    @Column(name = "ReleaseDate",nullable = false)
    public Integer getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        ReleaseDate = releaseDate;
    }
    @Column(name = "Engine",nullable = false)
    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }
    @Column(name = "Type",nullable = false)
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
    @Column(name = "Price",nullable = false)
    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString(){
        return "Game[id="+id+"Title="+Title+"Developer="+Developer+"Release Date="+ReleaseDate+"Engine="+Engine+"Type="+Type+"]";
    }
}

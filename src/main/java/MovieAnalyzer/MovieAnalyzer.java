package MovieAnalyzer;

public class MovieAnalyzer {
    private String name, genre, director;
    private double rating;
    private int length;
    private double genrecount;

    public MovieAnalyzer(String n, String g, String d, double r, int l){
        this.name = n;
        this.genre = g;
        this.director = d;
        this.rating = r;
        this.length = l;
        this.genrecount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getGenrecount() {
        return genrecount;
    }

    public void addGenrecount(double add) {
        this.genrecount += add;
    }

    public double getRatio(){
        return rating/length;
    }
}

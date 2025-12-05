public class Movie {
    private int ID;
    private String title;
    private int releaseYear;
    private String rating;



// CONSTRUCTOR, GETTERS AND SETTERS
    public Movie(int ID, String title, int releaseYear, String rating) {
        this.ID = ID;
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating='" + rating + '\'' +
                '}';
    }

    static void test(){
        System.out.println("test");
    }
}

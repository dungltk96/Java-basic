package exercise.lab_07;

public class BookInformation {
    private String authorName;
    private String year;

    public BookInformation() {
    }

    public BookInformation( String authorName, String year) {
        this.authorName = authorName;
        this.year = year;
    }

    @Override
    public String toString() {
        return "BookInformation{" +
                "authorName='" + authorName + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

public class Book {

    public static void main(String[] args) {


    }

    private String summary;
    private int numberOfPages;




    public Book(String summary, int numberOfPages) {
        this.summary = summary;
        this.numberOfPages = numberOfPages;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}

package guevara.com;

public class Record {

    private final String title;
    private final int price;
    private String content;

    public Record(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getContent() {
        return content;
    }
}

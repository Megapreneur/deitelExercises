package Assignments;

public class Entry {
    private String title;
    private String date;
    private String body;
    public Entry(String title, String date, String body) {
        this.title = title;
        this.date = date;
        this.body = body;
    }
    public String getTitle() {return title;}
    public String getDate() {
        return date;
    }
    public String getBody() {
        return body;
    }
}

package Assignments;

import java.util.ArrayList;

public class Diary {
    private String name;
    private String password;
    private ArrayList<Entry> entries;
    private String Title;
    private String Date;
    private String Body;

    public Diary(String name, String password) {
        this.name = name;
        this.password = password;
        entries = new ArrayList<>();
    }
    public Diary(){
        entries = new ArrayList<>();

    }
    public void createEntry(String Title, String Date, String Body) {
        Entry entry = new Entry(Title,Date,Body);
        entries.add(entry);
    }
    public int getNumberOfEntry() {
        return entries.size();
    }
    public int findEntryByTitle(String Title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if(entry.getTitle().equals(Title)){
                return i + 1;
            }
        }
        return -8 ;
    }
    public int findEntryByDate(String Date) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getDate().equals(Date)){
                return i + 1;
            }
        }
        return -8;
    }
    public void deleteEntryByTitle(String Title) {
        entries.remove(findEntryByTitle(Title) - 1);
    }
    public void deleteEntryByDate(String Date) {
        entries.remove(findEntryByDate(Date) - 1);
    }
    public void deleteAllEntry(String password) {
        this.password = password;
        entries.removeAll(entries);
    }
    @Override
    public String toString(){


        return "your name is "+ name;
    }
}


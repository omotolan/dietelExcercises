package Chapter7;

import Assignment.Entry;

import java.util.ArrayList;

public class Diary {
    private ArrayList<Entry> entries;
    private String name;
    private String password;

    private boolean isLock;

    public Diary(String name, String password) {
        this.name = name;
        this.password = password;
        entries = new ArrayList<Entry>();
    }

    public void isLock(String password) {
        if (this.password.equals(password)) {
            isLock = true;
        } else {
            isLock = false;
            System.out.println("Wrong password.");
        }
    }

    public void createEntry(String title, String date, String body) {
        Entry diaryEntry = new Entry(title, date, body);
        entries.add(diaryEntry);
    }

    public int getNoOfEntry() {
        return entries.size();
    }

    public int findEntry(String title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(title)) {
                System.out.println("Entry " + title + " found at position " + (i + 1));
                return (i + 1);
            }

        }
        System.out.println("Entry not found.");
        return -1;


    }

    public void deleteEntry(String titleOfEntry) {
        entries.remove(findEntry(titleOfEntry) - 1);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deleteAllEntry(String password) {
        if (this.password.equals(password)) {
            entries.removeAll(entries);
        } else {
            System.out.println("Action can't be completed cause password is incorrect.");
        }
    }
}

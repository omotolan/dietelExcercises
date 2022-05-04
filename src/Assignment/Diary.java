 package Assignment;

import java.util.ArrayList;

public class Diary {
    private ArrayList<Entry> entries;
    private String name;
    private String password;

    public Diary(String name, String password) {
        this.name = name;
        this.password = password;
        entries = new ArrayList<Entry>();
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
                return (i + 1);
            }
        }
        return -1;
    }

    public void deleteEntry(int indexNumber, String password) {
        if (password.equals(this.password)) {
            entries.remove(indexNumber);
        } else {
            System.out.println("You can't delete entry cause password is incorrect");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

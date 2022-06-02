package Chapter7;

import java.util.ArrayList;
import java.util.Calendar;

public class

Diary {
    private ArrayList<Entry> entries;
    private String name;
    private String password;
    private boolean isValidatePassword;

    Calendar calendar = Calendar.getInstance();


    private boolean isLock;

    public Diary(String name, String password) {
        this.name = name;
        this.password = password;
        entries = new ArrayList<Entry>();
    }

    public void lock() {
        isLock = true;
    }

    public void unLock(String password) {
        if (this.password.equals(password)) {
            isLock = false;
        }
    }

    public boolean isLock() {
        return isLock;
    }

    public void createEntry(String title, String body) {
        Entry diaryEntry = new Entry(title, body);
        entries.add(diaryEntry);
    }

    public int getNoOfEntry() {
        return entries.size();
    }

    public int findEntry(String title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(title)) {
                System.out.println("Entry " + title + " created on " + calendar.getTime() + " found at position " + (i + 1));
                return (i + 1);
            }

        }
        System.out.println("Entry not found.");
        return -1;


    }

    public void deleteEntry(String titleOfEntry) {
        entries.remove(findEntry(titleOfEntry) - 1);
//        int indexOfEntry = entries.indexOf(titleOfEntry);
//        entries.remove(indexOfEntry);
//        entries.remove(titleOfEntry);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void deleteAllEntry(String password) {
        if (this.password.equals(password)) {
            entries.clear();
        } else {
            System.out.println("Action can't be completed cause password is incorrect.");
        }
    }

    public void updatePassword(String oldPassword, String newPassword) {
        if (password.equals(oldPassword)) {
            password = newPassword;
            System.out.println("Password successfully changed.");
        } else {
            System.out.println("Password can not be changed cause old password is wrong.");
        }

    }
    public boolean validatePassword(String password){
        if (this.password.equals(password)){
            isValidatePassword = true;
        }
        return isValidatePassword;
    }
}

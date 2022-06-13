package Chapter8;

public enum Cards {
    MASTER_CARD("5444", 4),
    VISA("234", 2),
    VERVE("189", 1),
    DOLLAR("789", 6);

    private final String number;
    private final int yearOfValidity;

    Cards(String number, int yearOfValidity) {
        this.number = number;
        this.yearOfValidity = yearOfValidity;
    }

    public String getNumber() {
        return number;
    }

    public int getYearOfValidity() {
        return yearOfValidity;
    }
}

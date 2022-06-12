package Chapter8;

public enum Region {
    NE("Ajegunle", "Ikeja", "Abuja"),

    SE("VI", "BI", "yaba"),

    SW("Mushin", "Ketu", "Okoko", "Ipaja"),

    NC("Ibadan", "Ekiti ", "Ijebu"),

    SS("sabo", "bariga", "somolu"),

    NW("Challenge", "Molete", "Mowe");

    private String[] states;

    Region(String... states) {
        this.states = states;
    }
}


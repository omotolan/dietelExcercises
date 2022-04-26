package Chapter8;

public class Region {
    NE("Ajegunle","Ikeja","Abuja"),

    SE("VI","BI"),

    SW("Mushin","Ketu","Okoko","Ipaja"),

    NC("Ibadan","Ekiti ","Ijebu"),

    SS("sabo","bariga","somolu"),

    NW("Challenge","Molete","Mowe");

    private String[] states;

    Region(String... states) {
        this.states = states;
    }
}


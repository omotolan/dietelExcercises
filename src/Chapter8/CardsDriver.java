package Chapter8;

public class CardsDriver {
    public static void main(String[] args) {
        for (Cards card : Cards.values()) {
            System.out.println(card.getYearOfValidity() + " " + card.getNumber());
        }
        System.out.println(Cards.MASTER_CARD.getYearOfValidity());
    }
}

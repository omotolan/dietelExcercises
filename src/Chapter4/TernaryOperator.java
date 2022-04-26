package Chapter4;

public class TernaryOperator {
    public static void main(String[] args) {
        String result = evenNumber(57);
        System.out.println(result);
    }
    public static boolean oddNumber(int number){
       boolean result =  (number % 2 == 0) ? true : false;
       return result;
    }
    public static String evenNumber(int number){
        String result =  (number % 2 == 1) ? "true" : "false";
        return result;
    }
}

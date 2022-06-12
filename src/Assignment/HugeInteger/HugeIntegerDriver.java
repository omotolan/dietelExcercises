package Assignment.HugeInteger;

public class HugeIntegerDriver {
    public static void main(String[] args) throws ValueLengthGreaterThanForty, NotAnIntegerException {

        String firstString = "4294567897123856789692345671931834567899";
        String secondString = "1234567892123456789512345678931234567892";
        String thirdString = "1111111111111111111111111111111111111111";
        String forthString = "0000007890123856789692345671901834567899";
        String fifthString = "1234567890123456789012345678901234567890";

        HugeInteger hugeInteger = new HugeInteger(firstString);
        HugeInteger hugeInteger1 = new HugeInteger(secondString);
        HugeInteger hugeInteger2 = hugeInteger.add(hugeInteger1);
        System.out.println("sum of firstString and secondString is: " + hugeInteger2);
        System.out.println();

        hugeInteger2 = hugeInteger.subtract(hugeInteger1);
        System.out.println("difference between firstString and secondString is: " + hugeInteger2);
        System.out.println();

        boolean result = hugeInteger.isEqualTo(hugeInteger1);
        System.out.println("is firstString equal to secondString? " + result);
        System.out.println();

        result= hugeInteger.isGreaterThan(hugeInteger1);
        System.out.println("is firstString greater to secondString? " + result);
        System.out.println();

        result= hugeInteger.isLessThan(hugeInteger1);
        System.out.println(hugeInteger);
        System.out.println(hugeInteger1);
        System.out.println("is firstString less to secondString? " + result);
        System.out.println();


        result= hugeInteger.isGreaterThanOrEqualTo(hugeInteger1);
        System.out.println("is firstString greaterThanOrEqual to secondString? " + result);
        System.out.println();

        result= hugeInteger1.isGreaterThan(hugeInteger);
        System.out.println("is secondString greater to firstString? " + result);
        System.out.println();

        result= hugeInteger1.isLessThan(hugeInteger);
        System.out.println("is secondString less to firstString? " + result);
        System.out.println();

HugeInteger hugeInteger3 = new HugeInteger(thirdString);
HugeInteger hugeInteger4 = new HugeInteger(forthString);
result = hugeInteger3.isLessThan(hugeInteger4);
        System.out.println(result);

    }
}

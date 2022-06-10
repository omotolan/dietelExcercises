package Assignment;

import java.math.BigInteger;

public class HugeIntegerDriver {
    public static void main(String[] args) throws HugeIntegerSample.NotAnIntegerException {
        // String num = "1234567890123456789012345678901234567890";

        //  String n = "0000007890123856789692345671901834567899";
//        String firstString = "4294567897123856789692345671931834567899";
//        String secondString = "1234567892123456789512345678931234567892";
        HugeIntegerSample hugeIntegerSample = new HugeIntegerSample();
        BigInteger bigInteger = new BigInteger("4294567897123856789692345671931834567899");
        BigInteger bigInteger2 = new BigInteger("1234567892123456789512345678931234567892");

        BigInteger bigInteger3 = bigInteger.add(bigInteger2);
        System.out.println(bigInteger3);

        BigInteger bigInteger4 = bigInteger.subtract(bigInteger2);
        System.out.println(bigInteger4);
    }
}
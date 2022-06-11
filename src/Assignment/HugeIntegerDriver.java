package Assignment;

import java.math.BigInteger;

public class HugeIntegerDriver {
    public static void main(String[] args) throws HugeIntegerSample.NotAnIntegerException {
        // String num = "1234567890123456789012345678901234567890";

        //  String n = "0000007890123856789692345671901834567899";
//        String firstString = "4294567897123856789692345671931834567899";
//        String secondString = "1234567892123456789512345678931234567892";
        HugeIntegerSample hugeIntegerSample = new HugeIntegerSample();
        BigInteger bigInteger = new BigInteger("1111111111111111111111111111111111111111");
        BigInteger bigInteger2 = new BigInteger("1111111111111111111111111111111111111111");

        BigInteger bigInteger3 = bigInteger.add(bigInteger2);
        System.out.println(bigInteger3);

        BigInteger bigInteger4 = bigInteger.subtract(bigInteger2);
        System.out.println(bigInteger4);
        bigInteger.equals(bigInteger4);
       bigInteger3 = bigInteger.multiply(bigInteger2);
        System.out.println(bigInteger3);


    }
}

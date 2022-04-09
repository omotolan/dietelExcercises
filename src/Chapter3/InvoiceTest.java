package Chapter3;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("6236", "fender", 0, 0.0);

        // checking the assigned constructor values
        System.out.println(invoice.getAmount(4));
        System.out.println(invoice.getPartDescription());
        System.out.println(invoice.getPartNumber());
        System.out.println(invoice.getPricePerItem());

        // using set and get method
        System.out.println("----------setting values------------");
        invoice.setPartDescription("fender for toyota");
        System.out.println(invoice.getPartDescription());
        invoice.setPartNumber("1234");
        System.out.println(invoice.getPartNumber());
        invoice.setPricePerItem(200);
        System.out.println(invoice.getPricePerItem());

        // using the get invoice amount method
        invoice.getAmount(5);
        System.out.println( invoice.getAmount(5));
        // to check for the if condition
        invoice.getAmount(5);
        System.out.println( invoice.getAmount(0));



    }
}

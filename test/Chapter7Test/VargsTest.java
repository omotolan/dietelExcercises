package Chapter7Test;

import Chapter7.Vargs;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class VargsTest {

    Vargs vargs = new Vargs();

    @Test
    void testAdd() {
        int result = vargs.add(12, 34, 65, 78, 4, 76, 32, 10, 81, 45, 34, 43);
        assertEquals(2, result);
    }

    @Test
    void decimalTest() {
        BigDecimal money = new BigDecimal("2343454634454.89");
        DecimalFormat formatter = new DecimalFormat();
        formatter.setGroupingUsed(true);
        formatter.setGroupingSize(4);
        System.out.println(formatter.format(money));
    }

    @Test
    void dateTest() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, M-dd-yyyy hh:mm:s a");
        System.out.println(dateTimeFormatter.format(time));
    }

}
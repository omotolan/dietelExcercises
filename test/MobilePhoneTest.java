import Chapter7.MobilePhone;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MobilePhoneTest {
    @Test
    public void mobilePhoneCanBeCreatedTest(){
        MobilePhone myPhone = new MobilePhone("1234");
        assertNotNull(myPhone);
    }
    @Test
    public void addContactTest(){
        MobilePhone myPhone = new MobilePhone("1234");
        myPhone.createContact("tolani", "1234");


    }
}

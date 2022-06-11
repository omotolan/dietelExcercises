package Chapter7Test;

import Chapter7.Phon.MobilePhone;
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

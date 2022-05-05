package Chapter7Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CookingList {
    private Chapter7.CookingList cookingList;

    @BeforeEach
    public void startWith() {
        cookingList = new Chapter7.CookingList();
    }

    @Test
    public void cookingListCanBeCreatedTest() {
        assertNotNull(cookingList);
    }

    @Test
    public void itemsCanBeAddedTest() {
        assertEquals(0, cookingList.listSize());
        cookingList.addItemToList("maggie");
        cookingList.addItemToList("salt");
        cookingList.addItemToList("rice");
        assertEquals(3, cookingList.listSize());
    }
    @Test
    public void itemsCanBeRemovedTest(){
        assertEquals(0, cookingList.listSize());
        cookingList.addItemToList("maggie");
        cookingList.addItemToList("salt");
        cookingList.addItemToList("rice");
        cookingList.removeItemFromList("salt");
        assertEquals(2, cookingList.listSize());

    }
    @Test
    public void modifyListTest(){
        assertEquals(0, cookingList.listSize());
        cookingList.addItemToList("maggie");
        cookingList.addItemToList("salt");
        cookingList.addItemToList("rice");
        cookingList.modifyList(1,"beans");
        cookingList.searchItemInList("beans");
        //assertEquals("rice", cookingList.searchItemInList("salt"));
       // assertEquals(2, cookingList.listSize());

    }
    @Test
    public void clearListTest(){
        assertEquals(0, cookingList.listSize());
        cookingList.addItemToList("maggie");
        cookingList.addItemToList("salt");
        cookingList.addItemToList("rice");
        cookingList.clearList();
        assertEquals(0, cookingList.listSize());
    }

}

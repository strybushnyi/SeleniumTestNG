package JavaTests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaTests {

    @Test
    public void recurssion() {
        for (int i = 0; i<9; ++i) {
            System.out.println("Осталось попыток " + i);
        }
    }

    @Test
    public void removeDuplicatesFromArrayList() {
        ArrayList newList = new ArrayList();
        newList.add("One");
        newList.add("Two");
        newList.add("Three");
        newList.add("Four");
        newList.add("Four");
        newList.add("Five");
        newList.add("Six");
        newList.add("Seven");
        newList.add("Seven");
        newList.add("Eight");
        newList.add("Nine");
        newList.add("Ten");
        HashSet hasik = new HashSet();
        hasik.addAll(newList);
        newList.clear();
        newList.addAll(hasik);
        System.out.println(newList);
    }
}

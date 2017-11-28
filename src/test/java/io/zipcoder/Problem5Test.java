package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {


    //output = Gnitest TINU Eovl I

@Test
    public  void reverseStringTest(){
    Problem5 problem5 = new Problem5();

        String input = "Testing";

        String expected = "Gnitset";

        String actual =  problem5.reverseCapitalizeString(input);
    Assert.assertEquals(expected,actual);
    }

    @Test
    public  void editStringFirstCapitalLetter(){
        Problem5 problem5 = new Problem5();

        String input = "I love UNIT Testing";

        String expected = "Gnitset";

        String actual =  problem5.editStringFirstCapitalLetter(input);
        Assert.assertEquals(expected,actual);
    }
}

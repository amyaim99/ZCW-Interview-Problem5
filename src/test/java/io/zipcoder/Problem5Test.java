package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {


    //output = Gnitest TINU Eovl I

@Test
    public  void reverseStringTest(){
    Problem5 problem5 = new Problem5();

        String input = "Testing";

        String expected = "Gnitest";

        String actual =  problem5.reverseCapitalizeString(input);
    Assert.assertEquals(expected,actual);
    }
}

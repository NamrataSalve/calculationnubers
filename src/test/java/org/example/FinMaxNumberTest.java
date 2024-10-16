package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FinMaxNumberTest {
    @Test
    public void testFindMax(){
        System.out.println("test case find max");
        Assert.assertEquals(4,FinMaxNumber.findMax(new int[]{1,3,4,2}));
        //Assert.assertEquals(-2,Find.findMax(new int[]{-12,-3,-4,-2}));
    }

    @Test
    public void testFindMax2(){
        System.out.println("test case find max");
        Assert.assertEquals(5,FinMaxNumber.findMax(new int[]{1,2,4,2}));
        //Assert.assertEquals(-2,Find.findMax(new int[]{-12,-3,-4,-2}));
    }
}

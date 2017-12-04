package junit_test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitMainTest {
    @Test
    public void testOfTwoSumNumber(){
        JunitMain junitMain = new JunitMain();
        int res = junitMain.sumOfTwoNumber(1,3);
        Assert.assertEquals(4,res);
    }
    @Test
    public void testOfTwoSumNumber2(){
        JunitMain junitMain = new JunitMain();
        int res = junitMain.sumOfTwoNumber(1,3);
        Assert.assertEquals(5,res);
    }

}
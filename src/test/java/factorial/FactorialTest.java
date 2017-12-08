package factorial;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorialZeroAndShouldReturnOne(){
        Factorial factorial = new Factorial();
        assertEquals(1,factorial.factorialCount(0));
    }

    @Test
    public void factorialOneAndShouldReturnOne(){
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.factorialCount(1));
    }

    @Test
    public void factorialTen(){
        Factorial factorial = new Factorial();
        assertEquals(3628800,  factorial.factorialCount(10));
    }

    @Test
    public void factorialTwenty(){
        Factorial factorial = new Factorial();
        assertEquals(2432902008176640000L,factorial.factorialCount(20));
    }

}
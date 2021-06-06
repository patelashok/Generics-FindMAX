package com.generics;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FindMaximumTest {
    /**
     * here i have created an object of FindMaximum class.
     * created three test cases which will check and give the test case result.
     */
    FindMaximum findMax = new FindMaximum();

    @Test
    public void ifNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(100, 50, 25));
    }
    @Test
    public void ifNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(50, 100, 25));
    }

    @Test
    public void ifNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(100, findMax.findMaxNumber(25, 50, 100));
    }
    /**
     * Similarly as above i have written test cases
     * created three test cases which will check and give the test case result.
     */

    @Test
    public void ifFloatNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(10.0F, 5.0F, 2.5F));
    }

    @Test
    public void ifFloatNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(5.0F, 10.0F, 2.5F));
    }

    @Test
    public void ifFloatNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(2.5F, 5.0F, 10.0F));
    }
}

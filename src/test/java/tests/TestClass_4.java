package tests;

import org.testng.annotations.*;

public class TestClass_4 {
    @Test
    public void test_1(){
        System.out.println("Test");
    }

    @BeforeTest
    public void bTest(){
        System.out.println("BeforeTest");
    }

    @AfterMethod
    public void aMethod(){
        System.out.println("AfterMethod");
    }

    @AfterTest
    public void aTest(){
        System.out.println("AfterTest");
    }
}

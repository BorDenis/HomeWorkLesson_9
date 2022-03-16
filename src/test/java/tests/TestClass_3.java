package tests;

import org.testng.annotations.*;

public class TestClass_3 {

    @Test
    public void test_1(){
        if (false) System.out.println("Test");
    }

    @AfterClass
    public void aClass(){
        System.out.println("AfterClass");
    }
}

package tests;

import org.testng.annotations.*;

public class TestClass_2 {
    @Test(invocationCount = 2)
    public void test_1(){
        System.out.println("Test");
    }

    @Test (groups = "group_1", dataProvider = "data")
    public void test_2(Object o1, Object o2){
        System.out.println("Test");
        System.out.println("Test data: " + o1 + " " + o2);
    }

    @Test (dataProvider = "data_2")
    public void test_3(Object o1, Object o2){
        System.out.println("Test");
        System.out.println("Test data: " + o1 + " " + o2);
    }

    @DataProvider(name = "data")
    public Object[][] testData(){
        return new Object[][]{
                {1, 2},
        };
    }

    @DataProvider(name = "data_2")
    public Object[][] testData_2(){
        return new Object[][]{
                {"three", "four"},
                {true, false}
        };
    }

    @BeforeClass
    public void bClass(){
        System.out.println("BeforeClass");
    }

    @AfterMethod(onlyForGroups = "group_1")
    public void aMethod(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    public void aClass(){
        System.out.println("AfterClass");
    }
}

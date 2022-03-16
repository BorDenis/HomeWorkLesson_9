package tests;

import org.testng.annotations.*;

public class TestClass_1 {
    @Test
    public void test_1(){
        System.out.println("Test");
    }

    @Test(dataProvider = "data")
    public void test_3(Object o1, Object o2){
        if (o2 != null) {
            System.out.println("Test");
            System.out.println("Test data: " + o1 + " " + o2);
        }
    }

    @DataProvider(name = "data")
    public Object[][] testData(){
        return new TestData().testData;
    }

    @BeforeSuite
    public void bSuite(){
        System.out.println("BeforeSuite");
    }

    @BeforeClass
    public void bCLass(){
        System.out.println("BeforeClass");
    }

    @AfterMethod
    public void aMethod(){
        System.out.println("AfterMethod");
    }

    @AfterTest
    public void aTest(){
        System.out.println("AfterTest");
    }

    @AfterSuite
    public void aSuite(){
        System.out.println("AfterSuite");
    }

}

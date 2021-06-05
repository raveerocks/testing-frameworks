package io.raveerocks.annotations;


import org.testng.annotations.*;

public class AnnotationsTest {

    private static String suite;
    private static String test;

    @Parameters("suite")
    @BeforeSuite
    public void beforeSuite(@Optional String suite){
        this.suite = suite;
        print("beforeSuite");
    }

    @Parameters("test")
    @BeforeTest
    public void beforeTest(@Optional String test){
        this.test = test;
        print("beforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        print("beforeClass");
    }


    @BeforeMethod
    public void beforeMethod(){
        print("beforeMethod");
    }

    @Test(groups = {"smoke","sanity"})
    public void combinedTest(){
        print("combinedTest");
    }

    @Test(groups = "smoke")
    public void smokeTest(){
        print("smokeTest");
    }

    @Test(groups = "sanity")
    public void sanityTest(){
        print("sanityTest");
    }

   @Test
    public void zdependency(){
        print("zdependency");
    }

   @Test(dependsOnMethods = "zdependency")
    public void adependent(){
        print("adependent");
    }

    @Test(timeOut = 3000)
    public void timed() throws InterruptedException {
        print("timed start");
        Thread.sleep(2000);
        print("after start");
    }


    @Test(dataProvider = "populate")
    public void   testDataProvider(String user, String password){
        print("testDataProvider\t|\tdata:{"+user+","+password+"}");
    }

    @AfterMethod
    public void afterMethod(){
        print("afterMethod");
    }

    @AfterClass
    public void afterClass(){
        print("afterClass");
    }

    @AfterTest
    public void afterTest(){
        print("afterTest");
    }

    @AfterSuite
    public void afterSuite(){
        print("afterSuite");
    }


    @DataProvider
    private Object[][] populate(){

        String[][] data = new String[3][2];

        data[0][0] = "user1";
        data[0][1] = "pass1";

        data[1][0] = "user2";
        data[1][1] = "pass2";

        data[2][0] = "user3";
        data[2][1] = "pass3";

        return data;
    }

    private void print(String method){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Suit : ").append(suite).append("\t|\t");
        stringBuilder.append("Test : ").append(test).append("\t|\t");
        stringBuilder.append("Class : ").append(this.getClass().getSimpleName()).append("\t\t|\t");
        stringBuilder.append("Mathod : ").append(method);

        System.out.println(stringBuilder.toString());
    }

}

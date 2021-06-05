package io.raveerocks;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        print("onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        print("onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        print("onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        print("onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        print("onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        print("onTestFailedWithTimeout");
    }

    @Override
    public void onStart(ITestContext context) {
        print("onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
        print("onFinish");
    }

    private void print(String method){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Suit : ").append("NOT APPLICABLE").append("\t\t|\t");
        stringBuilder.append("Test : ").append("NOT APPLICABLE").append("\t\t|\t");
        stringBuilder.append("Class : ").append(this.getClass().getSimpleName()).append("\t\t|\t");
        stringBuilder.append("Mathod : ").append(method);
        System.out.println("===================== LOG =====================");
        System.out.println(stringBuilder.toString());
        System.out.println("===================== LOG =====================");
    }
}

package com.xinhai.thinking;

public class testsingle {
    private static testsingle ourInstance = new testsingle();

    public static testsingle getInstance() {
        return ourInstance;
    }

    private testsingle() {
    }
}

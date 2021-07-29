package com.example.testing.model;

import android.view.accessibility.AccessibilityRecord;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public String revert(String words) {
        String[] arr = words.split(" ");

        if (arr == words.split(""))
        return arr[1] + " " + arr[0];

        else{
            return arr[1] + "   " + arr[0];
        }
    }
}

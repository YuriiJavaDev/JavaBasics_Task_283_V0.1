package com.yurii.pavlenko;

/**
 * Entry point for demonstrating generic utility method operations.
 */
public class UtilLauncherApp {

    public static void main(String[] args) {
        // Demonstrate utility with a String
        DevUtils.printTwice("Java");

        // Demonstrate utility with an Integer (Autoboxed)
        DevUtils.printTwice(100);
    }
}
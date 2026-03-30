package com.yurii.pavlenko;

/**
 * A utility class providing generic helper methods for developers.
 */
public class DevUtils {

    /**
     * Prints the provided item twice, each on a new line.
     * The method is generic and can accept any type T.
     * * @param <T>  the type of the element to be printed
     * @param item the element to print
     */
    public static <T> void printTwice(T item) {
        System.out.println(item);
        System.out.println(item);
    }
}
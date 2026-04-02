/**
 *  Java program to use format to modify string.
 */

package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating strings.
        String str = "String";
        boolean b = true;
        float f = 3.6f;

        // Printing a new string to console.
        System.out.format("I am %s with %b information about %.1f billion people work worldwide.", str, b, f);

    }
}
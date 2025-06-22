package org.sda.goodpractices;

public class KeepItSimpleStupid {
    // ❌ Bad: Overcomplicated logic to check even numbers
    public boolean isEvenComplicated(int number) {
        return (number % 2 == 0)
                && (number >= Integer.MIN_VALUE)
                && (number <= Integer.MAX_VALUE);
    }

    // ✅ Good: Keep it simple
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        KeepItSimpleStupid example = new KeepItSimpleStupid();
        System.out.println("Is 4 even? " + example.isEven(4));
    }
}

package org.sda.goodpractices;

// DRY (Don't Repeat Yourself) Principle
class DontRepeatYourself {
    // ❌ Bad: Code duplication
    public double calculateCircleAreaBad(double radius) {
        return 3.14159 * radius * radius;
    }

    public double calculateSphereAreaBad(double radius) {
        return 3.14159 * 4 * radius * radius;
    }

    // ✅ Good: Reuse logic
    private static final double PI = Math.PI;

    public double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public double calculateSphereArea(double radius) {
        return 4 * calculateCircleArea(radius);
    }

    public static void main(String[] args) {
        DontRepeatYourself example = new DontRepeatYourself();
        System.out.println("Circle area: " + example.calculateCircleArea(3));
        System.out.println("Sphere area: " + example.calculateSphereArea(3));
    }
}


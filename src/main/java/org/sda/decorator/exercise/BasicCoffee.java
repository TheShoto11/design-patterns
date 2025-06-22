package org.sda.decorator.exercise;

public class BasicCoffee implements Coffee{
    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }
}

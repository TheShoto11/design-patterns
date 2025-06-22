package org.sda.decorator.exercise;

public class MilkDecorator implements Coffee{

    private Coffee wrappee;

    public MilkDecorator(Coffee wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public double getPrice() {
        return wrappee.getPrice() * 1.5;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + ", milk";
    }
}

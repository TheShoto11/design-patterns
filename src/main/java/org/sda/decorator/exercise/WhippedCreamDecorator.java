package org.sda.decorator.exercise;

public class WhippedCreamDecorator implements Coffee{

    private Coffee wrappee;

    public WhippedCreamDecorator(Coffee wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public double getPrice() {
        return wrappee.getPrice() * 1.2;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + ", whipped cream";
    }
}

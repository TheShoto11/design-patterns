package org.sda.decorator.exercise;

public class SugarDecorator implements Coffee{
    private Coffee wrappee;

    public SugarDecorator(Coffee wrappee) {
        this.wrappee = wrappee;
    }


    @Override
    public double getPrice() {
        return wrappee.getPrice() * 1.1;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + ", sugar";
    }
}

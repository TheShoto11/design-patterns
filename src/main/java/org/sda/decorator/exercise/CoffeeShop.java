package org.sda.decorator.exercise;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee order = new MilkDecorator(new SugarDecorator(new WhippedCreamDecorator(new MilkDecorator(new BasicCoffee()))));
        System.out.println("Order: " + order.getDescription());
        System.out.println("Total: $" + order.getPrice());
    }
}

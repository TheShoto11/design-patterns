package org.sda.builder;

public class Person {
    private String name, surname, email, address;
    private int age;

    private Person(Builder builder){
        this.name = builder.name;
        this.address = builder.address;
        this.surname = builder.surname;
        this.email = builder.email;
        this.age = builder.age;
    }

    public static class Builder{
        private String name, surname, email, address;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAge(int age) {
            if (age > 18){
            this.age = age;
            }
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setName("Gledis")
                .setSurname("Lami")
                .setEmail("test@gmail.com")
                .setAge(22)
                .setAddress("Don bosko")
                .build();
    }
}

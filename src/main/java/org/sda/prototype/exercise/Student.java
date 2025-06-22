package org.sda.prototype.exercise;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
public class Student implements Cloneable{
    private String name;
    private Address address;
    private List<String> enrolledCourses;

    public Student deepCopy(){
        return new Student(this.name, this.address, new ArrayList<>(this.enrolledCourses));
    }

    public Student(String name, Address address, List<String> enrolledCourses) {
        this.name = name;
        this.address = new Address(address.getCity(), address.getStreet());
        this.enrolledCourses = new ArrayList<>(enrolledCourses);
    }

    public Student shallowCopy(){
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public Student clone(CloneType type){
        if (type == CloneType.DEEP){
            return new Student(this.name, this.address, new ArrayList<>(this.enrolledCourses));
        } else if (type == CloneType.SHALLOW) {
            try {
                return (Student) super.clone();
            } catch (CloneNotSupportedException e){
                throw new AssertionError();
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("Math");
        courses.add("IT");
        Address address1 = new Address("Tirana", "Mine Peza");
        Student student = new Student("Gledis", address1, courses);

        Student st2 = student.clone(CloneType.DEEP);

        System.out.println(student);
        System.out.println(st2);

        st2.enrolledCourses.set(0, "Java");
        System.out.println("GOING TO UPDATE FIRST COURSE TO JAVA");
        System.out.println(student);
        System.out.println(st2);

        st2.getAddress().setCity("DURRES");
        System.out.println("GOING TO UPDATE ADDRESS TO DURRES");
        System.out.println(student);
        System.out.println(st2);



    }
}

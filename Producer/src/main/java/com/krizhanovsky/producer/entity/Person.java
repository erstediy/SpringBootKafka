package com.krizhanovsky.producer.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "name", "graduationTime", "courses"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
    String name;
    String surname;
    int age;
    /*double height;
    double weight;*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   /* public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
*/
    public Person() {
    }

    public Person(String name, String surname, int age, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
       /* this.height = height;
        this.weight = weight;*/
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                /*", height=" + height +
                ", weight=" + weight +*/
                '}';
    }
}

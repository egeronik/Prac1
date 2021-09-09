package com.company;

public class Person {
    private int age;
    private int height;

    public Person(int age, int height) {
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {

        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

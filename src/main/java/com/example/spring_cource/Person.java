package com.example.spring_cource;

public class Person {
    private Pet     pet;
    private String  surename;
    private int     age;

    public Person() {
        pet = null;
        surename = "";
        age = 0;
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Set Pet");
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourePet() {
        System.out.println("Hello my Pet!");
        pet.say();
    }
}

package com.itstep.homework.classes;

import java.util.ArrayList;


public class UserSystem {

    private String name;
    private String lastName;
    ArrayList<String> phoneNumbers = new ArrayList<>();

    public UserSystem(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void addNumber(String number) {
        phoneNumbers.add(number);
    }

    @Override
    public String toString() {
        return "UserSystem{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}

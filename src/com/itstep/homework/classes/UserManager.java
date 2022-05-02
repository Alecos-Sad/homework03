package com.itstep.homework.classes;

import java.util.ArrayList;

public class UserManager {

    private String name;
    private String lastName;
    private String adress;

    ArrayList<String> phoneNumbersList = new ArrayList<>();
    ArrayList<String> emailList = new ArrayList<>();
    ArrayList<String> skypeList = new ArrayList<>();

    public UserManager(String name, String lastName, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void addPhoneNumber(String phonenumber){
        phoneNumbersList.add(phonenumber);
    }
    public void addEmail(String email){
        emailList.add(email);
    }
    public void addSkype(String skype){
        skypeList.add(skype);
    }
    public void printUser(){
        System.out.println(phoneNumbersList);
        System.out.println(emailList);
        System.out.println(skypeList);
        System.out.println(adress);
    }
}

package com.example.admin_pc.databindingexample;

public class User {
    String firstName,LastName;
    String age,contact;

    public User(String firstName, String lastName, String age, String contact){
       this.setAge(age);
       this.setFirstName(firstName);
       this.setLastName(lastName);
       this.setContact(contact);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

package com.customer;

public class Customer {
    String name,email, password;
    double registrationAmount;
    int age;
    public Customer(String name, String email, String password, double registrationAmount, int age){
        this.name = name;
        this.email = email;
        this.password = password;
        this.registrationAmount = registrationAmount;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        return this.email.equals(((Customer)obj).email) && this.password.equals(((Customer)obj).password);
    }

    @Override
    public String toString() {
        return "Name = " + name + " Email = " + email + " Registration amt = " + registrationAmount + " Age = " + age;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

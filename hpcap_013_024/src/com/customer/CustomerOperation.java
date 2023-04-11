package com.customer;

import com.customer.exception.AgeLimitException;
import com.customer.exception.DuplicateCustomer;

public class CustomerOperation {

    private Customer[] customers = new Customer[5];
    private int top = -1;

    public void addCustomer(Customer customer){
        try {
            if (customer.getAge() < 18) {
                throw new AgeLimitException("Customer below 18 not allowed");
            }
            if (top == -1){
                customers[++top] = customer;
                System.out.println("Customer added Successfully");
            }else {
                if(isDuplicateCutomer(customer))
                    throw new DuplicateCustomer("Customer already exist!!!!");
                else{
                    customers[++top] = customer;
                    System.out.println("Customer added Successfully");
                }
            }
        }catch (AgeLimitException | DuplicateCustomer e){
            System.out.println(e.getMessage());
        }
    }

    private boolean isDuplicateCutomer(Customer customer){
        for(int i=0; i <= top; i++){
            if(customer.getEmail().equals(customers[i].getEmail())){
                return true;
            }
        }
        return false;
    }

    public void customerLogin(String email, String password){
        boolean flag = false;
        for(int i = 0; i<= top; i++){
            if(email.equals(customers[i].getEmail()) &&
                    password.equals(customers[i].getPassword())){
                System.out.println("Login successfully!!!!!!");
                flag = true;
                break;
//                return;
            }
        }
//        if(i == top)
        if(!flag)
            System.out.println("Invalid email or Invalid password!!!!!!");
    }

    public void unsubscribeCustomer(String email){
        boolean flag = false;
        for(int i = 0; i<= top; i++){
            if(email.equals(customers[i].getEmail())){
                deleteCustomer(i);
                System.out.println("Customer delete Successfully!!!!");
                return;
            }
        }
        if(!flag)
            System.out.println("Customer not found");
    }
    //1. Shifting
    //2. Top position nullify
    //3. top --
    private void deleteCustomer(int index){
        //1. Shifting
        for(int j = index+1; j <= top; j++){
            customers[j-1] = customers[j];
        }
        //2. Top position nullify
        customers[top] = null;
        //3. top --
        top--;
    }
}
package com.customer;

import com.customer.AgeLimitException;
public class CustomerOperation {
    private  Customer[] customers = new Customer[5];
    private int top = -1;
    public void addCustomer(Customer customer){
        try {
            if (customer.getAge() < 18) {
                throw new AgeLimitException("Customer below 18");
            }
            if(top == -1){
                customers[++top] = customer;
            }else{
                if(isDuplicateCustomer(customer))
                    throw new DuplicateCustomer("Customer already exists");
                else{
                    customers[top++] = customer;
                }
            }
            catch(AgeLimitException e){
                System.out.println(e.getMessage());
            }
        }
    }
    private boolean isDuplicateCustomer(Customer customer){
        for(int i=0; i<= top; i++){
            if(customer.getEmail().equals(customers[i].getEmail()))
                return true;
        }
        return false;
    }
    public void customerLogin(String email, String password){
        int i;
        for (i = 0; i < top; i++) {
            if(email.equals(customers[i].getEmail()) && password.equals(customers[i].getPassword())){
                System.out.println("Login Successful");
                return;
            }
        }
        if(i == top){
            System.out.println("Invalid email or Invalid password");
        }
    }
    public void unsubscribeCustomer(String email){
        boolean flag = false;
        for (int i = 0; i < top; i++) {
            if(email.equals(customers[i].getEmail())){
                deleteCustomer(i);
                System.out.println("Customer deleted successfully");
                return;
            }
        }
        if(!flag)
            System.out.println("Customer not found");
    }
    private void deleteCustomer(int index){
        for (int i = index+1; i<=top; i++) {
            customers[i-1] = customers[i];
        }
        customers[top] = null;
        top--;
    }
}

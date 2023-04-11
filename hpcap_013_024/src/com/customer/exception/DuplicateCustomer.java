package com.customer.exception;

public class DuplicateCustomer extends Exception{
    public DuplicateCustomer(String msg){
        super(msg);
    }
}

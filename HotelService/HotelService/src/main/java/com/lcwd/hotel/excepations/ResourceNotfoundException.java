package com.lcwd.hotel.excepations;

public class ResourceNotfoundException extends RuntimeException {

    public ResourceNotfoundException(String s){
        super(s);
    }
    public ResourceNotfoundException(){
        super("Resource not found");
    }

}

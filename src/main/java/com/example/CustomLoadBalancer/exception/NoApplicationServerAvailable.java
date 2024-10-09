package com.example.CustomLoadBalancer.exception;

public class NoApplicationServerAvailable extends RuntimeException{
    public NoApplicationServerAvailable(String s) {
        super(s);
    }
}

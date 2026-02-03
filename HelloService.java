package com.example.demo.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

// Service Endpoint Interface (SEI)
@WebService
public interface HelloService {
    
    @WebMethod
    String sayHello(@WebParam(name = "text") String text);
}
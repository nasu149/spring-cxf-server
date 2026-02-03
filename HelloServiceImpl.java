package com.example.demo.service;

import org.springframework.stereotype.Service;
import jakarta.jws.WebService;

@Service
// endpointInterfaceにはインターフェースの完全修飾名を指定
@WebService(endpointInterface = "com.example.demo.service.HelloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String text) {
        return "Hello, " + text + "!";
    }
}
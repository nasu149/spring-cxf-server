package com.example.demo.config;

import com.example.demo.service.HelloService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import jakarta.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus; // CXFスターターが自動構成してくれるBus

    @Autowired
    private HelloService helloService;

    @Bean
    public Endpoint endpoint() {
        // CXFのEndpointImplを使用
        EndpointImpl endpoint = new EndpointImpl(bus, helloService);
        
        // 公開パスの設定
        // デフォルトではベースURLは /services なので、
        // 最終的なURLは http://localhost:8080/services/Hello となる
        endpoint.publish("/Hello");
        
        return endpoint;
    }
}
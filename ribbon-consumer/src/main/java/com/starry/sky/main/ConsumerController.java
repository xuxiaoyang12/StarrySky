package com.starry.sky.main;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Hashtable;
import java.util.Properties;
import java.util.logging.Logger;

@RestController
public class ConsumerController {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer() {


        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }
}

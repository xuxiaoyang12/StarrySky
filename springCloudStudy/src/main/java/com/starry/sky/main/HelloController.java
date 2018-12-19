package com.starry.sky.main;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;
import java.util.Properties;
import java.util.logging.Logger;

@RestController
public class HelloController {

//    public  final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index() {

        ServiceInstance instance = client.getLocalServiceInstance();

        System.out.println("/hello host:"+instance.getHost()+", service_id:" +instance.getServiceId());

        Properties properties = System.getProperties();

        return "HI Spring Boot 内部";
    }
}

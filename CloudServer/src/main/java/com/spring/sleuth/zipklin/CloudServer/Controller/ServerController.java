package com.spring.sleuth.zipklin.CloudServer.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ServerController {

	private static final Logger log=LoggerFactory.getLogger(ServerController.class);
	
	@GetMapping(value = "/server")
    public String hello() {
		log.info("Reached Server");
        return "Hi! This is Sleuth-Zipkin Server";
    }
	
}

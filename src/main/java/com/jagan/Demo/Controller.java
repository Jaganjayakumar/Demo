package com.jagan.Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
@RequestMapping(value="/hello")


public String display()

{
return "Welcome to Spring Boot";
}
}








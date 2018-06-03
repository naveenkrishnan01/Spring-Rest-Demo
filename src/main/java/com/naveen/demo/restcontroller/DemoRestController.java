package com.naveen.demo.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testapi")
public class DemoRestController {


  // add code of the helloApp  end point
      
@GetMapping ("/helloapp")
   public String sayHelloApp() {
	return "Hello App";
}
}
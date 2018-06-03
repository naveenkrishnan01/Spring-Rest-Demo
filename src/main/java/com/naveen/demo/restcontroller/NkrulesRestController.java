package com.naveen.demo.restcontroller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkrules.entity.Nkrules;


@RestController
@RequestMapping("/api")
public class NkrulesRestController {
	
@GetMapping("/rules")
public List<Nkrules> getNkrules(){
	List<Nkrules> theRules = new ArrayList<>();
	
	theRules.add(new Nkrules ("abcd", "1234"));
	theRules.add(new Nkrules ("xyze", "4567"));
	
	return theRules;
	
}

}

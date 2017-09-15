package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class ManagerController {
//	@RequestMapping("/manager")
	public String index(){
		return "hello world";
	}
	
	
	
}

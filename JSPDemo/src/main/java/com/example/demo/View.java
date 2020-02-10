package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class View {

	@RequestMapping("/next")
	public String view() {
		try{}
		catch(){}
		finally{}
		return "next";
	}
	
	
	@RequestMapping("/index")
	public String views() {
		return"index";
	}
}

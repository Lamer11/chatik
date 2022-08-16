package chatik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	 @GetMapping("/")
	 public String home() {	
		 System.out.println("перед вызовом home...");
		 return "home";
	 } // home
	 
	 
} // class
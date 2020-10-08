package org.bhavin.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// create a controller method for showing form
	@RequestMapping("/showForm")
	public String getForm() {
		return "helloworld-form";
	}
	
	// create a controller method for processing form data
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// create a controller method to add HTML form data in Model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read request parameter from the HTML Form
		String theName = request.getParameter("studentName");
		
		//convert data to upper case
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo "+theName+"!";
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, 
			Model model) {

		//convert data to upper case
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Message from Request param binding "+theName+"!";
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
}

package com.cg.plp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.plp.service.IFeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	IFeedbackService service;
	
	@RequestMapping("/commonfeedback/{id}/{feedback}")
	public String addFeedback(@PathVariable int id,@PathVariable String feedback)
	{
		String add=service.addFeedback(id, feedback);
		if(add.equals("Feedbackadded"))
		{
		return "Your feedback added successfully!!";
		}
		else
		{
			return "Your  feedback unsuccessfull!!";
		}	
		}
		
	@RequestMapping("/response/{id}/{response}")
	public String addResponse(@PathVariable int id,@PathVariable String response) {
		String add=service.addResponse(id, response);
		if(add.equals("Responseadded"))
		{
			return "Your response added successfully!!";
		}
		else
		{
			return "Your response unsent";
		}
		
	}
	/*@RequestMapping("/show")
	public String sayHi() {
		return service.sayHi();
		}*/
	
}
	

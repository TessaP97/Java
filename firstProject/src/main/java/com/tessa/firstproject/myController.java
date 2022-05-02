package com.tessa.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/main")
public class myController {
	
    @RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String track,
    						@PathVariable("module") String module,
    						@PathVariable("lesson") String lesson){
    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    }
	
	@RequestMapping("/")
	public String hello() {
		return "<h1>Hello Spring</h1>"
				+ "<script>alert('this is an alert')</script>";
	}
	
	@RequestMapping("/next")
		public String otherRoute() {
			return "<h2>This is another route</h2>";
		}
}

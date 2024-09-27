package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
public class HelloController { 

    @GetMapping("/") 
    @ResponseBody 
    public String saying() { 
        return "<form action='/hello' method='get'>"
                + "<button type='submit'>헬로</button>"
                + "</form>"+"<form action='/e' method='get'>"
                + "<button type='submit'>이벤트</button>"
                + "</form>"; 
    } 
	@GetMapping("/hello")
//	@ResponseBody
	public String hello(Model model) {
		model.addAttribute("이름", "Hong gildong");
		model.addAttribute("message", "Hello");
		return "hello";
	}
	
	@GetMapping("/e")
	public String event() {
		return "event";
	}

	
}

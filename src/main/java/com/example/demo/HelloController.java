package com.example.demo;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller 
public class HelloController { 
    @GetMapping("/") 
    @ResponseBody 
    public String saying() { 
        return "<form action='/hello' method='post'>"
                + "<button type='submit'>명언 보기</button>"
                + "</form>"+"<form action='/e' method='get'>"
                + "<button type='submit'>이벤트</button>"
                + "</form>"; 
    } 
    @PostMapping("/hello") 
//    @ResponseBody 
    public String hello() { 
        return "hello.html";
        		 
    } 
    
    @GetMapping("/e")
    public String event() {
    	String filename="event";
    	return filename;
    }
}

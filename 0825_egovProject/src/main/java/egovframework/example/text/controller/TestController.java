package egovframework.example.text.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/test.do")
	public String testPage() {
		return "test";
	}
}

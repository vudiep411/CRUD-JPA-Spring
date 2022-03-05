package io.javabrains.springsecurityjpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class LoginController {
	// Login page
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
}


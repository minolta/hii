package me.pixka.hii.c;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UserResources {

	@RequestMapping("/info")
	public String loginSuccess() {
		return "Login Successful!";
	}

}

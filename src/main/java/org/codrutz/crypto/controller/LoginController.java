package org.codrutz.crypto.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String login(Model model,@RequestParam(value="name",required=false,defaultValue="It works") String name) {
		System.out.println("Mucu");
		model.addAttribute("name",name);
		return "login";
	}

}

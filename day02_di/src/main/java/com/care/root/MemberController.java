package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms;
	
	//MemberService ms = new MemberService();
	public MemberController() {
		System.out.println("MemberController");
	}
	
	@GetMapping("/index") //url경로
	public String index() {
		ms.test();
		return "index"; //views의 jsp경로
	}
	
	@GetMapping("/result")
	public String result(Model model) {
		ms.result();
		model.addAttribute("member", ms.result());
		return "result";
	}
		
}

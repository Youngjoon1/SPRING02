package com.care.root;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //컨트롤러를 꼭 지정해줘야 한다.
public class MyController {
	 
	
	@RequestMapping("/index") // url 연결 경로
	public String memberIndex(Model model) {
		model.addAttribute("index","기본페이지입니다");
		
		System.out.println("index 실행");
		return "member/index"; // view폴더에 경로(마지막엔 jsp파일이 들어온다)
	}
	
	@RequestMapping("/login") 
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.addObject("abc","abc전달");
		model.setViewName("member/login");
		model.addObject("login", "로그인 페이지입니다");
		System.out.println("login 실행");
		return model; 
	}
	
	@RequestMapping("/logout") 
	public String logout( Model model) {
		model.addAttribute("test", "값 입니다~");
		model.addAttribute("logout", "로그아웃 페이지입니다");
		System.out.println("logout 실행");
		return "member/logout"; 
	}
}

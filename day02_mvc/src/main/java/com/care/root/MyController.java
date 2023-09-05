package com.care.root;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //��Ʈ�ѷ��� �� ��������� �Ѵ�.
public class MyController {
	 
	
	@RequestMapping("/index") // url ���� ���
	public String memberIndex(Model model) {
		model.addAttribute("index","�⺻�������Դϴ�");
		
		System.out.println("index ����");
		return "member/index"; // view������ ���(�������� jsp������ ���´�)
	}
	
	@RequestMapping("/login") 
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.addObject("abc","abc����");
		model.setViewName("member/login");
		model.addObject("login", "�α��� �������Դϴ�");
		System.out.println("login ����");
		return model; 
	}
	
	@RequestMapping("/logout") 
	public String logout( Model model) {
		model.addAttribute("test", "�� �Դϴ�~");
		model.addAttribute("logout", "�α׾ƿ� �������Դϴ�");
		System.out.println("logout ����");
		return "member/logout"; 
	}
}

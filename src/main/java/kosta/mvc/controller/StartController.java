package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //���� <bean 
public class StartController {
	
	@RequestMapping("/index.do")
	public ModelAndView aa() {
		System.out.println("index.do�� ��û�Ǿ� aa()�� ȣ���...");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","SpringWebMVC �ű��ϴ�"); //${message}
		mv.setViewName("result"); //WEB-INF/view/result.jsp
		return mv;
	}
}

package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //생성 <bean 
public class StartController {
	
	@RequestMapping("/index.do")
	public ModelAndView aa(String id) {
		System.out.println("index.do가 요청되어 aa()가 호출됨...");
		System.out.println("id :"+id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","SpringWebMVC 신기하다"); //${message}
		mv.setViewName("result"); //WEB-INF/view/result.jsp
		return mv;
	}
}

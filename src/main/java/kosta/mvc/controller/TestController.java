package kosta.mvc.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/test.do")
	public String aa(String no) {
		int convertNo = Integer.parseInt(no);
		
		return "result";
	}
	
	@RequestMapping("/test/a.do")
	public String aaa(String id) {
		System.out.println("id = "+id);
		//return "redirect:/index.do";//앞에 redirect없으면 그냥 /index.do를 뷰이름으로 인식한다.
		return "forward:/index.do";//id값이 다음 controller로 넘어간다
	}
	
	@RequestMapping("/test/b.do")
	public ModelAndView bbb(String id,HttpServletRequest request,HttpSession session) {
		ServletContext application = session.getServletContext();
		//session으로 ServletContext를 구해 올 수 있다.
		//예전 controller처럼 request,session도 사용가능
		System.out.println("/test/b.do 실행...");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("forward:/index.do");
		return mv;
	}
}

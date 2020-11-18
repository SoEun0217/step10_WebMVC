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
		//return "redirect:/index.do";//�տ� redirect������ �׳� /index.do�� ���̸����� �ν��Ѵ�.
		return "forward:/index.do";//id���� ���� controller�� �Ѿ��
	}
	
	@RequestMapping("/test/b.do")
	public ModelAndView bbb(String id,HttpServletRequest request,HttpSession session) {
		ServletContext application = session.getServletContext();
		//session���� ServletContext�� ���� �� �� �ִ�.
		//���� controlleró�� request,session�� ��밡��
		System.out.println("/test/b.do ����...");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("forward:/index.do");
		return mv;
	}
}

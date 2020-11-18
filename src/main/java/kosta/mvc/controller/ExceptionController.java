package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {
	
	@RequestMapping("/exception.do")
	public ModelAndView aa(String no) {
		int convertNo = Integer.parseInt(no);
		int re = 100/convertNo;
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","���ܾ��� �����۵����Դϴ�..");
		mv.setViewName("result");
		return mv;
	}
	
	/**
	 * ���� Controller���� �߻��ϴ� ���ܸ� ó���� �޼ҵ� �ۼ�
	 * */
	@ExceptionHandler(value = Exception.class)
	public ModelAndView exception(Exception e) {
		//���ܰ� �߻����� �� �ؾ��� �� �ۼ�
		System.out.println("ExceptionHandler�� ����Ǿ����...");
		ModelAndView mv = new ModelAndView();
		mv.addObject("errClass",e.getClass());
		mv.addObject("errMsg",e.getMessage()+"�� �߻��߾��...");
		
		mv.setViewName("error/errorView");//WEB-INF/views/error/errorView.jsp�� �̵�
		
		return mv;
	}
}

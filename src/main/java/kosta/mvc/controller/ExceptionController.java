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
		mv.addObject("message","예외없이 정상작동중입니다..");
		mv.setViewName("result");
		return mv;
	}
	
	/**
	 * 현재 Controller에서 발생하는 예외를 처리할 메소드 작성
	 * */
	@ExceptionHandler(value = Exception.class)
	public ModelAndView exception(Exception e) {
		//예외가 발생했을 때 해야할 일 작성
		System.out.println("ExceptionHandler가 실행되었어요...");
		ModelAndView mv = new ModelAndView();
		mv.addObject("errClass",e.getClass());
		mv.addObject("errMsg",e.getMessage()+"가 발생했어요...");
		
		mv.setViewName("error/errorView");//WEB-INF/views/error/errorView.jsp로 이동
		
		return mv;
	}
}

package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller //생성
@RequestMapping("/rem")
public class RequestMappingController {
	
	/**
	 * 리턴타입 String : 리턴되는 문자열이 뷰의 이름이 된다!!
	 * */
	@RequestMapping("/a.do")
	public String aa() {
		System.out.println("rem/a.do 요청이 되었습니다....");
		//기능...
		return "result";  //WEB-INF/views/result.jsp 로 이동 ,값을 가져가지는 못한다.
	}
	
	/**
	 * b.do 또는 c.do 요청이 하나의 메소드를 실행
	 * 
	 * 리턴타입이 void 인 경우 : 요청된 주소가 view이름이 된다.
	 *  ex) rem/a.do가 요청되면 뷰의 이름은 rem/a -> 최종 뷰정보는 /WEB-INF/views/rem/a.jsp가 된다.
	 * */
	@RequestMapping(value = {"/b.do","/c.do"})
	public void bb() {
		System.out.println("b.do 또는 c.do 요청이 되었습니다.");
	}
	
	//@RequestMapping(value = "/test.do" , method = RequestMethod.GET)
	//GET방식일 때는 이 어노테이션 사용가능
	@GetMapping("/test.do")
	public String test(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("test.do 요청되었습니다...GET방식...name : "+name);
		return "result"; //WEB-INF/views/result.jsp로 이동
	} 
	
	//@RequestMapping(value = "/test.do" , method = RequestMethod.POST)
	@PostMapping("/test.do")
	public String test2(String name) {
		System.out.println("test.do 요청되었습니다....POST 방식...name : "+name);
		return "result"; //WEB-INF/views/result.jsp로 이동
	} 
	
	/**
	 * parameter 정보에 따라 실행되는 메소드를 다르게..
	 * */
	//@RequestMapping(value="/a.do" , params = {"id"})
	//@RequestMapping(value="/a.do" , params = {"id=jang"})
	//@RequestMapping(value="/a.do" , params = {"id" ,"age"})
	@RequestMapping(value="/a.do" , params = {"id!=jang"})
	public ModelAndView aaa() {
		System.out.println("params의 정보로.... test 중입니다...");
		return new ModelAndView("result");//WEB-INF/view/result.jsp이동 , 가져갈 데이터가 없다
	}
	
	
	
	
}

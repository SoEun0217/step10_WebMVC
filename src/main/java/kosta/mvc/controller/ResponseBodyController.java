package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //@Controller and @ResponseBody
public class ResponseBodyController {
	
	@RequestMapping(value="/responseBody.do",produces = "text/html;charset=UTF-8")
	//@ResponseBody //리턴되는 값이 그대로 응답객체이다..ajax할 때 필요
	public String aa() {
		return "Response Test입니다..";
	}
	
	@RequestMapping(value="/responseBody2.do",produces = "text/html;charset=UTF-8")
	//@ResponseBody
	public String bb() {
		return "쉽니당";
	}
}

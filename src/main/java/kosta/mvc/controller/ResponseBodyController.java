package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //@Controller and @ResponseBody
public class ResponseBodyController {
	
	@RequestMapping(value="/responseBody.do",produces = "text/html;charset=UTF-8")
	//@ResponseBody //���ϵǴ� ���� �״�� ���䰴ü�̴�..ajax�� �� �ʿ�
	public String aa() {
		return "Response Test�Դϴ�..";
	}
	
	@RequestMapping(value="/responseBody2.do",produces = "text/html;charset=UTF-8")
	//@ResponseBody
	public String bb() {
		return "���ϴ�";
	}
}

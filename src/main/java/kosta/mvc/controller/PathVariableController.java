package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
	
	@RequestMapping(value = {"/{type}/{id}.do"})
	public String aa(@PathVariable String type,@PathVariable String id) {//parameter가 아니라 값으로 들어간다.
		//경로의 type과 id가 데이터로 출력가능하다. @PathVariable이 없다면 parameter가 된다.
		System.out.println("/{type}/{id}.do 가 요청되었습니다.");
		System.out.println("type : "+type);
		System.out.println("id : "+id);
		return "result";
	}
	
	@RequestMapping(value = "/{user}")//이미 web.xml에 /blog를 지정해두었으므로
	public String bb(@PathVariable String user) {
		System.out.println("blog/*  요청되었습니다.");
		System.out.println("user : "+user);
		return "result";
	}
	
	@RequestMapping(value = "/{type}/{board}/{no}")
	public String cc(@PathVariable String type, @PathVariable String board,@PathVariable int no) {
		System.out.println("type : "+type);
		System.out.println("board : "+board);
		System.out.println("no : "+no);
		return "result";
	}
	
	@RequestMapping("/{url}.do")
	public void aaa() {//void - 들어오는 요청의 view로 이동해라
		System.out.println(1111);
		
	}
}

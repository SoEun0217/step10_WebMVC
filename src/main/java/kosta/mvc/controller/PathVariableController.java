package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
	
	@RequestMapping(value = {"/{type}/{id}.do"})
	public String aa(@PathVariable String type,@PathVariable String id) {//parameter�� �ƴ϶� ������ ����.
		//����� type�� id�� �����ͷ� ��°����ϴ�. @PathVariable�� ���ٸ� parameter�� �ȴ�.
		System.out.println("/{type}/{id}.do �� ��û�Ǿ����ϴ�.");
		System.out.println("type : "+type);
		System.out.println("id : "+id);
		return "result";
	}
	
	@RequestMapping(value = "/{user}")//�̹� web.xml�� /blog�� �����صξ����Ƿ�
	public String bb(@PathVariable String user) {
		System.out.println("blog/*  ��û�Ǿ����ϴ�.");
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
	public void aaa() {//void - ������ ��û�� view�� �̵��ض�
		System.out.println(1111);
		
	}
}

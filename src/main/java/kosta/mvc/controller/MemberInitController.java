package kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kosta.mvc.model.dto.Member;

@Controller
public class MemberInitController {
	@Autowired
	private List<Member> list;
	
	@RequestMapping("memberinit.do")
	public String aa() {
		System.out.println("list : "+list);
		return "result";
	}
}

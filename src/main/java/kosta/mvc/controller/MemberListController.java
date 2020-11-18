package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kosta.mvc.model.dto.Member;
import kosta.mvc.model.dto.MemberList;

@Controller
public class MemberListController {
	
	@RequestMapping("list/memberMulti.do")
	public void aa(MemberList memberList) {
		System.out.println("----------------------------------");
		for(Member m:memberList.getList()) {
			System.out.println(m.isState());
			System.out.println(m.getName());
			System.out.println(m.getAddr());
			System.out.println(m.getAge());
			System.out.println();
		}
	}
}

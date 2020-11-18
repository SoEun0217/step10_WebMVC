package kosta.mvc.model.dto;

import java.util.List;

public class MemberList {
	private List<Member> list;//<input type="" name="list[index]

	public List<Member> getList() {
		return list;
	}

	public void setList(List<Member> list) {
		System.out.println("setList(List<Member> list) call..."+list+"\n");
		this.list = list;
	}
	
	
}

package kosta.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kosta.mvc.model.dto.Member;

@Controller
@RequestMapping("/param")
public class ParameterController {
	
	/*@RequestMapping("/a.do")
	public ModelAndView aa(HttpServletRequest request) {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println(name +" , "+age);
		return new ModelAndView("result", "message", "���� ��������...");
		//view�� �̸��� model�� ���� �������� ��
	}*/
	
	/**
	 * �Ű������� ���޹��� Model ��ü�� �������� ���޵� ��ü�̴�.
	 * �Ű����� Model�� ������ �����ϸ� �信�� ����� �� �ִ�.
	 * int�� null�̶�� 500�� ������ ���.
	 * int�� �������� Integer(��üŸ��)���� ��� null�� �ǵ� ������ ���� �ʴ´�.
	 * */
	@RequestMapping("/a.do")
	public String aa(String name , Integer age , Model model) {
		System.out.println(name +" , "+age);
		model.addAttribute("message","���� ����....");
		return "result"; //WEB-INF/views/result.jsp�̵�
	}
	
	/**
	 * void�� ���� ������ WEB-INF/view/param/c.jsp �̵��Ѵ�.
	 * Member�� �츮�� ������ ���� ������ �̹� �����ڰ� ȣ���� �Ǿ��ִ�..
	 * 
	 * parameter�� ���޵Ǵ� name�� ������ �Ӽ����� ������ �ִ� ��ü��
	 * �μ��� �����ϸ� �� ��ü�� �����ؼ� setXxx()���� �����͸� �������ش�
	 * 
	 * parameter�� ���޵� ������ ��ü�� ���ε��ϸ� �� ��ü��
	 * �信 ���� �״�� ����� �� �ִ�. - Model������ ������ �ȴ�.
	 *  ������� �信�� ����� �� ��ü�̸��� ù���ڸ� �ҹ��ڷ� �����ؼ�
	 *  ��, Member�̸� member�� ����Ѵ�.${member.id}
	 *  
	 *  @ModelAttribute �� �Ű������� �����ϸ�
	 *  ��ü�� ��Ī�� ���� ����� �� �ִ�.
	 *  �̷��� �ϸ� ���������� ���� ��Ī���� �����ϰ� ���� �� �� �ִ�.
	 *  
	 * 
	 * */
	@PostMapping("/c.do")
	public void c(@ModelAttribute("m") Member member) {
		System.out.println(member.getId());
		System.out.println(member.getName());
		System.out.println(member.getAge());
		System.out.println(member.getAddr());
	}
	
	@ModelAttribute("hobbys")//�信�� ${hobbys} ��� , �� �� controller�� ��ȴ� ���� ��鸸 ��밡��
	public List<String> hobby(){
		List<String>list = new ArrayList<String>();
		list.add("���");
		list.add("����");
		list.add("�Ǳ�");
		return list;
	}
	
	@ModelAttribute("addr")//${addr} 
	public String aaa() {
		return "��⵵ ������ �Ǳ���...";
	}
	
	
	
	
	
	
	
	
	
	
}

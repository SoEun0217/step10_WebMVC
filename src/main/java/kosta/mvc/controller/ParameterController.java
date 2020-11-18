package kosta.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kosta.mvc.model.dto.Member;

@Controller
@RequestMapping("/param")
public class ParameterController {
	
	/*@RequestMapping("/a.do")
	public ModelAndView aa(HttpServletRequest request) {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println(name +" , "+age);
		return new ModelAndView("result", "message", "집에 가고프다...");
		//view의 이름과 model도 같이 가져가는 것
	}*/
	
	/**
	 * 매개변수로 전달받은 Model 객체는 뷰쪽으로 전달될 객체이다.
	 * 매개변수 Model에 정보를 저장하면 뷰에서 사용할 수 있다.
	 * int가 null이라면 500번 오류가 뜬다.
	 * int로 받지말고 Integer(객체타입)으로 써야 null이 되도 오류가 나지 않는다.
	 * */
	@RequestMapping("/a.do")
	public String aa(String name , Integer age , Model model) {
		System.out.println(name +" , "+age);
		model.addAttribute("message","집에 갈래....");
		return "result"; //WEB-INF/views/result.jsp이동
	}
	
	/**
	 * void는 뷰의 정보가 WEB-INF/view/param/c.jsp 이동한다.
	 * Member를 우리가 생성한 적이 없지만 이미 생성자가 호출이 되어있다..
	 * 
	 * parameter로 전달되는 name과 동일한 속성들을 가지고 있는 객체를
	 * 인수로 선언하면 그 객체를 생성해서 setXxx()으로 데이터를 저장해준다
	 * 
	 * parameter로 전달된 정보를 객체로 바인딩하면 그 객체를
	 * 뷰에 가서 그대로 사용할 수 있다. - Model정보에 저장이 된다.
	 *  사용방법은 뷰에서 사용할 때 객체이름의 첫글자를 소문자로 변경해서
	 *  즉, Member이면 member로 사용한다.${member.id}
	 *  
	 *  @ModelAttribute 를 매개변수에 선언하면
	 *  객체의 별칭을 만들어서 사용할 수 있다.
	 *  이렇게 하면 뷰페이지에 가서 별칭으로 간단하게 접근 할 수 있다.
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
	
	@ModelAttribute("hobbys")//뷰에서 ${hobbys} 사용 , 꼭 이 controller를 들렸다 가는 뷰들만 사용가능
	public List<String> hobby(){
		List<String>list = new ArrayList<String>();
		list.add("등산");
		list.add("독서");
		list.add("악기");
		return list;
	}
	
	@ModelAttribute("addr")//${addr} 
	public String aaa() {
		return "경기도 성남시 판교로...";
	}
	
	/**
	 * parameter로 넘어오는 name과 매개변수의 이름이 다를 때
	 * @RequestParam을 사용해서 매핑해줄수 있다.
	 *  : @RequestParam을 선언하면 requird="true"이다.(값이 반드시 들어와야하는 속성)
	 *   즉, 값이 반드시 들어와야한다.
	 *   defaultValue를 지정해주면 값이 없을 때 default값으로 지정해준다.
	 * */
	@RequestMapping("/d.do")
	public String dd(@RequestParam(value="id" , defaultValue = "Guest")
	String userId,@RequestParam(value="name",required = false) String userName,  @RequestParam(defaultValue = "0") int age) {
		System.out.println("userId : "+userId);
		System.out.println("userName : "+userName);
		System.out.println("age : "+age);
		return "result";//뷰의 이름 WEB-INF/views/result.jsp
	}
	
	
	
	
	
	
	
	
	
	
}

package kosta.mvc.model.dto;

public class Member {
	private String id;
	private String name;
	private int age;
	private String addr;
	private boolean state;
	
	public Member() {
		System.out.println("Member의 기본 생성자 call...");
	}
	
	public Member(String id, String name, int age, String addr) {
		System.out.println(" Member(String id, String name, int age, String addr) 생성자 call..");
		this.id = id;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		System.out.println("setId(String id) call...");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(" setName(String name) call...");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge(int age) call..");
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		System.out.println("setAddr(String addr) call..");
		this.addr = addr;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	
}

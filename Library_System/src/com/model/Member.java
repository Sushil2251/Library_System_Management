package com.model;

public class Member {
	int member_id;
	String member_name;
	
	public Member()
	{
		
	}
	
	public Member(int member_id, String member_name) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", member_name=" + member_name + "]";
	}
	

}

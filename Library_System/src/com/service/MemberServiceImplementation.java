package com.service;
import com.dao.MemberDaoImplementation;
import java.util.List;
import com.dao.MemberDaoImplementation;
import com.dao.BooKDao;
import com.dao.MemberDao;
import com.service.MemberService;
import com.model.Member;

public class MemberServiceImplementation implements MemberService{
	MemberDao  memberDao;

	public MemberServiceImplementation() {
		// TODO Auto-generated constructor stub
		 memberDao = new MemberDaoImplementation();
	 }
	public MemberServiceImplementation(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	public MemberDao getBooKDao() {
		return memberDao;
	}


	public void setBooKDao(BooKDao booKDao) {
		this.memberDao = memberDao;
	}

		 
	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		return memberDao.getAllMembers();
	}
	@Override
	public int addMember(Member member) {
		// TODO Auto-generated method stub
		return memberDao.addMember(member);
	}
	@Override
	public int deleteMember(int member_id1) {
		// TODO Auto-generated method stub
		return memberDao.deleteMember(member_id1);

	}
	@Override
	public int dateDiff(int member_id2) {
		// TODO Auto-generated method stub
		return memberDao.dateDiff(member_id2);
	}
	
}

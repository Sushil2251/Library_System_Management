package com.dao;
import java.util.List;
import com.model.Member;
public interface MemberDao {
	List<Member> getAllMembers();
	int addMember (Member member);
	int deleteMember(int member_id1);
	int dateDiff(int member_id);

}

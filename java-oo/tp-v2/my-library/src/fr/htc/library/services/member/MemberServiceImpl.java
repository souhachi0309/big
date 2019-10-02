package fr.htc.library.services.member;

import fr.htc.library.dao.member.MemberDao;
import fr.htc.library.dao.member.MemberDaoMapImpl;
import fr.htc.library.model.Member;

public class MemberServiceImpl implements MemberService {

	@Override
	public void create(String firstName, String lastName, int age) {
		
		Member member = new Member(firstName, lastName, age);
		MemberDao memberDao = new MemberDaoMapImpl();
		memberDao.save(member);
		System.out.println(member);
	}

}

package fr.htc.library.services;

import fr.htc.library.model.Member;

public class MemberServiceImpl implements MemberService {

	@Override
	public void create(String firstName, String lastName, int age) {
		
		Member member = new Member(firstName, lastName, age);
		System.out.println(member);
		
	}

}

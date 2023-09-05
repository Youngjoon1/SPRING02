package com.care.root;

import org.springframework.stereotype.Repository;

@Repository("d123")
public class MemberDAO {
	public MemberDAO() {
		System.out.println("MemberDAO");
	}
	
	public void test() {
		System.out.println("dao test½ÇÇà");
	}
	
	public MemberDTO result() {
		MemberDTO dto = new MemberDTO();
		dto.setId("aaaa");
		dto.setName("È«±æµ¿");
		return dto;
	}
}

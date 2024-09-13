package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mysql.cj.xdevapi.SessionFactory;
import com.smhrd.database.SqlSessionManager;

public class MavenMemberDAO {
	// DAO 객체가 생성이 되면
	// 1. SessionFactory 가져오기
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSessionFactory();

	// 2. Session 객체 생성 -> DB 관련된 작업 수행해주는 단위 (INSERT, SELECT, ...)

	// 1. 회원가입 메서드
	public int join(MavenMember member) {
		// 1. SESSOIN 생성 (insert)
		// true -> auto commit 의미, commit 안 눌러도 알아서 잘,, 적용되게..
		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// insert into mavenmember values (?,?,?)
		// ( 호출할 sql문 , sql 호출시에 사용하는 파라미터)
		int res = sqlSession.insert("MemberMapper.join", member);
		// 그냥 select * 하면 ("MemberMapper.join"); 로 멤버 없이 해야 함

		// session 객체 close(자원 회수)
		sqlSession.close();

		return res;
	}

	// 2. 로그인 메서드
	public MavenMember login(MavenMember member) {
		// 1. SESSOIN 생성 (insert)
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		sqlSession.selectOne("MemberMapper.login", member);
		// 멤버매퍼의 네임 스페이스와 내가 사용할 놈의 id를 적은 거임
		// insert, selectOne 이런 건 오버로딩이 되어있음 매개변수가 다르거나 타입이 다르거나...
		MavenMember result = sqlSession.selectOne("MemberMapper.login", member);
		sqlSession.close();
		return result;
	}
	



}

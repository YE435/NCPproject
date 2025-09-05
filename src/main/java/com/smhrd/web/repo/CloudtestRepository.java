package com.smhrd.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.web.domain.Cloudtest;

@Repository
public interface CloudtestRepository extends JpaRepository<Cloudtest, Long> {
	// JpaRepository<Cloudtest, Long>
	// JpaRepository<테이블을 대표하는 자료형, 테이블의 pk 자료형>
	// interface이지만, 일종의 자료 형태를 정하는 개념으로 봐서 extends로 상속 받음
	// !!! 특이 케이스임 !!!
	
	// 메소드명을 기준으로 SQL 구문을 생성
	// Java 기본적으로 이름을 지어줄 때, 카멜식 기법 따름 // 카멜식 안 지키면 안 됨
	Cloudtest findByIdAndName(Long id, String name);
	// select * from cloudtest where id = ? and name = ?
	// join 쓰려면 entity 따로 만들어 줘야 하는 점은 불편

}

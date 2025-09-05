package com.smhrd.web.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // 중요!! 절대 빠지면 안 됨!
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cloudtest {
	
	@Id // pk를 의미!! 표현하는 길이가 Long이 더 길어서 Integer 대신 사용함
	private Long id;
	private String name;
	private String gender;
	private int age;
	
}

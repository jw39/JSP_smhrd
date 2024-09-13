package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor   // 전체 파라미터 전부 들어가는 생성자
@Getter				 // getter 삭제해도 outline 창에선 보이게 함 window->outline
@Setter 			// set
@NoArgsConstructor // 기본 생성자
@Data // get, set, wquals, hashcode, toString
public class MavenMember {
	// 테이블 이름
	private String id;
	private String pw;
	private String nickname;
	// 컬럼 이름
	
	// alt + shift + s (단축기)
	public MavenMember(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	
}

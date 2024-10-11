package com.spring_boot_dolls_ticket.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring_boot_dolls_ticket.project.model.MemberVO;
import com.spring_boot_dolls_ticket.project.dao.IMemberDAO;

@Service
public class MemberService implements IMemberService {
	
	@Autowired
	@Qualifier("IMemberDAO")
	IMemberDAO dao; // IMemberDAO 주입
	
	@Autowired
	PasswordEncoder pwdEncoder; // 비밀번호 암호화
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	// Spring에서 제공하는 데이터베이스 접근을 간소화하는 도구 SQL 쿼리 실행, 결과 매핑 등의 작업을 쉽게 처리할 수 있음
	
	@Transactional  
	
	@Override
	public String loginCheck(HashMap<String, Object> map) {
	    String encodedPwd = dao.loginCheck((String) map.get("id"));
	    String result = "fail";

	    if (encodedPwd != null && pwdEncoder.matches((String) map.get("pwd"), encodedPwd)) {
	        result = "success";
	    }

	    // 로그 추가
	    System.out.println("Login Check Result: " + result);
	    return result;
	}

	@Override
	public String idCheck(String id) {
	    return dao.idCheck(id); // 실제 ID 값을 반환하도록 수정
	}

	@Override
	public void insertMember(MemberVO vo) {
	    try {
	        String encodedPwd = pwdEncoder.encode(vo.getCustPassWord());
	        vo.setCustPassWord(encodedPwd);
	        dao.insertMember(vo);
	    } catch (Exception e) {
	        e.printStackTrace(); // 예외를 출력
	        throw e; // 예외를 다시 던져서 500 에러를 확인할 수 있게
	    }
	}

	@Override
	public List<String> findId(String name, String email, String phone) {
		StringBuilder sql = new StringBuilder("SELECT CUST_ID FROM Member WHERE CUST_NAME = ?");
	    List<Object> params = new ArrayList<>();
	    params.add(name);
	    
	    if (email != null) {
	        sql.append(" AND CUST_EMAIL = ?");
	        params.add(email);
	    }
	    
	    if (phone != null) {
	        sql.append(" AND CUST_PHONENUMBER = ?");
	        params.add(phone);
	    }

	    return jdbcTemplate.queryForList(sql.toString(), params.toArray(), String.class);
	}

	@Override
	public boolean checkIdInDatabase(String id) {
	    String sql = "SELECT COUNT(*) FROM MEMBER WHERE CUST_ID = ?";
	    System.out.println("Checking ID: " + id); // 아이디 출력

	    int count = jdbcTemplate.queryForObject(sql, new Object[]{id}, Integer.class);
	    System.out.println("Count result: " + count); // 쿼리 결과 출력

	    return count > 0; // 존재하면 true, 아니면 false
	}
	
	@Override
	public List<String> findPwd(String name, String email, String phone) {
		StringBuilder sql = new StringBuilder("SELECT CUST_ID FROM Member WHERE CUST_NAME = ?");
	    List<Object> params = new ArrayList<>();
	    params.add(name);
	    
	    if (email != null) {
	        sql.append(" AND CUST_EMAIL = ?");
	        params.add(email);
	    }
	    
	    if (phone != null) {
	        sql.append(" AND CUST_PHONENUMBER = ?");
	        params.add(phone);
	    }

	    return jdbcTemplate.queryForList(sql.toString(), params.toArray(), String.class);
	}
	
	
	

}
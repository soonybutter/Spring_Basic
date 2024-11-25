package com.mvc.rest.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mvc.rest.model.dto.RestDto;

@Repository
public class RestDaoImpl implements RestDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<RestDto> rowMapper = (rs,rowNum)->{
		RestDto dto = new RestDto();
		dto.setRestno(rs.getInt(1));
		dto.setRestid(rs.getString(2));
		dto.setRestpw(rs.getString(3));
		dto.setRestname(rs.getString(4));
		return dto;
		
	};
	
	@Override
	public List<RestDto> selectList() {
		List<RestDto> list = new ArrayList<RestDto>();
		String sql = " SELECT * FROM RESTBOARD ";
		list = jdbcTemplate.query(sql, rowMapper);
		
		return list;
	}

	@Override
	public RestDto selectOne(int restno) {
		String sql =" SELECT * FROM RESTBOARD WHERE RESTNO=? ";
		RestDto dto = jdbcTemplate.queryForObject(sql ,rowMapper, restno);
		return dto;
	}

	@Override
	public int insert(RestDto dto) {
		String sql =" INSERT INTO RESTBOARD VALUES(RESTNOSEQ.NEXTVAL, ?,?,?) ";
		int res = jdbcTemplate.update(sql, dto.getRestid(), dto.getRestpw(),dto.getRestname());
		
		return res;
	}

	@Override
	public int update(RestDto dto) {
		String sql =" UPDATE RESTBOARD SET RESTPW=? WHERE RESTNO=? ";
		int res = jdbcTemplate.update(sql, dto.getRestpw(), dto.getRestno());
		return res;
	}

	@Override
	public int delete(int restno) {
		String sql =" DELETE FROM RESTBOARD WHERE RESTNO=? ";
		int res = jdbcTemplate.update(sql, restno);
		
		return res;
	}

}

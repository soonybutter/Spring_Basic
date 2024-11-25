package com.mvc.rest.model.dao;

import java.util.List;

import com.mvc.rest.model.dto.RestDto;

public interface RestDao {
	public List<RestDto> selectList();
	public RestDto selectOne(int restno);
	public int insert(RestDto dto);
	public int update(RestDto dto);
	public int delete(int restno);

}

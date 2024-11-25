package com.mvc.rest.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.rest.model.dao.RestDao;
import com.mvc.rest.model.dto.RestDto;

@Service
public class RestBizImpl implements RestBiz{

	@Autowired
	private RestDao dao;
	
	@Override
	public List<RestDto> selectList() {
		
		return dao.selectList();
	}

	@Override
	public RestDto selectOne(int restno) {
		return dao.selectOne(restno);
	}

	@Override
	public int insert(RestDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(RestDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int restno) {
		return dao.delete(restno);
	}

}

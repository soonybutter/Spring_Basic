package com.mvc.upgrade.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.upgrade.model.dao.BoardDao;
import com.mvc.upgrade.model.dto.BoardDto;
import com.mvc.upgrade.model.dto.MemberDto;

@Service
public class BoardBizImpl implements BoardBiz {

	@Autowired
	private BoardDao dao;
	
	@Override
	public List<BoardDto> selectList() {
		List<BoardDto> res= dao.selectList();
		
		return res;
	}

	@Override
	public BoardDto selectOne(int myno) {
		return dao.selectOne(myno);
	}

	@Override
	public int insert(BoardDto dto) {
		
		return dao.insert(dto);
	}

	@Override
	public int update(BoardDto dto) {
		
		return dao.update(dto);
	}

	@Override
	public int delete(int myno) {
		
		return dao.delete(myno);
	}

	@Override
	@Transactional 
	public String test() {
		dao.insert(new BoardDto(0,"transaction1","test","insert",null));
		
		String test = dao.test();
		
		//null.length() -> insert 후 exception 발생시킴.
		//test.length();
		
		return null;
	}

	@Override
	public int insert(MemberDto dto) {
		
		return 0;
	}
	

}

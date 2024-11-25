package com.mvc.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.rest.model.biz.RestBiz;
import com.mvc.rest.model.dto.RestDto;

@RestController
public class RestControllerTest {

	@Autowired
	private RestBiz biz;
	
	@RequestMapping(value="/restdto", method=RequestMethod.GET)
	public List<RestDto> getRest(){
		List<RestDto> list = new ArrayList<>();
		list = biz.selectList();
		
		return list;
		
	}
	
	@RequestMapping(value="/restdto/{restno}", method=RequestMethod.GET)
	public RestDto getRestOne(@PathVariable int restno) {
		RestDto dto  = biz.selectOne(restno);
		
		return dto;
		
	}
	
	@RequestMapping(value="/restdto", method=RequestMethod.POST)
	public Map<String, Integer> postRest(RestDto dto){
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		int res =biz.insert(dto);
		if(res>0) {
			map.put("code", 200);
		}
		else {
			map.put("code", 404);
			
		}
		
		return map;
		
	}
	
	@RequestMapping(value="/restdto/{restno}", method=RequestMethod.DELETE)
	public Map<String,Integer> deleteRest(@PathVariable int restno){
		
		//System.out.println("delete 실행!");
		Map<String,Integer> map = new HashMap<String, Integer>();
		int res= biz.delete(restno);
		
		if(res>0) {
			map.put("code", 200);
		}
		else {
			map.put("code", 404);
		}
		return  map;
	}
	
	@RequestMapping(value="/restdto", method=RequestMethod.PUT)
	public Map<String,Integer> putRest(RestDto dto){
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		int res = biz.update(dto);
		
		
		if(res>0) {
			map.put("code", 200);
		}
		else {
			map.put("code", 404);
		}
		
		return map;
		
	}
	
	
}

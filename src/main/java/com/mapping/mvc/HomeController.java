package com.mapping.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mapping.mvc.dto.AddressDto;
import com.mapping.mvc.dto.ScoreDto;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/command.do" ,method = RequestMethod.GET)
	public String getCommand(Model model, String name, @RequestParam("addr") String addr, String phone) {
		System.out.println("getcommand() method");
		System.out.println("name: "+name);
		System.out.println("addr: "+addr);
		System.out.println("phone: "+phone);
		
		AddressDto dto = new AddressDto(name,addr,phone);
		
		model.addAttribute("dto",dto);
		
		return "getcommand";
	}
	
	@RequestMapping(value="/command.do" ,method=RequestMethod.POST)
	public String postCommand(Model model, @ModelAttribute AddressDto dto) {
		System.out.println("postcommand() method");
		System.out.println(dto.getName());
		System.out.println(dto.getAddr());
		System.out.println(dto.getPhone());
		
		model.addAttribute("dto",dto);
		
		return "postcommand";
	}
	
	//score.do 요청을 받아 처리하는 메소드 작성
	//1. 입력 받은 값은 ScoreDto 객체로 받는다.
	//2. scoreres.jsp로 응답하고 입력받은 데이터를 출력해 확인한다.
	
	@RequestMapping("/score.do")
	public String postScore(Model model, @ModelAttribute ScoreDto dto) {
		model.addAttribute("dto", dto);
		
		return "scoreres";
	}
	
}

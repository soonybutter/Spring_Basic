package com.hello.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hello.mvc.model.HelloBiz;

@Controller
public class HelloController {
	
	@Autowired
	private HelloBiz biz;
	
	@RequestMapping("/hello.do")
	public String getHello(Model model) {
		model.addAttribute("msg", biz.getHello());
		return "/WEB-INF/views/hello.jsp";
		
	}
	
	@RequestMapping("/bye.do") // 파라미터명 ("name") 명시, 이걸 nickName으로 받아와주세요.
	public ModelAndView getBye(@RequestParam("name") String nickName) {

		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/WEB-INF/views/bye.jsp");
		mav.addObject("msg","bye, "+nickName);
		
		return mav;
	}
	
	

}

package com.mvc.upgrade;


import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.dto.BoardDto;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BoardBiz biz;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		
		logger.info("SELECT LIST");
		
		List<BoardDto> res = biz.selectList();
		model.addAttribute("list",res);
		
		return "mvclist";
	
	}
	
	@RequestMapping("/detail.do")
	public String detail(Model model, int myno) {
		logger.info("SELECT ONE");
		model.addAttribute("dto",biz.selectOne(myno));
		
		return "mvcdetail";
	}
	
	@RequestMapping("/insertform.do")
	public String insertForm() {
		logger.info("INSERT FORM");
		
		
		return "mvcinsert";
	}
	
	@RequestMapping("/insert.do")
	public String insert(BoardDto dto) {
		logger.info("INSERT");
		
		int res = biz.insert(dto);
		
		if(res>0) {
			biz.selectList();
			return "redirect:list.do";
		}
		else {
			return "redirect:insertform.do";
		}
		
	}
	
	@RequestMapping("/updateform.do")
	public String updateForm(Model model, int myno) {
		
		logger.info("UPDATE FORM");
		BoardDto res = biz.selectOne(myno);
		model.addAttribute("dto", res);
		
		return "mvcupdate";
		
	}
	
	@RequestMapping("/update.do")
	public String update(int myno, String mytitle, String mycontent) {
		logger.info("UPDATE");
	
		BoardDto dto = new BoardDto();
		dto.setMyno(myno);
		dto.setMytitle(mytitle);
		dto.setMycontent(mycontent);
		
		int res = biz.update(dto);
		if(res>0) {
			return "redirect:detail.do?myno="+dto.getMyno();
		}
		else {
			return "redirect:updateform.do?myno="+dto.getMyno();
		}
		
		
	}
	
	//삭제
	@RequestMapping("/delete.do")
	public String delete(int myno) {
		logger.info("DELETE");
		
		int res = biz.delete(myno);
		if(res>0) {
			return "redirect:list.do";
		}
		else {
			return "redirect:detail.do?myno="+myno;
		}
		
	}
}


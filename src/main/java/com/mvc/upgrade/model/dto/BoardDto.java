package com.mvc.upgrade.model.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



// =@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BoardDto {
	private int myno;
	private String myname;
	private String mytitle;
	private String mycontent;
	private Date mydate;
	

}

package com.mvc.file.common;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UploadFile {
	private String filename;
	private String desc;
	private MultipartFile mpfile;
	

}

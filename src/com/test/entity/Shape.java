package com.test.entity;

public class Shape {
	public String title;
	public int width;
	public int height;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
	public Shape(){}
	
	
	public Shape(String title, int width, int height) {
		super();
		this.title = title;
		this.width = width;
		this.height = height;
	}
	


	public void viewSize() {
		
	}
	
	

}

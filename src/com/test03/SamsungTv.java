package com.test03;

import org.springframework.stereotype.Component;

@Component("sam")
public class SamsungTv implements TV {

	@Override
	public void powerOn() {
		System.out.println("samsung tv power on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("samsung tv power off");
	}

	@Override
	public void volUp() {
		System.out.println("samsung tv vol up");
		
	}

	@Override
	public void volDown() {
		System.out.println("samsung tv vol down");
		
	}

}

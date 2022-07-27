package com.example.nation;

import org.springframework.stereotype.Component;

@Component("en")
public class English implements IEuropean {

	@Override
	public void sayHello() {
		System.out.println("Hello");
	}

}

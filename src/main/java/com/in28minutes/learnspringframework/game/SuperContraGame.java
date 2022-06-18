package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SuperContraGame implements GamingConsole{

	public void up()
	{
		System.out.println("supercontra up");
	}
	
	public void down()
	{
		System.out.println("supercontra down");
	}
	
	public void left()
	{
		System.out.println("supercontra left");
	}
	
	public void right()
	{
		System.out.println("supercontra right");
	}
	
	
}

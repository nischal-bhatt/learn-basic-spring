package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	//game runner class is loosely coupled to whichever game it is running
	@Autowired
	private GamingConsole game;
	 public GameRunner(GamingConsole game) {
	   this.game= game;
	}
	 
	 public void runGame()
	 {
		 game.up();
		 game.down();
		 game.left();
	 }

	
}

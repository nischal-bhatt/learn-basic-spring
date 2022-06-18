package com.in28minutes.learnspringframework.game;

public class GameRunner {

	//game runner class is loosely coupled to whichever game it is running
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

package com.in28minutes.learnspringframework.game;

public class GameRunner {

	//private MarioGame game;
	  private SuperContraGame game;
	//game runner class is tightly coupled to the game type
	 public GameRunner(SuperContraGame game) {
	   this.game= game;
	}
	 
	 public void runGame()
	 {
		 game.up();
		 game.down();
		 game.left();
	 }

	
}

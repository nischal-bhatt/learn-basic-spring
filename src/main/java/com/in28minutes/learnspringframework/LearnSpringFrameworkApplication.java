package com.in28minutes.learnspringframework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//this project is loose coupling level 1
		//no changes needed in gamerunner class
		SuperContraGame game = new SuperContraGame();
		MarioGame game2 = new MarioGame();
		GameRunner runner = new GameRunner(game2);
		runner.runGame();
	}

}

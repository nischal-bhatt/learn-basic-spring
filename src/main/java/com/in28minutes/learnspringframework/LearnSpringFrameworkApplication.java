package com.in28minutes.learnspringframework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
	    // comment the above coz in this branch - we want to see the problem that spring framework solves
		//this is simple java- nothing spring to this
		
		//MarioGame game = new MarioGame();
		
		SuperContraGame game = new SuperContraGame();
		
		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}

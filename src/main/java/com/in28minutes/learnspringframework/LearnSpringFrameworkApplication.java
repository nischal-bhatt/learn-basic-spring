package com.in28minutes.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.runGame();
		
	}

}

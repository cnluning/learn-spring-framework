package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		PacManGame game = new PacManGame();		
		
//		GamingConsole game = new MarioGame();
//		GameRunner runner = new GameRunner(game);
		
		ConfigurableApplicationContext context 
		= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.run();
	}

}

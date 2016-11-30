package com.soundsystem.depended;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class DependedCDPlayerConfig {

	@Bean
	public DependedCDPlayer cdPlayer(CompactDiscForDependency ss ) {
		return new DependedCDPlayer(ss);
	}
	
}

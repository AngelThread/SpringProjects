package com.soundsystem.depended;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependedCDPlayerConfig {

	@Bean
	public DependedCDPlayer cdPlayer() {
		return new DependedCDPlayer(sgtPeppers());
	}
	@Bean
	public CompactDiscForDependency sgtPeppers() {
	return new SgtPeppersForDependency();
	}
}

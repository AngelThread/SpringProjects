package com.soundsystem.depended;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependedCDConfig {
	@Bean
	public CompactDiscForDependency sgtPeppers() {
	return new SgtPeppersForDependency();
	}
}

package com.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.soundsystem.depended.CompactDiscForDependency;
import com.soundsystem.depended.SgtPeppersForDependency;

@Configuration
@ComponentScan(basePackages={"com.soundsystem","com.soundsystem.autowiring"})
public class CDPlayerConfig {
	@Bean
	public CompactDisc sgtPeppers() {
	return new  SgtPeppers();
	}
}

package com.soundsystem.advanceWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.soundsystem.advanceWiring" })
public class CDPlayerConfigAdvance {
	/*@Bean
	@Conditional(MagicExistCondition.class)
	public MagicBean magicBean() {
		return new MagicBean();

	}*/
}

package com.soundsystem.depended;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
@Import({DependedCDConfig.class,DependedCDPlayerConfig.class})

public class SoundSystemConfig {

}
